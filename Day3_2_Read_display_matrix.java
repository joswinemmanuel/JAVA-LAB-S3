import java.util.Scanner;

public class Day3_2_Read_display_matrix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int arr[][], row, column;

        System.out.print("Enter the number of rows : ");
        row = input.nextInt();
        System.out.print("Enter the number of columns : ");
        column = input.nextInt();

        arr = new int[row][column];

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print("Enter the element arr["+i+"]["+j+"] : ");
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("\nElements are ");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
Enter the number of rows : 3
Enter the number of columns : 2
Enter the element arr[0][0] : 1
Enter the element arr[0][1] : 2
Enter the element arr[1][0] : 3
Enter the element arr[1][1] : 4
Enter the element arr[2][0] : 5
Enter the element arr[2][1] : 6
Elements are
1 2
3 4
5 6
*/
