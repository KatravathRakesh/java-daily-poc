package collection;


public class Mobile  implements Comparable<Mobile>{
	
	String brand;
	String model;
	double price;
	
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", model=" + model + ", price=" + price + "]";
	}
	
	public Mobile(String brand, String model, double price) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	

	@Override
	public int compareTo(Mobile o) {
//		if(this.price < o.price) {
//			return -1;
//		}else if(this.price > o.price) {
//			return 1;
//		}else {
//			return 0;
//		}
		return this.brand.compareTo(o.brand);
	}



	



	

}
