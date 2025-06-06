package com.array;

public class CommandLine {

	public static void main(String[] args) {
		
		System.out.println("First value :" +args[0]);
		for(int i=1;i<args.length;i++){
			System.out.println(args[i]);
		}
		
		for(String str:args)
			System.out.println(str);
	}

}

		
		