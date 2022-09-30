import java.util.Scanner;

public class Day4_First_last_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        char c;
        int counter=0;

        System.out.print("Enter the string : ");
        str = sc.nextLine();
        System.out.print("Enter the character : ");
        c = sc.next().charAt(0);

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == c)
                counter++;
        }

        System.out.println(c + " count : " + counter);
    }
}

/*
Enter the string : Joswin Emmanuel
Enter the character : m
m count : 2
*/