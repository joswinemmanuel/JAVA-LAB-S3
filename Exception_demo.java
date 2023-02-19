import java.util.Scanner;

public class test  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		System.out.print("Enter the number 1 : ");
		a = sc.nextInt();
		System.out.print("Enter the number 2 : ");
		b = sc.nextInt();
		
		try {
			c = a/b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("This will always execute");
		}
	}
}


/*
Enter the number 1 : 10
Enter the number 2 : 0
java.lang.ArithmeticException: / by zero
	at test.main(test.java:14)
This will always execute
*/
