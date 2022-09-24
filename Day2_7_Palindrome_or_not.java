import java.util.Scanner;

public class Day2_7_Palindrome_or_not {
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

        if(rev == num)
            System.out.println(num + " is a PALINDROME");
        else
            System.out.println(num + " is not a PALINDROME");
    }
}

/*
Enter the number : 12121
12121 is a PALINDROME
*/