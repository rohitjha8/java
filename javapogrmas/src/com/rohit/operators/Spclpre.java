package com.rohit.operators;

public class Spclpre {
public static void main(String args[]) {
	int a=5;
	int b= ++a + ++a;
	System.out.println(b);
}
}
//in  preincrement it changes the value where it is declared in the mother declaration 
//in post it doesnt it checks only the child or that line vlaue