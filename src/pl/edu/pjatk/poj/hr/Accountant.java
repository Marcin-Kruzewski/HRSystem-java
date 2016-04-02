package pl.edu.pjatk.poj.hr;

public class Accountant extends FullTimeWithBonus {
	private Menager menager;
	private String phone;
	private String room;
	
	public Menager getMenager() {
		return menager;
	}
	public void setMenager(Menager menager) {
		this.menager = menager;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	@Override
	public String toString() {
		return "Accountant [menager=" + menager + ", phone=" + phone
				+ ", room=" + room + "]" + super.toString();
	}
	
}
