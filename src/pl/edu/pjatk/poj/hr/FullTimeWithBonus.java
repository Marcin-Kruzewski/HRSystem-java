package pl.edu.pjatk.poj.hr;

public abstract class FullTimeWithBonus extends FullTime {
	private int bonusPercentage;

	public int getBonusPercentage() {
		return bonusPercentage;
	}

	public void setBonusPercentage(int bonusPercentage) {
		this.bonusPercentage = bonusPercentage;
	}
	
	public double getMontsalary(){
		return (1+bonusPercentage)*getSalary();
	}
	@Override
	public String toString() {
		return "FullTimeWithBonus [bonusPercentage=" + bonusPercentage + "]" + super.toString();
	}
}
