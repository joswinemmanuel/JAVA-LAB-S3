import java.util.Scanner;

public class Day2_8_Reverse_of_number {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num, rev=0, p;

        System.out.print("Enter the number : ");
        num = input.nextInt();

        p = num;
        while(p != 0){
            rev = (rev*10) + (p%10);
            p /= 10;
        }

        System.out.println("Reverse of " + num + " is " + rev);
    }
}

/*
Enter the number : 12345
Reverse of 12345 is 54321
*/