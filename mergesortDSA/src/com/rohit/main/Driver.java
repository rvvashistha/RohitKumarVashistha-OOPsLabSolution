package com.rohit.main;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import com.rohit.service.MergeSort;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("Enter the size of the array : ");
		Scanner sc=new Scanner(System.in);
		
		int size=sc.nextInt();
		
		System.out.println("Enter the "+size+" elements");
		
		int array[]=new int[size];
		
		for (int i=0; i<size; i++) {
			array[i]=sc.nextInt();
			
		}
		
		MergeSort merge=new MergeSort();
		
       //merge.sort(array, size, size);
       merge.sort(array, 0, array.length-1);
		
		System.out.println();
		System.out.println("The array after sorting is :");
		for(int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
       
		
		
	
		
	}

}
