package com.rohit.variable;

 class Add {
	int z;
	void add(int x,int y) {
		z=x+y;
		System.out.println(z);
	}
}
class demo{
	public static void main(String args[]) {
		Add a1=new Add();
		int a=10;
		int b=23;
		a1.add(a,b);
	}
}
