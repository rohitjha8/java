package com.rohit.variable;


class Addition1 {
int a,b,c;
int add(int a,int b) {
	 c=a+b;
	 return c;
	
}
}
class demo3
{
	public static void main (String[] args) {
		Addition1 ref = new Addition1();
		int x,y,res;
		x=20;
		y=49;
		res=ref.add(x,y);
		System.out.println(res);
	}
}