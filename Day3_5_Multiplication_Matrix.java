import java.util.Scanner;

public class Day3_5_Multiplication_Matrix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int arr1[][], arr2[][], arr3[][], row1, column1_row2, column2;

        System.out.print("Enter the number of rows of matrix 1 : ");
        row1 = input.nextInt();
        System.out.print("Enter the number of columns of matrix 1 and rows of matrix 2 : ");
        column1_row2 = input.nextInt();
        System.out.print("Enter the number of columns of matrix 2 : ");
        column2 = input.nextInt();
        System.out.println();

        arr1 = new int[row1][column1_row2];
        arr2 = new int[column1_row2][column2];
        arr3 = new int[row1][column2];

        for(int i=0; i<row1; i++){
            for(int j=0; j<column1_row2; j++){
                System.out.print("Enter the value of arr1["+i+"]["+j+"] : ");
                arr1[i][j] = input.nextInt();
            }   
        }
        System.out.println();

        for(int i=0; i<column1_row2; i++){
            for(int j=0; j<column2; j++){
                System.out.print("Enter the value of arr2["+i+"]["+j+"] : ");
                arr2[i][j] = input.nextInt();
            }   
        }
        System.out.println();

        for(int i=0; i<row1; i++){
            for(int j=0; j<column2; j++){
                for(int k=0; k<column1_row2; k++){
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        System.out.println("Matrix multiplication of arr1 and arr2 is");
        for(int i=0; i<row1; i++){
            for(int j=0; j<column2; j++){
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
Enter the number of rows of matrix 1 : 2
Enter the number of columns of matrix 1 and rows of matrix 2 : 3
Enter the number of columns of matrix 2 : 2
Enter the value of arr1[0][0] : 1
Enter the value of arr1[0][1] : 2
Enter the value of arr1[0][2] : 3
Enter the value of arr1[1][0] : 4
Enter the value of arr1[1][1] : 5
Enter the value of arr1[1][2] : 6
Enter the value of arr2[0][0] : 10
Enter the value of arr2[0][1] : 11
Enter the value of arr2[1][0] : 20
Enter the value of arr2[1][1] : 21
Enter the value of arr2[2][0] : 30
Enter the value of arr2[2][1] : 31
Matrix multiplication of arr1 and arr2 is
140 146
320 335
*/
