import java.util.Scanner;

public class Day2_11_Bubble_sort {
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

        System.out.println("\n\nAfter Ascending Sorting ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("\n\nAfter Descending Sorting ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

/*
Enter the number of elements : 4
Enter the value of element 0 : 10
Enter the value of element 1 : 4
Enter the value of element 2 : 9
Enter the value of element 3 : 23

Before Sorting
10 4 9 23

After Ascending Sorting
4 9 10 23

After Descending Sorting
23 10 9 4
*/