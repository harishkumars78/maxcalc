package calci;

public enum Features {						//enum
SQ("square"),
PR("primeornot");
private final String feat;
Features(String name)						//Enum constructor
{
	feat=name;
}
public String get()							//function to return enum variables
{
	return feat;
}
}
