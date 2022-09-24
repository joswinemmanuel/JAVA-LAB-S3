import java.util.Scanner;

public class Day2_2_Largest_of_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("Enter number 1 : ");
        num1 = input.nextInt();
        System.out.print("Enter number 2 : ");
        num2 = input.nextInt();
        System.out.print("Enter number 3 : ");
        num3 = input.nextInt();

        if(num1>num2 && num1>num3)
            System.out.println("Largest : " + num1);
        else if(num2 > num3)
            System.out.println("Largest : " + num2);
        else
            System.out.println("Largest : " + num3);
    }
}

/*
Enter number 1 : 10
Enter number 2 : 99
Enter number 3 : 11
Largest : 99
*/
