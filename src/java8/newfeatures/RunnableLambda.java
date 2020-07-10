package java8.newfeatures;

public class RunnableLambda {

	public static void main(String[] args) {

		//traditionalThreading();
		//implementsRunnable();
		//usingAnonymous();
		//usingRunnableLambda();
		usingLambdaConcise();
	}

	private static void usingLambdaConcise() {
		new Thread(()->System.out.println("Anonymous class used for child LAMBDA Child Thread with single exp Concise")).start();
	}

	private static void usingRunnableLambda() {
		Runnable runnableLambda =() -> System.out.println("Anonymous class used for child LAMBDA");
		Thread thread = new Thread(runnableLambda);
		thread.start();
	}

	private static void usingAnonymous() {
		new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Anonymous class used here for child thread");
			}
		}.start();
	}

	private static void implementsRunnable() {
		TestThreadRunnable testThreadRunnable= new TestThreadRunnable();
		Thread thread=new Thread(testThreadRunnable);
		thread.start();
	}

	private static void traditionalThreading() {
		String threadNameString = Thread.currentThread().getName();
		System.out.println(threadNameString);
		System.out.println(Thread.currentThread().getId());
		TestThread testThread = new TestThread();
		testThread.start();
	}

}

class TestThread extends Thread {
	@Override
	public void run() {
		Thread.currentThread().setName("Child Thread Renamed");
		System.out.println(Thread.currentThread().getId());
		System.out.println("Child Thread:TestThread Run()");
		System.out.println(Thread.currentThread().getName());
	}
}

class TestThreadRunnable implements Runnable{
	
	public void run() {
		System.out.println("Implementing runnable....");
	};
} 
