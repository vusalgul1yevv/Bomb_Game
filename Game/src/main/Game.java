package main;

import java.util.Scanner;

public class Game {
		static void start() {
			Scanner scanner = new Scanner(System.in);
			
	        System.out.println("\nHello! Welcome to the Bomb Game.\n" +
	                "In this game, you select a range and guess numbers within the range.\n" +
	                "One of the numbers contains a bomb.\n" +
	                "If you select it, it's a BOMB.\n" +
	                "Do you want to play?\n" +
	                "1) Yes  2) No");

	        int startGame = scanner.nextInt();
			 if (startGame == 1) {
		            PlayGame.begin(scanner);
		        } else {
		            System.out.println("Goodbye!");
		            scanner.close();
		}
	}	
}
