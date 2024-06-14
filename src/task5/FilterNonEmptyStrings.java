package task5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNonEmptyStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create a list of strings
        List<String> strings = Arrays.asList("abc", "bc", "efg", "abcd", "", "jkl");

        // Filter non-empty strings using the Stream API
        List<String> nonEmptyStrings = strings.stream()
                                              .filter(s -> !s.isEmpty())
                                              .collect(Collectors.toList());

        // Print the list of non-empty strings
        System.out.println(nonEmptyStrings);
    }

	}


