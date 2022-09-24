import java.util.Scanner;

public class Day2_4_Prime_or_not {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num, flag=1;

        System.out.print("Enter the number : ");
        num = input.nextInt();

        for(int i=2; i<=(num/2); i++){
            if(num % i == 0)
                flag = 0;
        }

        if(flag == 1)
            System.out.println(num + " is PRIME");
        else   
            System.out.println(num + " is not PRIME");
    }
}

/*
Enter the number : 19
19 is PRIME
*/