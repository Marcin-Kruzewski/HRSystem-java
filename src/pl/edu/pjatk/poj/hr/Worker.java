package pl.edu.pjatk.poj.hr;

import java.util.List;

public class Worker extends Employer{
	private Double perHour;
	private int countOfHours;
	private int countOfExtensiveHours;
	private Menager menager;
	private List<String> skills;
	public Double getPerHour() {
		return perHour;
	}
	public void setPerHour(Double perHour) {
		this.perHour = perHour;
	}
	public int getCountOfHours() {
		return countOfHours;
	}
	public void setCountOfHours(int countOfHours) {
		this.countOfHours = countOfHours;
	}
	public int getCountOfExtensiveHours() {
		return countOfExtensiveHours;
	}
	public void setCountOfExtensiveHours(int countOfExtensiveHours) {
		this.countOfExtensiveHours = countOfExtensiveHours;
	}
	public Menager getMenager() {
		return menager;
	}
	public void setMenager(Menager menager) {
		this.menager = menager;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	@Override
	public double  getMonthSalary(){
		return (countOfHours + (1.5 * countOfExtensiveHours)) * perHour;
	}
	@Override
	public String toString() {
		return "Worker [perHour=" + perHour + ", countOfHours=" + countOfHours
				+ ", countOfExtensiveHours=" + countOfExtensiveHours
				+ ", menager=" + menager + ", skills=" + skills + "]" + super.toString();
	}
}
