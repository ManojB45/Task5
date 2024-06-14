package task5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SpecialGifts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // List of student names
        List<String> studentNames = Arrays.asList("Alice", "Bob", "Andrew", "Catherine", "Anna", "David", "Amy", "Ethan", "Arthur", "Brian");

        // Filter the students whose names start with "A"
        List<String> specialGiftStudents = studentNames.stream()
                                                       .filter(name -> name.startsWith("A"))
                                                       .collect(Collectors.toList());

        // Print the list of students who will receive special gifts
        System.out.println("Students receiving special gifts: " + specialGiftStudents);
    }
	}


