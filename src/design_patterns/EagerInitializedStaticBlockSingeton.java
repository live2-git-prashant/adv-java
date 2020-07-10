package design_patterns;

public class EagerInitializedStaticBlockSingeton {
//Why ?
	// SINGTON
	// Single to n Single object will be created for an application
	// Developer should use only one object and developer should not crate

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("design_patterns.Singleton_CoffeVendingMachine2");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception occured while loading the singelton");
			
			e.printStackTrace();
		}
		Singleton_CoffeVendingMachine2 singleton_CoffeVendingMachine2 = Singleton_CoffeVendingMachine2.getInstance();
		singleton_CoffeVendingMachine2.bewCupOfCoffee();

		// Check if only one instance is created
		Singleton_CoffeVendingMachine2 Singleton_CoffeVendingMachine22 = Singleton_CoffeVendingMachine2.getInstance();
		Singleton_CoffeVendingMachine22.bewCupOfCoffee();
		// Check both referances are same
		System.out.println(singleton_CoffeVendingMachine2);
		System.out.println(Singleton_CoffeVendingMachine22);
		// A developer cannot create an instance
		// Singleton_CoffeVendingMachine singleton_CoffeVendingMachine =new
		// Singleton_CoffeVendingMachine();
	}

}

class Singleton_CoffeVendingMachine2 {
	// STEP 1: Create a variable which is 1. private 2,static 3.final
	private static Singleton_CoffeVendingMachine2 INSTANCE_SINGLETON_COFFE_VENDING_MACHINE;

	// Step 2: Create a private constructor
	private Singleton_CoffeVendingMachine2() {
	}

//Step 2.1 : Add a static block to initialize and handle
	static {
		try {
			INSTANCE_SINGLETON_COFFE_VENDING_MACHINE = new Singleton_CoffeVendingMachine2();
			System.out.println("Static block executed and instance Created");
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException("ERROR CREATING AN INSTANCE OF SINGELTON");
		}
	}

	// Step 3: Create the accessor to access the instance
	public static Singleton_CoffeVendingMachine2 getInstance() {
		return INSTANCE_SINGLETON_COFFE_VENDING_MACHINE;
	}

	// business methods
	public void bewCupOfCoffee() {
		System.out.println("A hot cup of coffee");
	}

}