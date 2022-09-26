import java.util.Scanner;

public class Day3_3_Add_Matrix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int arr1[][], arr2[][], arr3[][], row, column;

        System.out.print("Enter the number of rows : ");
        row = input.nextInt();
        System.out.print("Enter the number of columns : ");
        column = input.nextInt();
        System.out.println();

        arr1 = new int[row][column];
        arr2 = new int[row][column];
        arr3 = new int[row][column];

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print("Enter the value of arr1["+i+"]["+j+"] : ");
                arr1[i][j] = input.nextInt();
            }   
        }
        System.out.println();

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print("Enter the value of arr2["+i+"]["+j+"] : ");
                arr2[i][j] = input.nextInt();
            }   
        }
        System.out.println();

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("Sum of arr1 and arr2 is");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
Enter the number of rows : 3
Enter the number of columns : 3
Enter the value of arr1[0][0] : 1
Enter the value of arr1[0][1] : 2
Enter the value of arr1[0][2] : 3
Enter the value of arr1[1][0] : 4
Enter the value of arr1[1][1] : 1
Enter the value of arr1[1][2] : 2
Enter the value of arr1[2][0] : 3
Enter the value of arr1[2][1] : 4
Enter the value of arr1[2][2] : 1
Enter the value of arr2[0][0] : 1
Enter the value of arr2[0][1] : 2
Enter the value of arr2[0][2] : 3
Enter the value of arr2[1][0] : 4
Enter the value of arr2[1][1] : 1
Enter the value of arr2[1][2] : 2
Enter the value of arr2[2][0] : 3
Enter the value of arr2[2][1] : 4
Enter the value of arr2[2][2] : 1
Sum of arr1 and arr2 is
2 4 6
8 2 4
6 8 2
*/
