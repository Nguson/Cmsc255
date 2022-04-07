public class VariableDefinitions
{
	public static void main(String[]args) 
	{
	// declaration of numPeople variable
	byte numPeople = 3;
	System.out.println("The NumPeople variable has a value of " + numPeople);
	//modification of the variable numPeople
	numPeople = 6;
	System.out.println("The numPeople variable now has a value of " + numPeople);
	
	// declaration of itemPrice variable
	double itemPrice = 32.32;
	System.out.println("The itemPrice variable has a value of " + itemPrice);
	//modification of variable itemPrice
	itemPrice = 44.44;
	System.out.println("The itemPrice variable now has a value of " + itemPrice);
	
	// declaration of classNumber variable
	int classNumber = 207;
	System.out.println("The classNumber variable has a value of " + classNumber);
	//modification of variable classNumber
	classNumber = 307;
	System.out.println("The classNumber variable now has a value of " + classNumber);
	
	// declaration of dinnerPrice variable
	double dinnerPrice = 30.0F;
	System.out.println("The dinnerPrice variable has a value of " + dinnerPrice);
	//modification of variable dinnerPrice
	dinnerPrice = 50.0F;
	System.out.println("The dinnerPrice variable now has a value of " + dinnerPrice);
	
	final int integer = 20;
	System.out.println(" The value of integer is " + integer);
	
	final double decimal = 3.14;
	System.out.println(" The value of decimal is " + decimal);
	
	final byte small = 2;
	System.out.println(" The value of small is " + small);
	
	final float floater = 4.6F;
	System.out.println(" The value of floater is " + floater);
	
	// "Cannot assign value to final" floater = 4.9F;
	}
}