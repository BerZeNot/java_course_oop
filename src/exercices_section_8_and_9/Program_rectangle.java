package exercices_section_8_and_9;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program_rectangle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double rectangleWidth, rectangleHeight;
		
		System.out.println("Enter rectangle width and height:");
		rectangleWidth= sc.nextDouble();
		rectangleHeight = sc.nextDouble();
		
		Rectangle rec = new Rectangle(rectangleWidth, rectangleHeight);
		System.out.printf("AREA: = %.2f\n", rec.getArea());
		System.out.printf("PERIMETER: = %.2f\n", rec.getPerimeter());
		System.out.printf("DIAGONAL: = %.2f\n", rec.getDiagonal());
		
		sc.close();
	}

}
