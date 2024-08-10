
public class FirstClass {
	public FirstClass()
	{ this(10,20,30);
		System.out.println("Default constructor");	
	}
	public FirstClass(int a)
	{		
		this(10,20);
	 System.out.println("One parameter");	
	}
	public FirstClass(int a, int b)
	{ this();
		System.out.println("Two parameter");		
	}
	public FirstClass(int a, int b, int c)
	{
		System.out.println("Three parameter");	
	}
	public static void main(String[] args) {
		
		FirstClass obj= new FirstClass(10);
		
	}

}
