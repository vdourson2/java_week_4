package vd.vdourson.week4.hospitalRegistrationPortal.entity;

public class Visit {
	private String name;
	private String lastName;
	private	String objectOfVisit;
	private long visitTimestamp;
	
	public long getVisitTimestamp() {
		return visitTimestamp;
	}
	public void setVisitTimestamp(long visitTimestamp) {
		this.visitTimestamp = visitTimestamp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getObjectOfVisit() {
		return objectOfVisit;
	}
	public void setObjectOfVisit(String objectOfVisit) {
		this.objectOfVisit = objectOfVisit;
	}
	
	
}
