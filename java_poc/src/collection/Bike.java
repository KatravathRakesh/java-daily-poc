package collection;

public class Bike {

	String model;
	String brand;
	double price;
	
	@Override
	public String toString() {
		return "Bike [model=" + model + ", brand=" + brand + ", price=" + price + "]";
	}

	
	public Bike(String model, String brand, double price) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
	}
	
	
	
	
}
