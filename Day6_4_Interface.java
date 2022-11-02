public class Day6_4_Interface {
    public static void main(String[] args) {
        PrintData obj1 = new PrintData();
        obj1.print_hello();
    }
}

interface Display {
    void print_hello();
}

class PrintData implements Display {
    public void print_hello() {
        System.out.println("Hello");
    }
}

// Hello