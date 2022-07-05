package com.rohit.main;

import java.util.Scanner;

import com.rohit.service.InsertionSort;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("Enter the size of your array: ");
		Scanner sc=new Scanner(System.in);
		
		int size =sc.nextInt();
		
		System.out.println("Enter the "+size+" Elements :");
		
		int arr[]= new int[size];
		
		for(int i=0;i<size;i++) {
			
			arr[i]=sc.nextInt();
			
			}

		InsertionSort insertionSort=new InsertionSort();
		
		insertionSort.implimentationinsetionSort(arr);
		
		
		
		

	}

}
