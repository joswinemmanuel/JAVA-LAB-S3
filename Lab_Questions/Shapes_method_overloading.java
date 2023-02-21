class ShapeArea {
	void getArea(float a) {
		System.out.println("Area of circle : " + ((22/7.0) * a * a));
	}
	
	void getArea(int a) {
		System.out.println("Area of square : " + a*a);
	}
	
	void getArea(int a, int b) {
		System.out.println("Area of rectangle : " + a*b);
	}
	
	void getArea(float a, float b) {
		System.out.println("Area of triangle : " + ((1/2.0) * a * b));
	}
	
	void getArea(int a, int b, int h) {
		System.out.println("Area of trapezium : " + ((h/2) * (a+b)));
	}
}

public class test  {
	public static void main(String[] args) {
		ShapeArea shape = new ShapeArea();
		shape.getArea((float) 5);
		shape.getArea(5);
		shape.getArea(5, 10);
		shape.getArea((float) 5, (float) 10);
		shape.getArea(5, 10, 5);
	}
}

/*
Area of circle : 78.57142857142857
Area of square : 25
Area of rectangle : 50
Area of triangle : 25.0
Area of trapezium : 30
*/
