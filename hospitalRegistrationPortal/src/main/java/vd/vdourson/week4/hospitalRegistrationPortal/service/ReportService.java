package vd.vdourson.week4.hospitalRegistrationPortal.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import vd.vdourson.week4.hospitalRegistrationPortal.entity.Visit;


// Component responsible for generating and displaying the visit report.
@Service
public class ReportService {

	private List<Visit> visits = new ArrayList<>();
	
	public void addVisit(Visit visit) {
		visits.add(visit);
		System.out.println("Visit added");
	}
	
	public void printReport() {
		System.out.printf("---------------------------------------------------------------------%n");
    	System.out.printf("| %-14s | %-14s | %-14s | %-14s |%n", "Name", "LastName", "Visit object", "Timestamp");
    	System.out.printf("---------------------------------------------------------------------%n");
    	visits.forEach((visit) -> {
    		System.out.printf("| %-14s | %-14s | %-14s | %-14s |%n", visit.getName(), visit.getLastName(), visit.getObjectOfVisit(), visit.getVisitTimestamp());
    	});
    	System.out.printf("---------------------------------------------------------------------%n");
	}
}
