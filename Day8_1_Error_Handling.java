import java.util.Scanner;

public class Day8_Error_handling {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int option;
		
		System.out.print("MENU\n1) Arithmetic Exception \n2) Array Index Out Of Bounds Exception\n3) Exit\n");
		do {
			System.out.print("\nEnter the option : ");
			option = input.nextInt();
			
			switch(option) {
			case 1:
				System.out.println("This is ArithmeticException");
				try {
					System.out.println(10/0);
				} catch(Exception e) {
					System.out.println(e);
				}
				break;
			case 2:
				System.out.println("This is ArrayIndexOutOfBoundsException");
				try {
					int[] arr = new int[5];
					arr[6] = 10;
				} catch(Exception e) {
					System.out.println(e);
				}
				break;
			case 3:
				System.out.println("Exiting");
				break;
			default:
				System.out.println("Select a valid option (1 or 2) ");
			}
		} while(option != 3);		
	}
}

/*
MENU
1) Arithmetic Exception 
2) Array Index Out Of Bounds Exception
3) Exit

Enter the option : 1
This is ArithmeticException
java.lang.ArithmeticException: / by zero

Enter the option : 2
This is ArrayIndexOutOfBoundsException
java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5

Enter the option : 3
Exiting

*/
