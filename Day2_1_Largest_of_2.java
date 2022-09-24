import java.util.Scanner;

public class Day2_1_Largest_of_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.print("Enter number 1 : ");
        num1 = input.nextInt();
        System.out.print("Enter number 2 : ");
        num2 = input.nextInt();

        if(num1 > num2)
            System.out.println("Largest : " + num1);
        else
            System.out.println("Largest : " + num2);
    }
}

/*
Enter number 1 : 10
Enter number 2 : 20
Largest : 20
*/