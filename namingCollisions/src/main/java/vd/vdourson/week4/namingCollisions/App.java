package vd.vdourson.week4.namingCollisions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		CommandInterface command;
		try (InputStreamReader isr = new InputStreamReader(System.in);
		    	BufferedReader br = new BufferedReader(isr)) {
			String inputLine;
			do {
				System.out.println("sayHello, getTime or exit ?");
				inputLine = br.readLine();
				if (inputLine.equals("sayHello")) {
					command = context.getBean(SayHello.class);
				} 
				else if (inputLine.equals("getTime")) {
					command = context.getBean(GetTime.class);
				}
				else if (inputLine.equals("exit")){
					continue;
				}
				else {
					System.out.println("Invalid request");
					continue;
				}
				command.execute();
			}
			while (!inputLine.equals("exit"));
		 } 	
		 catch (IOException e) {
			 System.out.println("Failed to read stdin : " + e);
		 }	
	}
}
;