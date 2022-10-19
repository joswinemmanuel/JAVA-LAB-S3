class Day5_3_Multiple_inheritance {
    public static void main(String[] args) {
        BedRoom b_room1 = new BedRoom(30, 20, 25, 2);
        System.out.println("Area of room : " + b_room1.Area());
        System.out.println("Volume of room : " + b_room1.Volume() + "\n");
        System.out.println("Room specifications are : ");
        b_room1.Specify();
    }
}

class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int Area() {
        return length * breadth;
    }
}

class Room extends Rectangle {
    int height;

    Room(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }

    int Volume() {
        return length * breadth * height;
    }
}

class BedRoom extends Room {
    int bed;

    BedRoom(int length, int breadth, int height, int bed) {
        super(length, breadth, height);
        this.bed = bed;
    }

    void Specify() {
        System.out.println("Area : " + Area());
        System.out.println("Volume : " + Volume());
        System.out.println("Bed count : " + bed);
    }
}

/*
Area of room : 600
Volume of room : 15000

Room specifications are :
Area : 600
Volume : 15000
Bed count : 2
*/