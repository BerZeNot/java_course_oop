package entities;

public class Employee {
	private String name;
	private double grossSalary;
	private double tax;
	
	public Employee(String name, double salary, double tax) {
		this.name = name;
		this.grossSalary = salary;
		this.tax = tax;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getNetSalary() {
		return this.grossSalary - this.tax;
	}
	
	public void increaseSalary(double percentage) {
		if(percentage > 0) {
			this.grossSalary += this.grossSalary * (percentage/100);
		}
	}
	
	public String toString() {
		return String.format("Employee: %s, $ %.2f\n", this.name, this.getNetSalary());
	}
}
