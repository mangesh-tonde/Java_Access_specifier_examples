package default_specifier;

public class test_class
{

	public static void main(String[] args)
	{
		Class1_default_specifier ds = new Class1_default_specifier();
		ds.default_specifier_test();// method with default specifier
		ds.public_specifier_test1();//method with public specifier
		//ds.private_specifier_test2();//method with private specifier
		ds.protected_specifier_test3();//method with protected specifier

	}
  
}
