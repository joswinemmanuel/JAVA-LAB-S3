public class Day6_1_Abstract_Class_ex1 {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5);
        s1.area();

        s1 = new Rectangle(10, 5);
        s1.area();

        s1 = new Square(5);
        s1.area();
    }
}

abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        System.out.println("Circle area : " + (22/7.0)*radius*radius);
    }
}

class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area() {
        System.out.println("Rectangle area : " + length*breadth);
    }
}

class Square extends Shape {
    int side;

    Square(int side) {
        this.side = side;
    }

    void area() {
        System.out.println("Square area : " + side*side);
    }
}

/*
Circle area : 95.07142857142857
Rectangle area : 50
Square area : 25
*/
