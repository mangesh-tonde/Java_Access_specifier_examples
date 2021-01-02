package default_specifier;

public class Class1_default_specifier {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}
  
	void default_specifier_test()
	{
		
		System.out.println(" Method/Variable with Default Acess specifer can be acessed anywhere in the same package in any class");
		System.out.println(" Method/Variable with Default Acess specifer can not be aceessible outside package.");
		
	}
	
	public void public_specifier_test1()
	{
		
		System.out.println(" Method/Variable with public Acess specifer can be acessed anywhere in the same package in any class");
		System.out.println(" As well as outside package in any class.");
		
	}
	
	private void private_specifier_test2()
	{
		
		System.out.println(" Method/Variable with private Acess specifer can not be acessed anywhere in the same package ");
		System.out.println(" Acess limited to only same class (in this case Class1_default_specifier ).");
		
	}
	
	protected void protected_specifier_test3()
	{
		
		System.out.println(" Method/Variable with protected Acess specifer can be acessed anywhere in the same package by creating object of this class ");
		System.out.println(" Method/Variable with protected Acess specifer can be acessed in another package only if [Another class inherrit(extends) Class1 and create object of own class and acess the method ");

	
	}
	
	
}
