class Room {
    int length, width;
    
    Room(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int Area() {
        return length*width;
    }
}

class BedRoom extends Room{
    int height;

    BedRoom(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }

    int Volume() {
        return length*width*height;
    }
}

class Day5_2_Simple_inheritance {
    public static void main(String[] args) {
        BedRoom room1 = new BedRoom(30, 20, 25);
        System.out.println("Area : " + room1.Area() + "\n");
        System.out.println("Volume : " + room1.Volume());
    }
}

/*
Area : 600
Volume : 15000
*/