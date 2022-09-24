import java.util.Scanner;
import java.lang.Math;

public class Day2_6_Armstrong_or_not {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num, sum=0, p, len=0;

        System.out.print("Enter the number : ");
        num = input.nextInt();

        p = num;
        while(p != 0){
            len++;
            p /= 10;
        }

        p = num;
        while(p != 0){
            sum += Math.pow(p%10, len);
            p /= 10;
        }

        if(sum == num)
            System.out.println(num + " is an ARMSTRONG number");
        else
            System.out.println(num + " is not an ARMSTRONG number");
    }
}

/*
Enter the number : 153
153 is an ARMSTRONG number
*/