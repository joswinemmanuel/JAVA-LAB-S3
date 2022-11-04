public class Day6_4_Interface {
    public static void main(String[] args) {

        Rectangle shape1 = new Rectangle();
        shape1.getData(20, 10);
        shape1.findArea();

        Square shape2 = new Square();
        shape2.getData(10, 10);
        shape2.findArea();
    }
}

class Shapes {
    int length, breadth;
    void getData(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

interface Area {
    void findArea();
}

class Rectangle extends Shapes implements Area {
    public void findArea() {
        System.out.println("Area of Rectangle : " + length * breadth);
    }
}

class Square extends Shapes implements Area {
    public void findArea() {
        System.out.println("Area of Square : " + length * breadth);
    }
}

/*
Area of Rectangle : 200
Area of Square : 100
*/  
