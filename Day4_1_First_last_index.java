import java.util.Scanner;

public class Day4_First_last_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        char check;

        System.out.print("Enter the string : ");
        str = sc.nextLine();
        System.out.print("Enter the character to check index : ");
        check = sc.next().charAt(0); 

        System.out.println("First occurance : " + str.indexOf(check));
        System.out.println("Last occurance : " + str.lastIndexOf(check));

    }
}

/*
Enter the string : Hello World
Enter the character to check index : l
First occurance : 2
Last occurance : 9
*/
