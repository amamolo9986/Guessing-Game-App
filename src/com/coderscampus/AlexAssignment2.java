package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class AlexAssignment2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int randomNumber = random.nextInt(101);

		System.out.println("Guess a number between 1 and 100");
		//System.out.println(randomNumber);

		int numberOfGuesses = 0;
		while (numberOfGuesses < 5) {
			int guess = scan.nextInt();
			numberOfGuesses++;

			if (guess < 1 || guess > 100 && guess == numberOfGuesses--) {
				System.out.println("That number is not between 1 and 100. Please try again.");
			} else if (guess < randomNumber && numberOfGuesses < 5) {
				System.out.println("Pick a higher number");
			} else if (guess > randomNumber && numberOfGuesses < 5) {
				System.out.println("Pick a lower number");
			} else if (numberOfGuesses == 5) {
				System.out.println("You lose! The number was " + randomNumber);
			}

			if (guess == randomNumber && numberOfGuesses < 5) {
				System.out.println("You win!");
				break;
			}
		}
	}
}
