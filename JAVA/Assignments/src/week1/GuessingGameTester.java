package week1;

import java.util.Scanner;

public class GuessingGameTester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		GuessingGame newGuessGame;
		String choice;
		while(true){
			System.out.println("Welcome to the Guessing Game");
			System.out.println("Enter the maximum number");
			int max = Integer.parseInt(scanner.nextLine());
			//System.out.println(max);
			newGuessGame = new GuessingGame(max);
			//System.out.println("max number is " + newGuessGame.getMax());
			System.out.println("Enter the number of guesses allowed:");
			int maxGuessesAllowed = Integer.parseInt(scanner.nextLine());
			newGuessGame.newGame(maxGuessesAllowed);
			System.out.println("answer is:" + newGuessGame.getAnswer());
			System.out.println("Enter your guess, number should be between 0 and " + newGuessGame.getMax());
			while(!newGuessGame.getGameOver()){
			int guessedNumber = Integer.parseInt(scanner.nextLine());
			System.out.println(newGuessGame.guess(guessedNumber));
			}
			System.out.println("Would you like to play another game, enter Y for yes, N for no.");
			choice = scanner.nextLine();
			if(choice.equals("n") || choice.equals("N")){
				System.out.println("End");
				break;
			}
		}
		scanner.close();

	}
}
