package calci;
import java.util.Scanner;
import div.*;						//Importing package
public class main 										//Main function
{

	public static void main(String[] args) 
{

		int c[]=new int[2];								//Array Declaration
		Scanner in=new Scanner(System.in);
		operations op=new operations();		
		operations ops=new operations();
		division d=new division();
		advanced ad=new advanced(20);
		inter sf=new inter(op);
		System.out.println("Enter the 2 numbers for addition and multipliction:");
		c[0]=in.nextInt();
		c[1]=in.nextInt();
		ops.operations(c[0],c[1]);						//Invoking Parameterised constructor
		op.operations(ops);								//Invoking Copy constructor
		sf.mod();										
		op.operations();		  						//Invoking Non Parameterised constructor
		d.div();										//Invoking normal function
		System.out.println("ADVANCED FEATURES IN  MAXCALC(Displaying Enum Variables)");
		for(Features f:Features.values())				//Enchanced for
			System.out.println(f.get());
			
		ad.square();									//Call Statement
		sf.primeornot();								//Interface
	}

}
