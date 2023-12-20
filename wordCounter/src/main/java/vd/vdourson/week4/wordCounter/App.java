package vd.vdourson.week4.wordCounter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 
 *
 */
@Configuration
@ComponentScan(basePackages = {"vd.vdourson.week4.wordCounter"})
public class App {
	
    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        WordCount wordCount = context.getBean(WordCount.class);
        System.out.println("Enter a sentence :");
        String inputLine = readCl();
        Map<String, Integer> wordCountMap = wordCount.count(inputLine);
        printTable(wordCountMap);
        
    }
    
    /* This method reads a single line of input from the command line,
     * and returns the line as a String.*/
    public static String readCl() {
    	String inputLine = "";
	    try (InputStreamReader isr = new InputStreamReader(System.in);
		    		BufferedReader br = new BufferedReader(isr)) {
				inputLine = br.readLine();			
		 } 	
		 catch (IOException e) {
			 System.out.println("Failed to read stdin : " + e);
		 }	
	    return inputLine;
    }
    
    public static void printTable(Map<String, Integer> wordCountMap) {
    	System.out.printf("--------------------------%n");
    	System.out.printf("| %-14s | %-5s |%n", "Word", "Count");
    	System.out.printf("--------------------------%n");
    	wordCountMap.forEach((word, count) -> {
    		System.out.printf("| %-14s | %-5d |%n", word, count);
    	});
    	System.out.printf("--------------------------%n");
    }
}

