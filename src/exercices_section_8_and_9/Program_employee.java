package exercices_section_8_and_9;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program_employee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		double grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		double tax = sc.nextDouble();
		
		Employee emp1 = new Employee(name, grossSalary, tax);
		System.out.println("\n"+emp1);
		
		System.out.print("Which percentage to increase salary? ");
		double percentageToIncrease = sc.nextDouble();
		emp1.increaseSalary(percentageToIncrease);
		
		System.out.printf("\nUpdated data: %s, $ %.2f", emp1.getName(), emp1.getNetSalary());
		
		sc.close();
	}

}
