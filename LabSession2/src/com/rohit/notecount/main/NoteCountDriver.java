package com.rohit.notecount.main;

import java.util.Scanner;

import com.rohit.notecount.service.MergeSortImplenetation;
import com.rohit.notecount.service.NoteCount;

public class NoteCountDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of currency donomination: ");
		int size = sc.nextInt();

		int[] notes = new int[size];
		System.out.println("Enter the currency denomination value: ");
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();

		}

		System.out.println("Enter the amount you want to pay : ");
		int amount = sc.nextInt();
		MergeSortImplenetation mergreSort = new MergeSortImplenetation();
		NoteCount noteCount = new NoteCount();

		mergreSort.sort(notes, 0, notes.length - 1);
		noteCount.noteCountImplementaition(notes, amount);
	}

}
