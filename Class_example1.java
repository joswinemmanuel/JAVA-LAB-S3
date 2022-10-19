class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int Area() {
        return length*breadth;
    }
}

class Class_example1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(20, 10);
        System.out.println("Area : " + r1.Area());
    }
}

// Area : 200