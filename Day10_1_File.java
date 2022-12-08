package matrixmulti;
import java.util.Scanner;
import java.io.*;
public class FileOddEven {
public static void main(String[] args) throws IOException {
try {
File f=new File("numbers.txt");
if(f.createNewFile()) {
System.out.println("file has created and file name is "+f.getName());
}
}
catch(Exception e){
System.out.println(e.getMessage());
}
FileOutputStream f11=new FileOutputStream("numbers.txt");
Scanner sc=new Scanner(System.in);
System.out.println("enter the limit of the numbers you want to write to the file");
System.out.println();
int limit=sc.nextInt();
System.out.println();
System.out.println("enter the integers that you want to in the file number.txt");
for(int i=0;i<limit;i++) { 
int a=sc.nextInt();
f11.write(a); 
}
f11.close(); 
try {
FileInputStream f4=new FileInputStream("numbers.txt");
FileOutputStream f2=new FileOutputStream("even.txt");
FileOutputStream f3=new FileOutputStream("odd.txt");

int c;
System.out.println();
System.out.println("reading contents of numbers.txt and copying it to even.txt and odd.txt");
while((c=f4.read())!=-1) {
if(c%2==0) {
f2.write(c);
}
else {
f3.write(c);
}
}
f4.close();
f2.close();
f3.close();
} 
catch(Exception e) {
System.out.println("error handled successfully");
} 
System.out.println();
System.out.println("---contents of file even.txt----");
int j=0;
try {
FileInputStream f5=new FileInputStream("even.txt");
while((j=f5.read())!=-1) {
int a=(int)j;
System.out.println(a); 
}
f5.close();

} 
catch(Exception e) {
System.out.println(e.getMessage());
}
System.out.println();
System.out.println("---contents of file odd.txt----");
int i=0;
try {
FileInputStream f6=new FileInputStream("odd.txt"); 
while((i=f6.read())!=-1) {
int a=(int)i;
System.out.println(a); 
}
f6.close(); 
}
catch(Exception a) {
System.out.println(a.getMessage());
}
sc.close();
}
}

