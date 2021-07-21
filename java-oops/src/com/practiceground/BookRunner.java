package com.practiceground;

public class BookRunner {

	public static void main(String args[]) {
		
		Book artOfComputerPrograming  = new Book("Art of Computer Programming");
		Book effectiveJava = new Book("Effective JAVA");
		Book cleanCode = new Book("Clean Code");
		
		System.out.println(artOfComputerPrograming.getBookName());
		System.out.println(effectiveJava.getBookName());
		System.out.println(cleanCode.getBookName());
		
		artOfComputerPrograming.setNumbOfCopies(20);
		System.out.println(artOfComputerPrograming.getNumbOfCopies());
	}
}
