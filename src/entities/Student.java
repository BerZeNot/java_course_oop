package entities;

public class Student {
	private String name;
	private double note1;
	private double note2;
	private double note3;
	
	public Student(String name, double note1, double note2, double note3) {
		this.name = name;
		this.note1 = note1;
		this.note2 = note2;
		this.note3 = note3;
	}
	
	public double finalGrade() {
		return this.note1+this.note2+this.note3;
	}
	
	public String passed() {
		if(this.finalGrade() >= 60) {
			return "PASS";
		}
		else {
			return String.format("FAILED\nMISSING %.2f POINTS\n", this.missingPoints());
		}
	}
	
	public double missingPoints() {
		return 60-this.finalGrade();
	}
	
	public String toString() {
		return String.format("Name: %s\nNote 1: %.2f\nNote 2: %.2f\nNote 3: %.2f\n",
				this.name, 
				this.note1, 
				this.note2,
				this.note3);
	}
}
