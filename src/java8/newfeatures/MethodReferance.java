package java8.newfeatures;

import java.util.ArrayList;
import java.util.List;

public class MethodReferance {

	public static void main(String[] args) {

		objectInstanceMethodReferance();

	}

	private static void objectInstanceMethodReferance() {
		List<String> namesList = new ArrayList<String>();
		namesList.add("Tony");
		namesList.add("Robinns");

		// @FunctionaInterface
		// public interface Consumer<T>
		// accept(T t)
		// Void accept(String item) {System.out.println(item);}
		
		
		// namesList.forEach(item -> System.out.println(item));

		namesList.forEach(System.out::println);
		
		// Iterate the java 8 way
				namesList.forEach(item -> {
					if (item.length() > 4)
						System.out.println("Condition : " + item);
				});
				// Filtering the results

				// Iterating an array with method reference
				namesList.forEach(System.out::println);
//			    default void forEach(Consumer<? super T> action) {
//			        Objects.requireNonNull(action);
//			        for (T t : this) {
//			            action.accept(t);
//			        }
//			    }
			}
		}