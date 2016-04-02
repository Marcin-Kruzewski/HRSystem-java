package pl.edu.pjatk.poj.hr;

public class Menager extends FullTimeWithBonus {
	
	public static final double MENAGER_BONUS = 100;
	
	private String phone;
	private String cellphone;
	private String room;
	private String department;
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getMonthSalary(){
		return super.getMonthSalary() + MENAGER_BONUS;
	}
	@Override
	public String toString() {
		return "Menager [phone=" + phone + ", cellphone=" + cellphone
				+ ", room=" + room + ", department=" + department + "]" + super.toString();
	}
}
