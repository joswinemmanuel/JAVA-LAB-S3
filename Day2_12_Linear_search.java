import java.util.Scanner;

public class Day2_12_Linear_search {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int arr[], n, x, found=0, index=0;

        System.out.print("Enter the number of elements : ");
        n = input.nextInt();

        arr = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter the value of element " + i + " : ");
            arr[i] = input.nextInt();
        }

        System.out.print("\nEnter the value to search for : ");
        x = input.nextInt();

        System.out.println("\nThe array is ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

        for(int i=0; i<n; i++){
            if(arr[i] == x){
                found = 1;
                index = i;
                break;
            }    
        }

        if(found == 1)
            System.out.println("\n\n" + x + " is found at index " + index + " of the array ");
        else 
            System.out.println("\n\n" + x + " is not found in the array ");
        
    }
}

/*
Enter the number of elements : 5
Enter the value of element 0 : 10
Enter the value of element 1 : 21
Enter the value of element 2 : 8 
Enter the value of element 3 : 1
Enter the value of element 4 : 30

Enter the value to search for : 1

The array is
10 21 8 1 30

1 is found at index 3 of the array
*/