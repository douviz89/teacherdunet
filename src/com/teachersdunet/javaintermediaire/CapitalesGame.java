package com.teachersdunet.javaintermediaire;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CapitalesGame {

	public static void main(String[] args) {
		final int NUMBER_OF_QUESTIONS = 5;
		int score = 0, index;
		String pays, capitale, userAnswer;
		char replayAnswer = 0;

		ArrayList<Integer> indexesAlreadyTaken = new ArrayList<>();

		String[][] data = getData();

		Scanner clavier = new Scanner(System.in);

		do {
			indexesAlreadyTaken.clear();

			for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
				// Choisir un pays de maniere aleatoire
				do {
					Random random = new Random();
					index = random.nextInt(data.length);

				} while (indexesAlreadyTaken.contains(index));

				indexesAlreadyTaken.add(index);

				pays = data[index][0];
				capitale = data[index][1];

				System.out.printf("Quelle est la capitale de ce pays: %s ?\n", pays);
				userAnswer = clavier.nextLine();

				if (capitale.equalsIgnoreCase(userAnswer)) {
					System.out.println("Bonne réponse !");
					score++;
				} else {
					System.out.printf("Mauvaise réponse, c'était %s", capitale);
				}
			}

			System.out.printf("C'est terminé. << Score: %d/%d >>\n\n", score, NUMBER_OF_QUESTIONS);

			do {
				System.out.println("Voulez-vous rejouer ? (o/n)");
				replayAnswer = clavier.nextLine().toLowerCase().charAt(0);

			} while (replayAnswer != 'o' && replayAnswer != 'n');

		} while (replayAnswer == 'o');

		System.out.println("\n Bye Bye ...");
		System.out.println("Appuyer sur la touche <Entrée> pour quitter !");
		clavier.nextLine();
		clavier.close();

	}

	static String[][] getData() {
		String[][] data = { { "Sengal", "Dakar" }, { "France", "Paris" }, { "Nigeria", "Abuja" },
				{ "Algerie", "Alger" }, { "Italie", "Rome" }, { "Espagne", "Madrid" }, { "Monaco", "Monaco" },
				{ "Perou", "Lima" } };

		return data;
	}

}
