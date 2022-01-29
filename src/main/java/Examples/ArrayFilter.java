package Examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayFilter {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Elena", "Bianca", "Lucas", "Herman", "Erika");

		// Filter then name star with
		String result = names.stream()
				        .filter(name -> name.startsWith("E"))
				        .collect(Collectors.joining(", "));

		if (!result.isEmpty())
			System.out.println(result);
		else {
			System.out.println("Not found!");
		}
		
		// Drop while
		String result2 = names.stream()
				         .dropWhile(name -> name.length() < 6)
				         .collect(Collectors.joining(", "));
		
		System.out.println(result2);
		
		// Swap items at indexes	
		Collections.swap(names, 2,3);
		
		System.out.println(names);
		
		// Shuffling the list
		Collections.shuffle(names);
		
		System.out.println(names);		
		
	}

}
