package entities;

public class Rectangle {
	
	private double width;
	private double heigth;
	
	public Rectangle(double width, double heigth) {
		this.width = width;
		this.heigth = heigth;
	}
	
	public double getArea() {
		return this.width*this.heigth;
	}
	
	public double getPerimeter() {
		return (this.width*2 + this.heigth*2);
	}
	
	public double getDiagonal() {
		return Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.heigth, 2));
	}
}
