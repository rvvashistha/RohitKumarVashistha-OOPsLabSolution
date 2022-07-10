package com.rohit.main;

import java.util.Scanner;

import com.rohit.service.TransactionService;

public class TransactionMain {

	public static void main(String[] args) throws Exception {
		System.out.println("Enter the size of the array : ");
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		System.out.println("Enter the " + size + " elements : ");

		int[] array = new int[size];

		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();

		}

		System.out.println("Enter the total number of target that need to be achieved : ");
		int target = sc.nextInt();

		TransactionService transactionService = new TransactionService();
		// calling the method
		transactionService.checkTransaction(array, target);

	}

}
