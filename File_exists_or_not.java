import java.io.File;

public class test  {
	public static void main(String[] args) {
		
		File f = new File("demo_file.txt");
		
		if(f.exists()) {
			System.out.println("demo_file Exits");
			System.out.println(f.getPath());
			System.out.println(f.getAbsolutePath());
			System.out.println(f.isFile());
		} else
			System.out.println("demo_file Doesn't Exits");
	}
}

/*
demo_file Exits
demo_file.txt
C:\#####\#####\eclipse-workspace\Joswin_proj\demo_file.txt
true
*/
