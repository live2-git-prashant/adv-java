package design_patterns;

public class EagerInitializedSingeton {
//Why ?
	// SINGTON
	// Single to n Single object will be created for an application
	// Developer should use only one object and developer should not crate

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton_CoffeVendingMachine singleton_CoffeVendingMachine = Singleton_CoffeVendingMachine.getInstance();
		singleton_CoffeVendingMachine.bewCupOfCoffee();

		// Check if only one instance is created
		Singleton_CoffeVendingMachine singleton_CoffeVendingMachine2 = Singleton_CoffeVendingMachine.getInstance();
		singleton_CoffeVendingMachine2.bewCupOfCoffee();
		//Check both referances are same
		System.out.println(singleton_CoffeVendingMachine);
		System.out.println(singleton_CoffeVendingMachine2);
		// A developer cannot create an instance
		// Singleton_CoffeVendingMachine singleton_CoffeVendingMachine =new
		// Singleton_CoffeVendingMachine();
	}

}

class Singleton_CoffeVendingMachine {
	// STEP 1: Create a variable which is 1. private 2,static 3.final
	private static final Singleton_CoffeVendingMachine INSTANCE_SINGLETON_COFFE_VENDING_MACHINE 
	= new Singleton_CoffeVendingMachine();

	// Step 2: Create a private constructor
	private Singleton_CoffeVendingMachine() {
	}

	// Step 3: Create the accessor to access the instance
	public static Singleton_CoffeVendingMachine getInstance() {
		return INSTANCE_SINGLETON_COFFE_VENDING_MACHINE;
	}

	// business methods
	public void bewCupOfCoffee() {
		System.out.println("A hot cup of coffee");
	}

}