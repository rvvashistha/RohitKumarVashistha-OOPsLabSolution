package com.rohit.service;

import java.util.Scanner;

public class TransactionService {

	public void checkTransaction(int[] array, int targetNo) {
		Scanner sc = new Scanner(System.in);

		while (targetNo-- != 0) {
			int flag = 0;
			int target;

			System.out.println("enter the value of target: ");
			target = sc.nextInt();

			int sum = 0;

			for (int i = 0; i < array.length; i++) {
				sum += array[i];

				if (sum >= target) {
					System.out.println("Target achieved after " + (i + 1) + " transaction");
					flag = 1;
					break;

				}
			}
			if (flag == 0) {
				System.out.println("given target is not achieved.");
			}

		}

	}

}
