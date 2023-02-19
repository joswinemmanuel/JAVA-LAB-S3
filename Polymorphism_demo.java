class Vehicle {
	public void go() {
		System.out.println("VEHICLE started");
	}
}

class Car extends Vehicle {
	public void go() {
		System.out.println("CAR started");
	}
}

class Bike extends Vehicle {
	public void go() {
		System.out.println("BIKE started");
	}
}

class Truck extends Vehicle {
	public void go() {
		System.out.println("TRUCK started");
	}
}

public class test  {
	public static void main(String[] args) {
		Car c = new Car();
		Bike b = new Bike();
		Truck t = new Truck();
		Vehicle[] v = {c, b, t};
		for(Vehicle i : v) {
			i.go();
		}
	}
}

/*
CAR started
BIKE started
TRUCK started
*/
