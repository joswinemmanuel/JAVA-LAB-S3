import java.util.Scanner;

public class Day3_4_Transpose_matrix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int arr1[][], arr2[][], row, column;

        System.out.print("Enter the number of rows : ");
        row = input.nextInt();
        System.out.print("Enter the number of columns : ");
        column = input.nextInt();
        System.out.println();

        arr1 = new int[row][column];
        arr2 = new int[column][row];

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print("Enter the value of arr1["+i+"]["+j+"] : ");
                arr1[i][j] = input.nextInt();
            }   
        }
        System.out.println();

        for(int i=0; i<column; i++){
            for(int j=0; j<row; j++){
                arr2[i][j] = arr1[j][i];
            }
        }

        System.out.println("arr1 is");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(arr1[i][j] + " ");
            }   
            System.out.println();
        }
        System.out.println();

        System.out.println("Transpose of arr1 is");
        for(int i=0; i<column; i++){
            for(int j=0; j<row; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
Enter the number of rows : 2
Enter the number of columns : 3
Enter the value of arr1[0][0] : 1
Enter the value of arr1[0][1] : 2
Enter the value of arr1[0][2] : 3
Enter the value of arr1[1][0] : 4
Enter the value of arr1[1][1] : 5
Enter the value of arr1[1][2] : 6
arr1 is
1 2 3
4 5 6
Transpose of arr1 is
1 4
2 5
3 6
*/
