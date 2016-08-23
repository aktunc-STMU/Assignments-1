/*
 * Roberto Rodriguez
 * 19 Aug 2016
 * Assignment 01 - Guess The Number
 * EG 3392 - Java and Apps
 */

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {

		Random rand = new Random ();


		int user = 0;
		int ai;
		int guessCounter = 0;
		boolean win = false;

		// Random number Generator
		ai  = rand.nextInt(1000) + 1;


		Scanner keyboard  = new Scanner (System.in);

		System.out.println("Guess a Number between 1 and 1000");

		/*
		 ****** TEST CODE******
		System.out.println(ai);
		 */

		// Decision making process!
		while ( win == false ){

			user = keyboard.nextInt();

			if ( user == ai ){
				win = true;
				guessCounter++;
			}
			
			else if ( user > ai ){

				System.out.println( "Too High. Try Again" );
				guessCounter++;
				}
			
			else if ( ai > user ){
				System.out.println( "Too Low. Try Again" );
				guessCounter++;
				}

		}

		System.out.println("Congratulations. You Guessed the Number! It Took You "+guessCounter + " tries to find it");



	}
}


