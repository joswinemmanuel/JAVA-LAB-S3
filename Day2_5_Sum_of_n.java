import java.util.Scanner;

public class Day2_5_Sum_of_n {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num, sum=0, i;

        System.out.print("Enter the number : ");
        num = input.nextInt();

        i = 1;
        while(i <= num){
            sum += i;
            i++;
        }
        System.out.println("Sum using while loop : " + sum);

        i = 1;
        sum = 0;
        do{
            sum += i;
            i++;
        } while(i <= num);
        System.out.println("Sum using do while loop : " + sum);

        sum = 0;
        for(i=1; i<=num; i++)
            sum += i;
        System.out.println("Sum using for loop : " + sum);
    }
}

/*
Enter the number : 5
Sum using while loop : 15
Sum using do while loop : 15
Sum using for loop : 15
*/