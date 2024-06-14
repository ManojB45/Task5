package task5;

import java.util.stream.Stream;

public class ConvertToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create a stream of strings
        Stream<String> names = Stream.of("aBc", "d", "ef");

        // Convert each string to uppercase using the map() method
        Stream<String> upperCaseNames = names.map(String::toUpperCase);

        // Print each uppercase string
        upperCaseNames.forEach(System.out::println);
	}

}
