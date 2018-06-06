package com.solve.problem;

import java.util.Scanner;

abstract class Book {

	String title;
	String author;

	Book(String title, String author){

		this.title = title;
		this.author = author;
	}

	abstract void display();
} 
class MyBook extends Book{
	String title;
	String author;
	int price;

	MyBook(String title, String author, int price) {
		super(title, author);
		this.title = title;
		this.author = author;
		this.price = price;

	}

	@Override
	void display() {
		String newLine = System.getProperty("line.separator");
		System.out.println("Title: " + title +  " " + newLine + "Author: " + author + " " + newLine + "Price: " + price + " " + newLine);

	}
}
	/* class Solution0 {
	 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String title = scanner.nextLine();
		String author = scanner.nextLine();
		int price = scanner.nextInt();
		scanner.close();

		Book book = new MyBook(title, author, price);
		book.display();
	}*/
