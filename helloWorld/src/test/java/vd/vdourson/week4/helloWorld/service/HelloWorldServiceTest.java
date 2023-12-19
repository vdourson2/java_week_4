package vd.vdourson.week4.helloWorld.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldServiceTest {

	@Test
	public void NLHello() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	    HelloWorldService helloWorld = context.getBean(HelloWorldService.class);
		helloWorld.setLanguage("NL");
		assertEquals("Hallo Wereld met Spring!",helloWorld.hello());
	}
	
	@Test
	public void ENHello() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	    HelloWorldService helloWorld = context.getBean(HelloWorldService.class);
		helloWorld.setLanguage("EN");
		assertEquals("Hello World in Spring!",helloWorld.hello());
	}
	
	@Test
	public void nativeHello() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	    HelloWorldService helloWorld = context.getBean(HelloWorldService.class);
		helloWorld.setLanguage("native");
		assertEquals("Bonjour le monde avec Spring!",helloWorld.hello());
	}
	
	@Test
	public void GERHello() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	    HelloWorldService helloWorld = context.getBean(HelloWorldService.class);
		helloWorld.setLanguage("GER");
		assertEquals("Hallo Welt mit Schpring!",helloWorld.hello());
	}

}
