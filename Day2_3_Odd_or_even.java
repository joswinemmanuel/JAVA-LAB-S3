import java.util.Scanner;

public class Day2_3_Odd_or_even {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Enter the number : ");
        num = input.nextInt();

        if(num%2 == 0)
            System.out.println(num + " is EVEN");
        else
            System.out.println(num + " is ODD");
    }
}

/*
Enter the number : 10
10 is EVEN
*/