package exercices_section_8_and_9;

import java.util.Scanner;

import entities.Product;

import java.util.Locale;

public class Product_aplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String productName;
		double productPrice;
//		int quantityInStock;
		
		Product p1;
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		productName = sc.next();
		
		System.out.print("Price: ");
		productPrice= sc.nextDouble();
		
//		System.out.print("Quantity in stock: ");
//		quantityInStock = sc.nextInt();
		
		p1 = new Product(productName, productPrice/*, quantityInStock*/);
		 
		System.out.printf("Product data: %s\n", p1);
		
		System.out.print("\nEnter the number of products to be added in stock: ");
		int quantityOfProductsToAdd = sc.nextInt();
		p1.addProducts(quantityOfProductsToAdd);
		
		System.out.printf("\nUpdated data: %s\n", p1);
		
		System.out.print("\nEnter the number of products to be removed in stock: ");
		int quantityOfProductsToRemove = sc.nextInt();
		p1.removeProducts(quantityOfProductsToRemove);
		
		System.out.printf("\nUpdated data: %s\n", p1);
		sc.close();
	}

}
