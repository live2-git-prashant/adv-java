package design_patterns;

public class LazyInitializedSingeton2 {
//Why ?
	// SINGTON
	// Single to n Single object will be created for an application
	// Developer should use only one object and developer should not crate

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread 1 started");
				Singleton_CoffeVendingMachine12 singleton_CoffeVendingMachine = Singleton_CoffeVendingMachine12
						.getInstance();
				singleton_CoffeVendingMachine.bewCupOfCoffee();
				System.out.println(singleton_CoffeVendingMachine);
				try {
					Thread.sleep(15000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();

		new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread 2 started");
				Singleton_CoffeVendingMachine12 singleton_CoffeVendingMachine2 = Singleton_CoffeVendingMachine12
						.getInstance();
				singleton_CoffeVendingMachine2.bewCupOfCoffee();
				System.out.println(singleton_CoffeVendingMachine2);
			}
		}.start();

		// Check if only one instance is created
		// Check both referances are same

		// A developer cannot create an instance
		// Singleton_CoffeVendingMachine singleton_CoffeVendingMachine =new
		// Singleton_CoffeVendingMachine();
	}

}

class Singleton_CoffeVendingMachine12 {
	// STEP 1: Create a variable which is 1. private 2,static 3.final
	private static Singleton_CoffeVendingMachine12 INSTANCE_SINGLETON_COFFE_VENDING_MACHINE;

	// Step 2: Create a private constructor
	private Singleton_CoffeVendingMachine12() {
	}

	// Step 3: Create the accessor to access the instance
	public static Singleton_CoffeVendingMachine12 getInstance() {
		if (INSTANCE_SINGLETON_COFFE_VENDING_MACHINE == null) {
			INSTANCE_SINGLETON_COFFE_VENDING_MACHINE = new Singleton_CoffeVendingMachine12();
		}

		return INSTANCE_SINGLETON_COFFE_VENDING_MACHINE;
	}

	// business methods
	public void bewCupOfCoffee() {
		System.out.println("A hot cup of coffee");
	}

}