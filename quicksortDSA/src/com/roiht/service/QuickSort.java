package com.roiht.service;

import java.util.Scanner;

public class QuickSort {

	public int i, j, l, r;
	public static int PIVOT;
	public int array[] = { 22, 0, 4, 0, 11, 1, -2 };

	Scanner sc = new Scanner(System.in);

	// creating quick sort method:-
	public void implimentationOfQuickSort() {
		l = 0;
		r = array.length - 1;

		printValues();
		divideArray();

	}

	private void divideArray(int array, int l,int r) {
		
		if(l<r) {
			int pi=partition(array,l,r);
		}

	}

	private int partition(int array2, int l2, int r2) {
		
		
	
		
		
		
	}

	private void printValues() {

		for (int i = 0; i < array.length; i++) {
			System.out.println("value at the position " + i + " is " + array[i]);

		}
		System.out.println();

	}

}
