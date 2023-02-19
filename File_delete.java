import java.io.File;

public class Main  {
	public static void main(String[] args) {
		File f = new File("DEMO.txt");
		
		if(f.exists()) {
			f.delete();
		} else {
			System.out.println("File doesn't exits");
		}
	}
}
