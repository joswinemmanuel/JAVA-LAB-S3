import java.util.Scanner;

public class Day2_9_Fibonacci_series {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num, a=0, b=1, c;

        System.out.print("Enter the limit : ");
        num = input.nextInt();

        for(int i=0; i<num; i++){
            c = a + b;
            System.out.print(a + " ");
            a = b;
            b = c;
        }
    }
}

/* 
Enter the limit : 10
0 1 1 2 3 5 8 13 21 34 
*/