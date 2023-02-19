import java.io.FileWriter;
import java.io.IOException;

public class test  {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("DEMO.txt");
			fw.write("I'm the Biggest WOO");
			fw.write("\n628\n");
			fw.append("The Smoke will never clear");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
