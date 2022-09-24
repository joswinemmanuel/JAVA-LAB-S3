import java.util.Scanner;

public class Day2_10_Read_display_array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int arr[], n;

        System.out.print("Enter the number of elements : ");
        n = input.nextInt();

        arr = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter the value of element " + i + " : ");
            arr[i] = input.nextInt();
        }

        System.out.println("\nThe values in array are ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

/*
Enter the number of elements : 5
Enter the value of element 0 : 10
Enter the value of element 1 : 20
Enter the value of element 2 : 30
Enter the value of element 3 : 40
Enter the value of element 4 : 50

The values in array are
10 20 30 40 50
*/