package com.rohit.service;

import java.util.Scanner;

public class MergeSort {

	public int i, mid;
	

	public int arr[], L[], R[];
	int size=arr.length;
	Scanner sc = new Scanner(System.in);

	public void implimentationOfMergeSort() {

		System.out.println("Enter the array size :");
		size = sc.nextInt();

		System.out.println("Enter the elements for the array :");
		for (i = 0; i < size; i++) {
			System.out.print("Enter element at position" + i + ":");
			arr[i] = sc.nextInt();

		}


		sortArray(arr, 0, arr.length - 1);
	}

	private void sortArray(int[] arr, int L, int R) {

		if (L < R) {
			mid = (L + R) / 2;
			// sorting left array
			sortArray(arr, L, mid);

			// sorting right array
			sortArray(arr, R, mid + 1);

		}

	}

	public void mergeArray(int[] arr, int L, int R, int mid) {

		int n1 = mid + L - 1;
		int n2 = mid - R;

		int[] Larr = new int[n1];
		int[] Rarr = new int[n2];

		// copying elements from original array

		for (int i = 0; i < n1; i++) {
			Larr[i] = arr[L + i];

		}
		for (int j = 0; j < n2; j++) {

			Rarr[j] = arr[mid + 1 + j];

		}

		int i = 0, j = 0, k = L;

		while (i < n1 && j < n2) {
			if (Larr[i] <= Rarr[j]) {
				arr[k] = Larr[i];
				i++;
			} else {
				arr[k] = Rarr[j];
				j++;
			}

			k++;
		}

		// copy remaining elements of left array if any
		while (i < n1) {
			arr[k] = Larr[i];
			i++;
			k++;
		}

		// copy remaining elements of right array if any
		while (j < n2) {
			arr[k] = Rarr[j];
			j++;
			k++;
		}
	}

	

	public void display() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Value at position" + i + "is:" + arr[i]);

		}
	}
}
