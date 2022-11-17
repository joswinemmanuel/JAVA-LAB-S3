
public class Day8_Ex2 {

	static void check(int a,int b)
	{
		if(b==0)
		{
			throw new ArithmeticException("Division by Zero");
		}
		else
		{
			System.out.println("Result="+a/b);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=0;
		try
		{
			check(a,b);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}

}
