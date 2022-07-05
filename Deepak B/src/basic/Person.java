package basic;

import java.util.Date;

public class Person {
	private String name = null;
	private String address = null;
	private Date dateOfBirth = null;
	private String n;
	
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String a) {
		
		address = a;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth() {
	Date d = null;
	this.dateOfBirth = d;
	}
}

