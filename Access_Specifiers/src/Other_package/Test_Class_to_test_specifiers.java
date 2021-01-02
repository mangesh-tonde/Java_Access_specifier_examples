package Other_package;

import default_specifier.Class1_default_specifier;

public class Test_Class_to_test_specifiers extends Class1_default_specifier{

	public static void main(String[] args) {
		Class1_default_specifier ds = new Class1_default_specifier();
		
		//Default Access specifier test
		//ds.default_specifier_test(); 
		// As method has default acess specifier it can't be acessed outsied the package.
		
		//Public Access specifier test
		//ds.public_specifier_test1();
		//As method has public access specifier it can be acessed outsied the package.
	
		//Private access specifier
		//ds.private_specifier_test2();
		//As method has private access specifier it can't be acessed outsied the class.
		
		
		//Protected acess specifier
		Test_Class_to_test_specifiers test = new Test_Class_to_test_specifiers();
		test.protected_specifier_test3();
	// Method/Variable with protected Acess specifer can be acessed another package only if [Another class inherrit(extends) Class1 and create object of own class and acess the method 

	}
	

}
