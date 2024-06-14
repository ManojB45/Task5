package task5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Prompt the user for their birthdate
	        System.out.println("Enter your birthdate (YYYY-MM-DD): ");
	        String birthdateInput = scanner.nextLine();

	        // Parse the birthdate input into a LocalDate object
	        LocalDate birthdate = LocalDate.parse(birthdateInput);

	        // Get the current date
	        LocalDate currentDate = LocalDate.now();

	        // Calculate the age
	        int age = Period.between(birthdate, currentDate).getYears();

	        // Output the age
	        System.out.println("You are " + age + " years old.");

	        scanner.close();
	    }
	}


