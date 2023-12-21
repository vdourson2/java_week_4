package vd.vdourson.week4.hospitalRegistrationPortal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import vd.vdourson.week4.hospitalRegistrationPortal.service.RegisterService;
import vd.vdourson.week4.hospitalRegistrationPortal.service.ReportService;

/**
 * Create a command-line driven program : 
 * repeatedly prompt the user for a command input, and
 * based on the user's choice, execute either the register or report command
 */
@Configuration
@ComponentScan(basePackages = {"vd.vdourson.week4.hospitalRegistrationPortal"})
public class App 
{
    public static void main( String[] args ) {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
    	RegisterService registerService = context.getBean(RegisterService.class);
    	ReportService reportService = context.getBean(ReportService.class);
    	
    	try (InputStreamReader isr = new InputStreamReader(System.in); BufferedReader br = new BufferedReader(isr)){
			String command;
			do {
				System.out.println("register or report or exit?");
				command = br.readLine();	
				if (command.equals("register")) {
					registerService.createVisit();
				} else if (command.equals("report")) {
					reportService.printReport();
				} else if (command.equals("exit")) {
					return;
				} else {
					System.out.println("Invalid request");
					continue;
				}
			} while (!command.equals("exit"));
		} 
    	catch (IOException e) {
			System.out.println("Failed to read stdin : " + e);
		}
    }
}
