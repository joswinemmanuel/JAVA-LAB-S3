import java.util.Scanner;
import java.util.Arrays;

public class Day2_15_Merge_2_array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int arr1[], n, arr2[], m, merge[];

        System.out.print("Enter the number of elements in array 1 : ");
        n = input.nextInt();
        arr1 = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter the value of arr1[" + i + "] : ");
            arr1[i] = input.nextInt();
        }

        System.out.print("Enter the number of elements in array 2 : ");
        m = input.nextInt();
        arr2 = new int[m];
        for(int i=0; i<m; i++){
            System.out.print("Enter the value of arr2[" + i + "] : ");
            arr2[i] = input.nextInt();
        }

        System.out.println("\nArray 1 is ");
        for(int i=0; i<n; i++){
            System.out.print(arr1[i] + " ");
        }

        System.out.println("\n\nArray 2 is ");
        for(int i=0; i<m; i++){
            System.out.print(arr2[i] + " ");
        }

        merge = new int[m+n];

        System.arraycopy(arr1, 0, merge, 0, n);
        System.arraycopy(arr2, 0, merge, n, m);
        
        System.out.println("\n\nMerged array is");
        for(int i=0; i<m+n; i++){
            System.out.print(merge[i] + " ");
        }

    }
}

/*
Enter the number of elements in array 1 : 3
Enter the value of arr1[0] : 1
Enter the value of arr1[1] : 2
Enter the value of arr1[2] : 3
Enter the number of elements in array 2 : 2
Enter the value of arr2[0] : 10
Enter the value of arr2[1] : 20

Array 1 is
1 2 3

Array 2 is
10 20

Merged array is
1 2 3 10 20
*/