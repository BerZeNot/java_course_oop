package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public double totalValueInStock() {
		return this.price * this.quantity;
	}
	
	public void addProducts(int quantity) {
		if(quantity > 0)
			this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		if(quantity > 0 && quantity <= this.quantity)
			this.quantity -= quantity;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int getQuantityInStock() {
		return this.quantity;
	}
	
	public String toString() {
		return this.name
				+ ", $ "
				+ String.format("%.2f", this.price)
				+ ", "
				+ this.quantity
				+ " units, Total: $ "
				+ String.format("%.2f", this.totalValueInStock());
	}
}
