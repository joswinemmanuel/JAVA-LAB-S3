package matrixmulti;
import java.io.*;
import java.util.Scanner;
public class FileDemo{
public static void main(String[] args) {
try
{
File f1= new File ("sample.txt");
if(f1.exists()) {
System.out.println("file1 exists");
}
else
{
f1.createNewFile();
System.out.println("created file sample.txt ");
}
Scanner sc= new Scanner(System.in);
System.out.println("enter the contents of file");
String content=sc.nextLine();
FileWriter f= new FileWriter("sample.txt");
f.write(content);
f.close();
System.out.println("contents saved to file sample.txt");
//create new file
File f2= new File ("new_sample.txt");

if(f2.exists()) {
System.out.println("file2 exists");
}
else
{
f1.createNewFile();
System.out.println("created file new_sample.txt ");
}
//copy content from one file to another
FileInputStream in= new FileInputStream("sample.txt");
FileOutputStream out= new FileOutputStream("new_sample.txt");
int c;
while((c=in.read())!=-1)
{
out.write(c);
}
System.out.println("file contents copied from sample to sample 2");
System.out.println("file contents from sample 2");
FileReader fr=new FileReader("new_sample.txt");
BufferedReader br= new BufferedReader (fr);
String content1;
while ((content1= br.readLine())!=null)
{
System.out.println(content1);
}
}catch(IOException e)

{
System.out.println(e);
}
}
}
