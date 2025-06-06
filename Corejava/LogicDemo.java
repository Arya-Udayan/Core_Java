class LogicDemo {
	public static void main(String args[]) {
		int numOne=60;
		int numTwo=35;
		int numThree=20;
		
		System.out.println((numOne>numTwo) && (numOne>numThree));

		System.out.println((numOne<numTwo) || (numTwo>numThree));
		System.out.println((numOne>numTwo) || (numThree>numTwo));

		System.out.println(!(numOne==numTwo));
		System.out.println(!(numTwo>numThree));

	}
}