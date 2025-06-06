class DefaultValueDemo {
	public static void main(String args[]) {
		int first;
		System.out.println(first); //an error will occur bcs this variable wont take the default value as its been declared inside a function or within the main function as an argument.
		first = first+15;
		System.out.println(first);
	}
}