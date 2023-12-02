package com.rohit.array;
import java.util.Scanner;
public class Single {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<=4;i++)
		{
			System.out.println("Enter the age:");
			a[i] = scan.nextInt();
		}
	}

}
