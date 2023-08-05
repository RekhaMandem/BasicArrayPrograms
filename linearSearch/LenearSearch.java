package com.java.linearSearch;

public class LenearSearch {
	boolean search(int arr[],int key)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==key)
			{
				return true;
			}
		}
		return false;
	}

}
