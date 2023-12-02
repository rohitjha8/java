package com.rohit.variable;

public class Instance {
	String name="champ";
	String breed="labrador";
	int age=23;
	public static void main(String[] args) {
		Instance d1=new Instance();
		System.out.println(d1.age);
		System.out.println(d1.name);
		System.out.println(d1.breed);

	}

}
//this is instance variable which is declared inside the class and accesed inside the method