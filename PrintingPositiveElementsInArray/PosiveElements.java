package com.java.PrintingPositiveElementsInArray;

import java.util.Scanner;

public class PosiveElements {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The ArrayLength");
		int []arr=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements into array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Positive elements in array are....");
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
	}

}
