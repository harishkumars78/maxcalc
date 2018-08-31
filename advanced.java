package calci;

public class advanced extends operations	//Inheritence(advanced class derived from operations class)
{
	public advanced(int a)
	{
		super();							//Usage of super
	}
	public void square()
	{
		get();								//calling base class function
		System.out.println("The square of "+a+" is "+a*a);
	}

}
