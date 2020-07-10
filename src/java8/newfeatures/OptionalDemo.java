package java8.newfeatures;

import java.util.ArrayList;
import java.util.Optional;

public class OptionalDemo {
	static String testString;

	public static void main(String[] args) {
		Person person = null;
		ArrayList arrayList = null;
		Integer numbers[] = null;

		if (Math.random() > 0.5) {
			numbers = new Integer[3];
			numbers[0] = 100;
			testString = "Welcome";
			person = new Person();
			arrayList = new ArrayList();
			arrayList.add("smile");
		}
		Optional optionalString = Optional.ofNullable(testString);
		if (optionalString.isPresent()) {
			System.out.println(testString.length());
			String string = optionalString.get().toString();
			System.out.println(testString.length());
		} else {
			System.out.println("String may be null");
		}
		
		Optional optionalAL = Optional.ofNullable(arrayList);
		if (optionalAL.isPresent()) {
			System.out.println(arrayList.size());
			String string = optionalAL.get().toString();
			System.out.println(string);
		} else {
			System.out.println("ArrayList may be null");
		}
	
		Optional optionalNos = Optional.ofNullable(numbers);
		if (optionalNos.isPresent()) {
			System.out.println(numbers.length);
			String string =String.valueOf(numbers.length);

			System.out.println(string);
		} else {
			System.out.println("Nos may be null");
		}
		
		Optional optionalPer = Optional.ofNullable(person);
		if (optionalPer.isPresent()) {
			System.out.println("Perobject is  null");
		}
		else {
			System.out.println("Perobject is  empty");
		}
			
		
	}
}

class Person {
	private String name = "Tester";

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
}