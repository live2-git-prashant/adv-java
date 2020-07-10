package java8.streams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamPerformanceTest {
	public static void main(String[] args) {
		long stime=sequentialStream();
		long ptime=	parallelStream();
		
		System.out.println("Sequential Stream time"+stime);
		System.out.println("Parallel Stream time"+ptime);
		System.out.println("parallel Stream reduced"+ (stime-ptime)+"nano seconds");
		
		//noStream();
	}

	private static long sequentialStream() {
		// create the source list
		List<Integer> productList = new ArrayList<Integer>();

		productList.add(1000);
		for (int i = 0; i < 100; i++) {
			int lastValue = productList.get(i);
			productList.add(lastValue + 1000);
		}
		System.out.println("Sequential Stream");
		System.out.println("BEFORE PROCESSING " + productList);
		// System.out.println("Input List ---> " + productList);

		// Returns a sequential Stream with this collection as its source
		
		List serialList = new ArrayList();
		long started = System.nanoTime();
		//productList.stream().filter(element -> (element > 5000 && element < 10000)).forEach(System.out::println);
		
		productList.stream().filter(element -> (element > 5000 && element < 10000)).forEach((element) -> {
			System.out.println("seqential > " + Thread.currentThread().getName() + " > " + element);
			serialList.add(element);
		});
		
		long finished = System.nanoTime();
		
		long timeElapsed = finished-started;
		System.out.println("Serial List--->"+serialList);
		System.out.println("Sequential : "+timeElapsed);
		System.out.println("After PROCESSING " + productList);
		return timeElapsed;
	}

	private static long parallelStream() {
		// create the source list
		List<Integer> productList = new ArrayList<Integer>();

		productList.add(1000);
		for (int i = 0; i < 100; i++) {
			int lastValue = productList.get(i);
			productList.add(lastValue + 1000);
		}
		System.out.println("parallelStream");
		System.out.println("BEFORE PROCESSING " + productList);
		// System.out.println("Input List ---> " + productList);

		// Returns a parallel Stream with this collection as its source
		
		List parallelList = new ArrayList();
		long started = System.nanoTime();
		//productList.stream().filter(element -> (element > 5000 && element < 10000)).forEach(System.out::println);
		
		productList.parallelStream().filter(element -> (element > 5000 && element < 10000)).forEach((element) -> {
			System.out.println("parallel > " + Thread.currentThread().getName() + " > " + element);
			parallelList.add(element);
		});
		
		long finished = System.nanoTime();
		
		long timeElapsed = finished-started;
		System.out.println("Parallel List--->"+parallelList);
		System.out.println("Sequential : "+timeElapsed);
		System.out.println("After PROCESSING " + productList);
		return timeElapsed;
	}
	private static long noStream() {
		// create the source list
		List<Integer> productList = new ArrayList<Integer>();

		productList.add(1000);
		for (int i = 0; i < 100; i++) {
			int lastValue = productList.get(i);
			productList.add(lastValue + 1000);
		}
		System.out.println("BEFORE PROCESSING " + productList);
		// System.out.println("Input List ---> " + productList);

		// Returns a sequential Stream with this collection as its source
		System.out.println("No Stream");
		for (int i = 0; i < 100; i++) {
			if(productList.get(i)>5000)
				System.out.println(productList.get(i));
		}
		
		List serialList = new ArrayList();
		return 0;
	}
	
	
	
	
}