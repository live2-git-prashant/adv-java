package java7.fundamentals;

import java.util.ArrayList;
import java.util.List;

public class PoluMorphismWithWrapper {
	public static void main(String[] args) {
		// primitiveTypes();
		primitiveTypesInCollections();
	}

	private static void primitiveTypesInCollections() {
		int i = 100;
		float f = 500.50f;

		List list = new ArrayList();
		list.add(i);
		list.add(f);
		list.add(new TestClass());
		System.out.println(list);

	}

	private static void primitiveTypes() {
		int i = 100;
		float f = 500.50f;

		Number numbers[] = new Number[2];
		// boxed and upcasted
		// specific object is stored in a generic array
		numbers[0] = new Integer(i);
		numbers[1] = new Float(f);

		for (Number number : numbers) {
			System.out.println(number);
		}

		// storing user defined + wrappers in the same object array.
		Object object[] = new Object[2];
		object[0] = numbers;
		object[1] = new TestClass();
	}
}

class TestClass {

}
