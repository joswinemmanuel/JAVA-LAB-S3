class Car {
	private String name;
	private int price;
	
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return name + " costs " + price;
	}
}

public class test  {
	public static void main(String[] args) {
		Car c = new Car("BMW", 999999);
		System.out.println(c);
		
		System.out.println(c.getName());
		
		c.setName("Bugatti");
		
		System.out.println(c);	
	}
}
