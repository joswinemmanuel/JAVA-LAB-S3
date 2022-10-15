import java.util.Scanner;

public class Day4_3_String_palindrome_without {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1;
		int pal = 1;
		
		System.out.print("Enter the string : ");
		str1 = sc.nextLine();
		
		int n = str1.length();
		for(int i=0; i<n; i++) {
			if(str1.charAt(i) != str1.charAt(n-1-i))
				pal = 0;
				break;
		}
		
		if(pal == 1)
			System.out.println(str1 + " is a PALINDROME");
		else
			System.out.println(str1 + " is not a PALINDROME");
	}
}

/*
Enter the string : malayalam
malayalam is a PALINDROME
*/

/*
Enter the string : joswin
joswin is not a PALINDROME
*/
