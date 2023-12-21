package vd.vdourson.week4.hospitalRegistrationPortal.service;

import java.io.IOException;
import java.time.Instant;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vd.vdourson.week4.hospitalRegistrationPortal.entity.Visit;

// Component responsible for handling the registration process.
@Service
public class RegisterService {
	
	@Autowired
	private ReportService reportService;
	
	// Prompt the user to enter their name, last name and visit object,
	// and add these informations to the repository, adding the timestamp.
	public void createVisit() {
		Visit visit = new Visit();
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name");
		String name = scanner.nextLine();
		visit.setName(name);
		
		System.out.println("What is your last name");
		String lastName = scanner.nextLine();
		visit.setLastName(lastName);
		
		System.out.println("Reason of your visit : ");
		System.out.println("- Doctor Abibi : enter A");
		System.out.println("- Docotor Bibobo : enter B");
		System.out.println("- Visit a patient : enter P");
		String objectOfVisit = scanner.nextLine();
		visit.setObjectOfVisit(objectOfVisit);
		
		Instant instant = Instant.now();
		visit.setVisitTimestamp(instant.getEpochSecond());
		
		reportService.addVisit(visit);
	}

	public ReportService getReportService() {
		return reportService;
	}

	public void setReportService(ReportService reportService) {
		this.reportService = reportService;
	}
}
