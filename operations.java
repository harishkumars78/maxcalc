package calci;
import java.util.Scanner;
public class operations 
{
	public int a,b,c;
	Scanner input=new Scanner(System.in);
	public void operations()    				//Non parameterised constructor
	{
		System.out.println("Enter 2 numbers for subraction");
		int a=input.nextInt();
		int b=input.nextInt();
		c=a-b;
		System.out.println(a + "-" + b + " is equal to " + c);
	}
												//Static function
	{
		System.out.println("Welcome to Max Calculator");
	}
	final public void operations(int a,int b)	//Parameterised Constructor(Usage of final)
	{
		this.a=a;
		this.b=b;
		c=a+b;
		System.out.println(a + "+" + b + " is equal to " + c);
	}
	
	public void operations(operations j)		//Copy Constructor
	{
		a=j.a;
		b=j.b;
		System.out.println(a + "*" + b + " is equal to " + a*b);
	}
	
	public void get()							//Normal Method
	{
		System.out.println("Enter 1 no.s for squaring");
		a=input.nextInt();
	}
}
