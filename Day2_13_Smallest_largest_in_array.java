import java.util.Scanner;

public class Day2_13_Smallest_largest_in_array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int arr[], n, smallest, largest;

        System.out.print("Enter the number of elements : ");
        n = input.nextInt();

        arr = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter the value of element " + i + " : ");
            arr[i] = input.nextInt();
        }

        System.out.println("\nThe array is ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

        smallest = arr[0];
        largest = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i] < smallest)
                smallest = arr[i];
            if(arr[i] > largest)
                largest = arr[i];
        }

        System.out.println("\n\nLargest is : " + largest);
        System.out.println("Smallest is : " + smallest);
    }
}

/*
Enter the number of elements : 5
Enter the value of element 0 : 10
Enter the value of element 1 : 20
Enter the value of element 2 : 5
Enter the value of element 3 : 25
Enter the value of element 4 : 50

The array is
10 20 5 25 50

Largest is : 50
Smallest is : 5
*/