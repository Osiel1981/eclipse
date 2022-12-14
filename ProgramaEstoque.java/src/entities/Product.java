package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	public Product(String name, double price, int quantity) {
		this.setName(name);
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.setName(name);
		this.price = price;	
	}
	
	public double valueTotalIn() {
		return price * quantity;
	}
	public void AddProducts(int quantity) {
		this.quantity += quantity;
	}
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
			+ ", $ " 
			+ String.format("%.2f", price) 
			+ ", " 
			+quantity
			+  " units, Total: $ "
			+ String.format("%.2f",valueTotalIn());
	}

	public void setName(String name) {
		this.name = name;
	}

}
