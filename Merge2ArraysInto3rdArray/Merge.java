package com.java.Merge2ArraysInto3rdArray;

public class Merge {

	int[] mergeArray(int arr1[], int arr2[])

	{

		int res[] = new int[arr1.length + arr2.length];

		int i = 0;

		int index = 0;

		while (i <= arr1.length - 1)

		{

			res[index] = arr1[i];

			i++;

			index++;

		}

		i = 0;

		while (i <= arr2.length - 1)

		{

			res[index] = arr2[i];

			i++;

			index++;

		}

		return res;

	}

}