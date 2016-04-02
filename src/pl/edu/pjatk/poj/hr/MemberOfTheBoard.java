package pl.edu.pjatk.poj.hr;

public class MemberOfTheBoard extends FullTime {
	
	public static final double BOARD_MEETING_BONUS = 500;
	
	private Employer assistent;
	private int numberOfBoardMeetings;
	
	public Employer getAssistent() {
		return assistent;
	}
	public void setAssistent(Employer assistent) {
		this.assistent = assistent;
	}
	public int getNumberOfBoardMeetings() {
		return numberOfBoardMeetings;
	}
	public void setNumberOfBoardMeetings(int numberOfBoardMeetings) {
		this.numberOfBoardMeetings = numberOfBoardMeetings;
	}
	@Override
	public double getMonthSalary() {
		return super.getMonthSalary() + numberOfBoardMeetings * BOARD_MEETING_BONUS;
	}
	@Override
	public String toString() {
		return "MemberOfTheBoard [assistent=" + assistent
				+ ", numberOfBoardMeetings=" + numberOfBoardMeetings + "]" + super.toString();
	}
}
