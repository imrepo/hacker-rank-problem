package com.solve.problem;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Solution18 {

	private Stack stack;
	private LinkedList queue;

	public Solution18() {
		this.stack = new Stack();
		this.queue = new LinkedList();
	}

	private void pushCharacter(char ch) {
		this.stack.push(ch);
	}

	private void enqueueCharacter(char ch) {
		this.queue.addLast(ch);
	}

	private char popCharacter() {
		return (Character) this.stack.pop();	
	}

	public char dequeueCharacter() {
		return (Character) this.queue.remove(0);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		// Convert input String to an array of characters:
		char[] s = input.toCharArray();

		// Create a Solution object:
		Solution18 p = new Solution18();

		// Enqueue/Push all chars to their respective data structures:
		for (char c : s) {
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}

		// Pop/Dequeue the chars at the head of both data structures and compare them:
		boolean isPalindrome = true;
		for (int i = 0; i < s.length/2; i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
				isPalindrome = false;                
				break;
			}
		}

		//Finally, print whether string s is palindrome or not.
		System.out.println( "The word, " + input + ", is " 
				+ ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
	}
}
