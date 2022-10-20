class Area {
	void area(int x) {
		System.out.println("Area of Square : " + x*x + " sq units");
	}
	
	void area(int l, int b) {
		System.out.println("Area of rectangle : " + l*b + " sq units");
	}
	
	void area(double r) {
		System.out.println("Area of circle : " + (22/7.0)*r*r + " sq units");
	}
}

public class Day5_4_Method_overloading {
	public static void main(String[] args) {
		Area a1 = new Area();
		a1.area(10);
		a1.area(10, 5);
		a1.area(8.5d);
	}
}

/*
Area of Square : 100 sq units
Area of rectangle : 50 sq units
Area of circle : 227.07142857142858 sq units
*/