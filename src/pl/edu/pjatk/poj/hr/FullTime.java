package pl.edu.pjatk.poj.hr;

public abstract class FullTime extends Employer {
	protected double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getMonthSalary(){
		return salary;
	}

	@Override
	public String toString() {
		return "FullTime [salary=" + salary + "]" + super.toString();
	}
	
}
