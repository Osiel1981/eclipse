package entities;

public class Rectangule {
	public double Widht;
	public double Height;
	public double Area() {
		return Height*Widht;		
	}
	public double Perimeter() {
		return (Height * 2) + (Widht * 2); 
	}
	public double Diagonal() {
		return Math.sqrt((Math.pow(Height,2)+(Math.pow(Widht, 2))));
	}
	public String toString() {
		return "AREA = " + String.format("%.2f%n", Area()) + 
				"PERIMETER = " + String.format("%.2f%n", Perimeter()) +
				"DIAGONAL = " + String.format("%.2f%n", Diagonal());
	}
}
