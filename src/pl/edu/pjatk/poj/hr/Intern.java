package pl.edu.pjatk.poj.hr;

public class Intern extends Employer {
	
	public static final double INTERN_SALARY = 600;
	
	private Employer supervisor;
	private boolean ifSalary;
	
	public Employer getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(Employer supervisor) {
		this.supervisor = supervisor;
	}
	public boolean isIfSalary() {
		return ifSalary;
	}
	public void setIfSalary(boolean ifSalary) {
		this.ifSalary = ifSalary;
	}
	@Override
	public double getMonthSalary(){
		return ifSalary ? INTERN_SALARY : 0;
	}
	@Override
	public String toString() {
		return "Intern [supervisor=" + supervisor + ", ifSalary=" + ifSalary
				+ "]" + super.toString();
	}
}
