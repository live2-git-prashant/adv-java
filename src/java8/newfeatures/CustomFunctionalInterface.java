package java8.newfeatures;

public class CustomFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArrayIntegers = { 5, 6, 7, 8 ,9};
		//useing a static method referance
		Counter counter = Utils::countElements;
		System.out.println(counter.count(intArrayIntegers));
		
		Utils objUtils = new Utils();
		Counter counterInst = objUtils::countElementInstance;
		System.out.println(counterInst.count(intArrayIntegers));
		
	}
}

@FunctionalInterface
interface Counter {
	int count(Object[] objArray);

	/*
	 * int count=Utils.countElement(objArray); return count;
	 */
}

class Utils {

	public static int countElements(Object[] array) {
		return array.length;
	}

	
	public int countElementInstance(Object[] array) { return array.length; }
	
}
