package div;
import java.util.Scanner;
public class division {
	int a,b;
	Scanner s=new Scanner(System.in);
	public void div()									//Normal function
	{
		System.out.println("Enter 2 numbers for division");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println(a + "/" + b + " is equal to " + a/b);
	}
}
