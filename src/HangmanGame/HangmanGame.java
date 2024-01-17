package HangmanGame;

import java.util.Scanner;
import java.util.Random;

public class HangmanGame 
{
    public static void main(String[] args)
    {
        String[] words = {"java", "programming", "computer", "code", "game","pratiksha"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String wordToGuess = words[random.nextInt(words.length)];
        char[] displayWord = new char[wordToGuess.length()];
        for (int i = 0; i < wordToGuess.length(); i++) {
            displayWord[i] = '_';
        }

        int maxIncorrectGuesses = 3;
        int incorrectGuesses = 0;

        System.out.println("Welcome to Hangman!");
        System.out.println("Try to guess the word.");

        while (incorrectGuesses < maxIncorrectGuesses) 
        {
            System.out.println("Current word: " + String.valueOf(displayWord));
            System.out.print("Enter a letter: ");
            char guessedLetter = scanner.next().charAt(0);

            if (containsLetter(wordToGuess, guessedLetter))
            {
                updateDisplayWord(wordToGuess, displayWord, guessedLetter);
                System.out.println("Correct!");
            } 
            else 
            {
                incorrectGuesses++;
                displayHangman(incorrectGuesses);
                System.out.println("Incorrect guesses: " + incorrectGuesses);
            }

            if (String.valueOf(displayWord).equals(wordToGuess))
            {
                System.out.println("Congratulations! You guessed the word: " + wordToGuess);
                break;
            }
        }

        if (incorrectGuesses == maxIncorrectGuesses) {
            System.out.println("Sorry, you ran out of attempts. The correct word was: " + wordToGuess);
        }

        scanner.close();
    }

    private static boolean containsLetter(String word, char letter)
    {
        return word.indexOf(letter) != -1;
    }

    private static void updateDisplayWord(String word, char[] display, char letter)
    {
        for (int i = 0; i < word.length(); i++) 
        {
            if (word.charAt(i) == letter)
            {
                display[i] = letter;
            }
        }
    }

    private static void displayHangman(int incorrectGuesses) 
    {
        switch (incorrectGuesses)
        {
            case 1:
                System.out.println("  ___");
                break;
            case 2:
                System.out.println("  ___");
                System.out.println("    |");
                break;
            case 3:
                System.out.println("  ___");
                System.out.println("    |");
                System.out.println("    O");
                break;
            case 4:
                System.out.println("  ___");
                System.out.println("    |");
                System.out.println("    O");
                System.out.println("    |");
                break;
            case 5:
                System.out.println("  ___");
                System.out.println("    |");
                System.out.println("    O");
                System.out.println("   /|\\");
                break;
            case 6:
                System.out.println("  ___");
                System.out.println("    |");
                System.out.println("    O");
                System.out.println("   /|\\");
                System.out.println("   / \\");
                break;
        }
    }
}

