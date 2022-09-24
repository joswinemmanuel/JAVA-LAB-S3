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

        System.out.println("\nBefore Sorting ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("\n\nAfter Sorting ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

/*
Enter the number of elements : 5
Enter the value of element 0 : 11
Enter the value of element 1 : 3 
Enter the value of element 2 : 23
Enter the value of element 3 : 19
Enter the value of element 4 : 1

Before Sorting
11 3 23 19 1

After Sorting
1 3 11 19 23
*/