package exercices_section_8_and_9;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program_students {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		String name = sc.nextLine();
		double note1 = sc.nextDouble();
		double note2 = sc.nextDouble();
		double note3 = sc.nextDouble();
		
		Student std1 = new Student(name, note1, note2, note3);
		
		System.out.println("FINAL GRADE = " + std1.finalGrade());
		System.out.println(std1.passed());
		
		sc.close();
	}
}
