package vd.vdourson.week4.namingCollisions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


// Small command-line tool using Maven and the Spring framework
@Configuration
@ComponentScan(basePackages = { "vd.vdourson.week4.namingCollisions" })
public class App {
	public static void main(String[] args) {
		
		try (InputStreamReader isr = new InputStreamReader(System.in); BufferedReader br = new BufferedReader(isr)) {
			String inputLine;
			do {
				System.out.println("sayHello, getTime or exit ?");
				inputLine = br.readLine();
				treatInput(inputLine);
			} while (!inputLine.equals("exit"));
		} catch (IOException e) {
			System.out.println("Failed to read stdin : " + e);
		}
	}
	
	// This method receives as argument the command entered into the command-line and executes it
	public static void treatInput(String inputLine) {
		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		CommandInterface command;
		if (inputLine.equals("sayHello")) {
			command = context.getBean(SayHello.class);
		} else if (inputLine.equals("getTime")) {
			command = context.getBean(GetTime.class);
		} else if (inputLine.equals("exit")) {
			return;
		} else {
			System.out.println("Invalid request");
			return;
		}
		command.execute();	
	}
};