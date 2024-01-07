package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class AlexAssignment2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;

		// the reason that this isnt (101) is because that means 0-100 - and we can't
		// have the random number generate as 0. So to fix this we simply add +1
		// after the parenthesis, this means add one to the starting number.
		// and since we've added 1, we change the number in the parentheses from
		// 101 to 100

		System.out.println("Guess a number between 1 and 100");
		// System.out.println(randomNumber);

		int numberOfGuesses = 0;
		while (numberOfGuesses < 5) {
			int guess = scan.nextInt();

			if (guess < 1 || guess > 100 && guess != numberOfGuesses) {
				System.out.println("That number is not between 1 and 100. Please try again.");
				continue;
			} else {
				numberOfGuesses++;
				if (guess == randomNumber) {
					System.out.println("You win!");
					break;
				} else if (guess < randomNumber && numberOfGuesses < 5) {
					System.out.println("Pick a higher number");
				} else if (guess > randomNumber && numberOfGuesses < 5) {
					System.out.println("Pick a lower number");
				}
				if (numberOfGuesses == 5) {
					System.out.println("You lose! The number was " + randomNumber);
				}
			}
		}
		scan.close();
	}
}
