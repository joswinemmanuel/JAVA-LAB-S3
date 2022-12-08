import java.io.*;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
    
		// Creating sample.txt
		try {
			File f1= new File("sample.txt");
			if(f1.exists()) {
				System.out.println("sample.txt already exists");
			} else {
				f1.createNewFile();
				System.out.println("created file sample.txt ");
			}
				
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the contents of file : ");
			String content = sc.nextLine();
			FileWriter f = new FileWriter("sample.txt");
			f.write(content);
			f.close();
			System.out.println("contents saved to file sample.txt");
			
			// Creating new_sample.txt
			File f2= new File("new_sample.txt");
			
			if(f2.exists()) {
				System.out.println("new_sample already exists");
			} else {
				f2.createNewFile();/////////
				System.out.println("created file new_sample.txt ");
			}
			
			//copy content from sample.txt to new_sample.txt
			FileInputStream in = new FileInputStream("sample.txt");
			FileOutputStream out = new FileOutputStream("new_sample.txt");
			int c;
			while((c=in.read())!=-1) {
				out.write(c);
			}
			System.out.println("File content copied from sample.txt to new_sample.txt");
			System.out.println("File content of new_sample.txt");
			FileReader fr = new FileReader("new_sample.txt");
			BufferedReader br = new BufferedReader(fr);
			String content1;
			while((content1 = br.readLine())!=null) {
				System.out.println(content1);
			}
			
		} catch(IOException e) {
			System.out.println(e);
		}
	}
}
