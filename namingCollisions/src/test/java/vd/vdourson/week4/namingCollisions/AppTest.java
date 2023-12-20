package vd.vdourson.week4.namingCollisions;

import static org.junit.Assert.assertEquals;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
//    @Rule
//    public final TextFromStandardInputStream systemInMock = TextFromStandardInputStream.emptyStandardInputStream();
    
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
    
    @Test
    public void treatInputTestSayHello() {
    	App.treatInput("sayHello");
    	assertEquals("Hello world", systemOutRule.getLog().trim());
    }
    
    @Test
    public void treatInputTestGetTime() {
    	App.treatInput("getTime");
    	LocalTime time = LocalTime.now();
    	DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm:ss");
    	assertEquals("Current time is : " + time.format(formatTime), systemOutRule.getLog().trim());
    }
    
    @Test
    public void treatInputTestExit() {
    	App.treatInput("exit");
    	assertEquals("", systemOutRule.getLog().trim());
    }
    
    @Test
    public void treatInputTestInvalid() {
    	App.treatInput("turlututu");
    	assertEquals("Invalid request", systemOutRule.getLog().trim());
    }
}
