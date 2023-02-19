import java.io.FileReader;
import java.io.IOException;

public class test  {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("DEMO.txt");
			int data = fr.read();
			while(data != -1) {
				System.out.print((char)data);
				data = fr.read();
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
