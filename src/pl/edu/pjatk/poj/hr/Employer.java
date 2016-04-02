package pl.edu.pjatk.poj.hr;

import java.util.Date;

public abstract class Employer {
	private String name;
	private String surname;
	private Date birdthDate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Date getBirdthDate() {
		return birdthDate;
	}
	public void setBirdthDate(Date birdthDate) {
		this.birdthDate = birdthDate;
	}
	public abstract double getMonthSalary();
	@Override
	public String toString() {
		return "Employer [name=" + name + ", surname=" + surname
				+ ", birdthDate=" + birdthDate + "]";
	}
}
