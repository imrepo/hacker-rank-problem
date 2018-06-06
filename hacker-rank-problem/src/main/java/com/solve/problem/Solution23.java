package com.solve.problem;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import javax.swing.tree.TreeNode;

public class Solution23 {

	static class Node{
	    Node left,right;
	    int data;
	    Node(int data){
	        this.data=data;
	        left=right=null;
	    }
	}
	
	static void levelOrder(Node root){
		int n = getHeight(root);
	    for(int i=1; i<=n; i++)
	      printGivenLevel(root, i);
	      
	    }
	
	
	static void levelOrder1(Node startNode){
	Queue<Node> queue=new LinkedList<Node>();
	queue.add(startNode);
	while(!queue.isEmpty())
	{
		Node tempNode=queue.poll();
		System.out.printf("%d ",tempNode.data);
		if(tempNode.left!=null)
			queue.add(tempNode.left);
		if(tempNode.right!=null)
			queue.add(tempNode.right);
	}
}
	
	static int getHeight(Node root){

		 return root == null ? -1 : 1 + Math.max(getHeight(root.left), getHeight(root.right));
		}

static void printGivenLevel (Node root ,int level)
   {
       if (root == null)
           return;
       if (level == 1)
           System.out.print(root.data + " ");
       else if (level > 1)
       {
           printGivenLevel(root.left, level-1);
           printGivenLevel(root.right, level-1);
       }
   }
	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	
	 public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         int T=sc.nextInt();
         Node root=null;
         while(T-->0){
             int data=sc.nextInt();
             root=insert(root,data);
         }
         levelOrder(root);
}
}
