import java.util.Scanner;

public class Day2_16_Multiplication_table {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Enter the number : ");
        n = input.nextInt();

        System.out.println("\nMultiplication table of " + n + " is ");
        for(int i=1; i<=10; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }

    }
}

/*
Enter the number : 5

Multiplication table of 5 is
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50
*/