package com.practiceground;

/***
 * 
 * @author practice ground 
 * 
 * Create Book class, which can have 3 instances such as 
 * 1. Effective JAVA 
 * 2. Art of Computer Programing 
 * 3. Clean code 
 *
 */
public class Book {

	private String bookNmae;
	private int numbOfCopies;
	
	public int getNumbOfCopies() {
		return numbOfCopies;
	}

	public void setNumbOfCopies(int numbOfCopies) {
		this.numbOfCopies = numbOfCopies;
	}

	public Book(String bookName) {
		this.bookNmae = bookName;
	}
	
	public String getBookName() {
		return this.bookNmae;
	}
}
