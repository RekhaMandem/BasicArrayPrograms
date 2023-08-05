package com.java.ReplaceNegativeElements;

import java.util.Scanner;

public class ReplaceApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Array-1 Length");

		int arr1[] = new int[scan.nextInt()];

		System.out.println("Enter " + arr1.length + " number of elements which includes both +ve and -ve numbers");

		for (int i = 0; i <= arr1.length - 1; i++)

		{

			arr1[i] = scan.nextInt();

		}

		System.out.println("Array Elements Before Replacing negative numbers with zero");

		for (int x : arr1) {

			System.out.print(x + " ");

		}

		Replace replace = new Replace();

		replace.arrayReplace(arr1);

		System.out.println();

		System.out.println("Array Elements After Replacing negative numbers with zero");

		for (int x : arr1) {

			System.out.print(x + " ");

		}

	}

}
