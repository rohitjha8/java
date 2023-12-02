package com.rohit.variable;

 class Addition {
 int a,b,c;
int adde() {
	 a=10;
	 b=395;
	 c=a+b;
	 return c;
	
 }
}
class demo2
{
	public static void main (String args[]) {
		Addition ref = new Addition();
		int res;
		res=ref.adde();
		System.out.println(res);
	}
}
//without input and with output

