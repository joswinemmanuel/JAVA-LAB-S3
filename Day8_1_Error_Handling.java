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
				try {
					int a, b;
					System.out.println("Program to perform division");
					System.out.print("Enter number 1 : ");
					a = input.nextInt();
					System.out.print("Enter number 2 : ");
					b = input.nextInt();
					if(b==0)
					{
						throw new ArithmeticException("Division by Zero");
					}
					else
					{
						System.out.println("Result="+a/b);
					}
				} catch(Exception e) {
					System.out.println(e);
				} finally {
					System.out.print("finally block content\n");
				}
				break;
				
			case 2:
				try {
					int n, pos;
					System.out.print("Enter number of elements to store in array : ");
					n = input.nextInt();
					
					int[] arr = new int[n];
					System.out.print("Enter the elements : ");
					for(int i=0; i<n; i++) {
						arr[i] = input.nextInt();
					}
					
					System.out.print("Enter the postion to be accessed : ");
					pos = input.nextInt();
					if(pos >= n)
						throw new ArrayIndexOutOfBoundsException("Array Index Out Of Bounds");
					else
						System.out.println("Element is : " + arr[pos]);
					
				} catch(Exception e) {
					System.out.println(e);
				} finally {
					System.out.print("finally block content\n");
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

Enter the option : 2
Enter number of elements to store in array : 3
Enter the elements : 10 20 30
Enter the postion to be accessed : 2
Element is : 30
finally block content

Enter the option : 2
Enter number of elements to store in array : 4
Enter the elements : 1 2 3 4
Enter the postion to be accessed : 10
java.lang.ArrayIndexOutOfBoundsException: Array Index Out Of Bounds
finally block content

Enter the option : 1
Program to perform division
Enter number 1 : 10
Enter number 2 : 2
Result=5
finally block content

Enter the option : 1
Program to perform division
Enter number 1 : 10
Enter number 2 : 0
java.lang.ArithmeticException: Division by Zero
finally block content

Enter the option : 3
Exiting

*/
