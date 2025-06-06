package com.luminar;

public class ImplicitCastingExample { //conversion from small to big, its been done by the system itself

	public static void main(String[] args) {
		int numOne=50;
		double numTwo = numOne;//implicit casting from int to double
		
		System.out.println("Integer value:" +numOne);
		System.out.println("Double value:" +numTwo);

	}

}
