package com.rohit.notecount.service;

public class NoteCount {

	public void noteCountImplementaition(int[] notes, int amount) {

		int[] noteCount = new int[notes.length];

		try {
			for (int i = 0; i < notes.length; i++) {
				if (amount > notes[i]) {
					noteCount[i] = amount / notes[i];
					amount = amount - noteCount[i] * notes[i];

				}

			}
			if (amount > 0) {
				System.out.println("extra amount cannot be given with the highest denominaion ");
			} else {
				System.out.println("your payment in order to give min no of notes will be: ");
				for (int i = 0; i < notes.length; i++) {
					if (noteCount[i] != 0) {
						System.out.println(notes[i] + ":" + noteCount[i]);
					}
				}

			}

		} catch (ArithmeticException e) {
			System.out.println("Note of denomination is invaild!!");

		}

	}

}
