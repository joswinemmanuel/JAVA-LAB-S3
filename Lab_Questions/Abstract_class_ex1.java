abstract class GeometricShapes {
	abstract void numberOfSides();
	abstract void SumOfAngles();
}


class Square extends GeometricShapes {
	int n;
	Square(int n) {
		this.n = n;
	}

	void numberOfSides() {
		System.out.println("No of side of Square : " + n);
	}

	void SumOfAngles() {
		System.out.println("Sum of angles of Square : " + 360);
	}
}

class Triangle extends GeometricShapes {
	int n;
	Triangle(int n) {
		this.n = n;
	}
	
	void numberOfSides() {
		System.out.println("No of side of Triangle : " + n);
	}

	void SumOfAngles() {
		System.out.println("Sum of angles of triangle : " + 180);
	}
}

class Hexagon extends GeometricShapes {
	int n;
	Hexagon(int n) {
		this.n = n;
	}
	
	void numberOfSides() {
		System.out.println("No of side of Hexagon : " + n);
	}

	void SumOfAngles() {
		System.out.println("Sum of angles of Hexagon : " + 720);
	}
}

public class test  {
	public static void main(String[] args) {
		Square s = new Square(4);
		Triangle t = new Triangle(3);
		Hexagon h = new Hexagon(6);
		
		s.numberOfSides();
		t.numberOfSides();
		h.numberOfSides();
		
		s.SumOfAngles();
		t.SumOfAngles();
		h.SumOfAngles();
	}
}

/*
No of side of Square : 4
No of side of Triangle : 3
No of side of Hexagon : 6
Sum of angles of Square : 360
Sum of angles of triangle : 180
Sum of angles of Hexagon : 720
*/
