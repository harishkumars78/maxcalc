package calci;
import java.util.Scanner;
interface prime										//interface
{													//implicitly abstract
	public void primeornot();
}
public class inter implements prime		
{
	public int n,i,c=0;
	operations obje;
	public inter(operations objj)					//usage of composition
	{
		obje=objj;									
	}
	public void mod()
	{
		System.out.println("The greatest of "+obje.a+" and "+obje.b+" is ");
		if(obje.a>obje.b)
		{
			System.out.println(obje.a);
		}
		else
		{
			System.out.println(obje.b);
		}
		
	}
	public void primeornot()
	{
		System.out.println("Enter the number to check whether prime no");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for (i = 1; i <= n; i++) {					//logic to find prime or not
		      if (n % i == 0) {
		         c++;
		      }
		  }

		  if (c == 2) {
		  System.out.println("n is a Prime number");
		  }
		  else {
		System.out.println("n is not a Prime number");
		  }
	}
}
