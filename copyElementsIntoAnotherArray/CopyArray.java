package com.java.copyElementsIntoAnotherArray;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Array Length");
		int arr1[] = new int[scan.nextInt()];
		System.out.println("Enter " + arr1.length + " Elements to array");
		for (int i = 0; i <= arr1.length - 1; i++) {
			arr1[i] = scan.nextInt();
		}
		// copying logic
		System.out.println("Create a new array to copy first array elements of length arr1.length ");
		int arr2[] = new int[arr1.length];
		System.out.println("Copying arr1 array elements into arr2 array");
		for (int i = 0; i <= arr1.length - 1; i++) {
			arr2[i] = arr1[i];
		}
		System.out.println("First Array Contents Are.....");
		for (int i=0;i<=arr1.length-1;i++) {
			System.out.print(arr1[i] + " ");

		}
		System.out.println();
		System.out.println("Second Array Contents Are.....");
		for (int i=0;i<=arr2.length-1;i++) {
			System.out.print(arr2[i] + " ");

		}

	}

}
