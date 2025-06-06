package com.luminar;

public class ExplicitCastingExample { //explicit means big to small

	public static void main(String[] args) {
		double numOne=50.75;
		int numTwo=(int)numOne; /// if the (int) is not given then compiler warns by stating cannot convert from double to int
		
		System.out.println("Double value:"+numOne);
		System.out.println("Integer value:"+numTwo);

	}

}
