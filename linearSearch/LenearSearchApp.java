package com.java.linearSearch;

import java.util.Scanner;

public class LenearSearchApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array Length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elemnts into array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Array Contents Are.....");
		for (int i=0;i<=arr.length-1;i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Enter The Key Element");
		int key=scan.nextInt();
		LenearSearch LS=new LenearSearch();
		boolean res=LS.search(arr,key);
		if(res==true)
		{
			System.out.println("Element is found");
		}
		else {
			System.out.println("Element is not found");
		}
			

	}

}
