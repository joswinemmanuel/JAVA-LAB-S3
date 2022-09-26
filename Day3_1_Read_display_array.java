import java.util.Scanner;

public class Day3_1_Read_display_array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int arr[], n;

        System.out.print("Enter the size of the array : ");
        n = input.nextInt();
        arr = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter the element arr[" + i + "] : ");
            arr[i] = input.nextInt();
        }

        System.out.println("\nArray elements are : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

/*
Enter the size of the array : 5
Enter the element arr[0] : 1
Enter the element arr[1] : 2
Enter the element arr[2] : 10
Enter the element arr[3] : 22
Enter the element arr[4] : 3
Array elements are :
1 2 10 22 3
*/
