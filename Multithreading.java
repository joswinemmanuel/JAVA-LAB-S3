import java.util.Random;

class Number extends Thread

{

public void run()

{

Random random=new Random();

for(int i =0; i<10; i++)

{

int randomInteger = random.nextInt(100);

System.out.println("Random Integer generated : " + randomInteger);

if(randomInteger%2==0)

{

Square s = new Square(randomInteger);

s.start();

}

else

{

Cube c = new Cube(randomInteger);

c.start();

}

try

{

Thread.sleep(1000);

}

catch(Exception e)

{

e.printStackTrace();

}

}

}

}

class Square extends Thread

{

int x;

Square(int n)

{

x=n;


}

public void run()

{

int sq=x*x;

System.out.println("Square of"+x+"="+sq);

}

}

class Cube extends Thread

{

int x;

Cube(int n)

{

x=n;

}

public void run()

{

int c=x*x*x;

System.out.println("Cube of"+x+"="+c);

}

}

public class MultiThreading

{

public static void main(String args[])

{

Number n = new Number();

n.start();

}

}








