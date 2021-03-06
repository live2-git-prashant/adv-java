package design_patterns;

public class ThreadSafeLazyInitializedSingeton {
//Why ?
	// SINGTON
	// Single to n Single object will be created for an application
	// Developer should use only one object and developer should not crate

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton_CoffeVendingMachine3 singleton_CoffeVendingMachine = Singleton_CoffeVendingMachine3.getInstance();
		singleton_CoffeVendingMachine.bewCupOfCoffee();

		// Check if only one instance is created
		Singleton_CoffeVendingMachine3 singleton_CoffeVendingMachine2 = Singleton_CoffeVendingMachine3.getInstance();
		singleton_CoffeVendingMachine2.bewCupOfCoffee();
		//Check both referances are same
		System.out.println(singleton_CoffeVendingMachine);
		System.out.println(singleton_CoffeVendingMachine2);
		// A developer cannot create an instance
		// Singleton_CoffeVendingMachine singleton_CoffeVendingMachine =new
		// Singleton_CoffeVendingMachine();
	}

}

class Singleton_CoffeVendingMachine3 {
	// STEP 1: Create a variable which is 1. private 2,static 3.final
	private static Singleton_CoffeVendingMachine3 INSTANCE_SINGLETON_COFFE_VENDING_MACHINE;

	// Step 2: Create a private constructor
	private Singleton_CoffeVendingMachine3() {
	}

	// Step 3: Create the accessor to access the instance
	public static synchronized  Singleton_CoffeVendingMachine3 getInstance() {
		if(INSTANCE_SINGLETON_COFFE_VENDING_MACHINE== null){
			INSTANCE_SINGLETON_COFFE_VENDING_MACHINE = new Singleton_CoffeVendingMachine3();
		}
		return INSTANCE_SINGLETON_COFFE_VENDING_MACHINE;
	}

	// business methods
	public void bewCupOfCoffee() {
		System.out.println("A hot cup of coffee");
	}

}