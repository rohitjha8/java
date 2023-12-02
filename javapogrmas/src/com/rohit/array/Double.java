package com.rohit.array;

import java.util.Scanner;

public class Double {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[2][5];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				System.out.println("enter the age of the class"+i+" student"+j);
				a[i][j]=scan.nextInt();
			}
		}
	}

}
