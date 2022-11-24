import java.util.Scanner;
class InvalidAmountException extends Exception

{

InvalidAmountException(String msg)
{
super(msg);
}
}

class InsufficientFundsException extends Exception
{
InsufficientFundsException(String msg)
{
super(msg);
}
}
class Bank
{
String name;
int accountnum;
float balance;
Scanner sc=new Scanner(System.in);

public void create(int m)
{
accountnum=m;
System.out.println("Enter the name");
name=sc.nextLine();
System.out.println("enter the balance");
balance=sc.nextFloat();

}

public void display()
{
System.out.println("\nThe details of the user");
System.out.println("\naccount number:"+accountnum);
System.out.println("Name of the account user="+name);
System.out.println("Balnce:"+balance);

}

public void withdraw() throws InsufficientFundsException,InvalidAmountException
{
System.out.println("Enter the amount to withdraw");
int amt=sc.nextInt();
if(amt>balance)
{
throw new InsufficientFundsException("insufficient balance");
}
else if(amt<=0)
{
throw new InvalidAmountException("Amount is not valid");
}
else
{
balance=balance-amt;
System.out.println("balance amount="+balance);
}
}

public void deposit() throws InvalidAmountException
{
System.out.println("Enter the amount to deposit");
int amt1=sc.nextInt();
if(amt1<=0)
{
throw new InvalidAmountException("Amount is not valid");
}
else
{
balance=balance+amt1;
System.out.println("balance amount="+balance);
}
}
}
public class Banking {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of accounts you want to enter");
int n=sc.nextInt();
Bank b[];
b=new Bank[n];
for(int i=0;i<n;i++)
{
System.out.println("\nenter the details");

b[i]=new Bank();
b[i].create(i+1111);
b[i].display();
}

  int y;
  int l;
do
{


System.out.println("Enter the operation:1 for deposit\t\t2 for withdrawal\t 3 for search");
y=sc.nextInt();
switch(y)
{
case 1:

  System.out.println("enter the account number to be searched");
  int r=sc.nextInt();
  for(int i=0;i<n;i++)
  {
  if(r==b[i].accountnum)
 {

try
{
b[i].deposit();
}
catch(InvalidAmountException e)
{
System.out.println(e);
}

 }
 }


break;
case 2:

System.out.println("enter the account number to be searched");
  int r1=sc.nextInt();
  for(int i=0;i<n;i++)
  {
  if(r1==b[i].accountnum)
  {
  try
   {
b[i].withdraw();
   }
  catch(InsufficientFundsException e)
  {
System.out.println(e);
  }
  catch(InvalidAmountException e)
  {
System.out.println(e);
  }
  }
  }
break;
case 3:

  System.out.println("enter the account number to be searched");
  int acn=sc.nextInt();
  for(int i=0;i<n;i++)
  {
  if(acn==b[i].accountnum)
  {
  b[i].display();
  }
  }

  break;
}
System.out.println("do you want to continue.1 for yes 0 for no");
l=sc.nextInt();
}while(l==1);
 
   

}


}
