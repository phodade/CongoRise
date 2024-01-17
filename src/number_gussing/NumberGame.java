package number_gussing;

import java.util.Random;
import java.util.Scanner;

public class NumberGame
{
	    public static void main(String[] args)
	    {
	        Random random = new Random();
	        Scanner scanner = new Scanner(System.in);

	        int lowerBound = 1;
	        int upperBound = 100;
	        int generatedNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
	        int maxAttempts = 5;
	        int attempts = 0;

	        System.out.println("Welcome to Guess the Number Game!!!");
	        System.out.println("I have generated a number between " + lowerBound + " and " + upperBound + ". Try to guess it!!");

	        while (attempts < maxAttempts) {
	            System.out.print("Enter your guess: ");
	            int userGuess = scanner.nextInt();
	            attempts++;

	            if (userGuess == generatedNumber) 
	            {
	                System.out.println("Congratulations....!! You guessed the correct number in " + attempts + " attempts.");
	                break;
	            } 
	            else if (userGuess < generatedNumber) 
	            {
	                System.out.println("Too low! Try again.");
	            } else 
	            {
	                System.out.println("Too high! Try again.");
	            }

	            if (attempts == maxAttempts) {
	            	
	                System.out.println("Sorry..., you've reached the maximum number of attempts. The correct number was " + generatedNumber);
	            }
	        }

	        scanner.close();
	    }

	
	}


