class Car {
	private String name;
	private int price;
	
	public Car() {}
	
	public Car(Car c) {
		this.copy(c);
	}
	
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void copy(Car c) {
		this.name = c.name;
		this.price = c.price;
	}
	
	public String toString() {
		return name + " costs " + price;
	}
}

public class test  {
	public static void main(String[] args) {
		Car c1 = new Car("BMW", 999999);
		System.out.println(c1);		
		
		Car c2 = new Car();
		c2.copy(c1);
		System.out.println(c2);	
		
		Car c3 = new Car(c1);
		System.out.println(c3);
	}
}
