

import java.util.Arrays;
import java.util.List;

public class Lamda_Demo {

	public static void main(String[] args) {
		//Old way:
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		for(Integer n: list) {
		    System.out.println(n);
		}
		 
		//New way:
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		list1.forEach(n -> System.out.println(n));
		 
		 
		//or we can use :: double colon operator in Java 8
		list.forEach(System.out::println);


	}

}
