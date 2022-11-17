import java.util.Scanner;

public class Day8_Error_handling {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int option;
		do {
			System.out.print("\nEnter the option : ");
			option = input.nextInt();
			
			switch(option) {
			case 1:
				System.out.println("This is ArithmeticError");
				try {
					System.out.println(10/0);
				} catch(Exception e) {
					System.out.println(e);
				}
				break;
			case 2:
				System.out.println("This is ArrayIndexError");
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
Enter the option : 1
This is ArithmeticError
java.lang.ArithmeticException: / by zero

Enter the option : 2
This is ArrayIndexError
java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5

Enter the option : 3
Exiting
*/
