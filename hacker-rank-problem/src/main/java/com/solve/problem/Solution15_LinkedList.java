package com.solve.problem;

import java.util.Scanner;


public class Solution15_LinkedList {

	public Node insert(Node head,int data) {
		//Complete this method


		if(head ==null)
			head = new Node(data);
		else {
			Node current_node =head;
			while(current_node.next!=null)
				current_node = current_node.next;
			current_node.next= new Node(data);
		}
		return head;
	}

	public  void display(Node head) {
		Node start = head;
		while(start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public  void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int N = sc.nextInt();

		while(N-- > 0) {
			int ele = sc.nextInt();
			head = insert(head,ele);
		}
		display(head);
		sc.close();
	}
}
