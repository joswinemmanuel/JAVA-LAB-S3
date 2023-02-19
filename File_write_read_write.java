import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class test  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String write_data;
		String write_data_2 = "";
		
		try {
			FileWriter fw = new FileWriter("Demo1.txt");
			System.out.println("Demo1.txt created");
			System.out.print("Enter the data : ");
			write_data = sc.nextLine();
			fw.write(write_data);	
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileReader fr = new FileReader("Demo1.txt");
			int read_data = fr.read();
			while(read_data != -1) {
				write_data_2 += (char)read_data;
				read_data = fr.read();
			}
			System.out.println("Data is Demo1 : " + write_data_2);
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileWriter fw2 = new FileWriter("Demo2.txt");
			System.out.println("Demo2.txt created as a copy of Demo1.txt");
			fw2.write(write_data_2);	
			fw2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
		
	}
}
