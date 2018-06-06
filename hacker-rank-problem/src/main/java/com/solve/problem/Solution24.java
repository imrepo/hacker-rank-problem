package com.solve.problem;

import java.util.Scanner;

public class Solution24 {

	public static Node removeDuplicates(Node head) {
		//Write your code here
		/*Node temp = head;
		
		Node next;
		
		if(head!=null) { 
			while(temp.next !=null) {
				if(temp.data==temp.next.data) {
					next = temp.next.next;
					temp.next = null;
					temp.next = next;
				} else {
					temp = temp.next;
				}
			}
		}
		return temp;*/
		
		  if(head == null || head.next == null)
	            return head;
	 
	        Node p = head;
	 
	        while( p!= null && p.next != null){
	            if(p.data == p.next.data){
	                p.next = p.next.next;
	            }else{
	                p = p.next; 
	            }
	        }
	 
	        return head;

	}
		
	public static  Node insert(Node head,int data)
	{
		Node p=new Node(data);			
		if(head==null)
			head=p;
		else if(head.next==null)
			head.next=p;
		else
		{
			Node start=head;
			while(start.next!=null)
				start=start.next;
			start.next=p;

		}
		return head;
	}
	public static void display(Node head)
	{
		Node start=head;
		while(start!=null)
		{
			System.out.print(start.data+" ");
			start=start.next;
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Node head=null;
		int T=sc.nextInt();
		while(T-->0){
			int ele=sc.nextInt();
			head=insert(head,ele);
		}
		head=removeDuplicates(head);
		display(head);

	}

}
