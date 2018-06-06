package com.solve.problem;

import java.util.Scanner;

public class Solution22 {
	
	static class Node{
	    Node left,right;
	    int data;
	    Node(int data){
	        this.data=data;
	        left=right=null;
	    }
	}
	public static int getHeight2(Node root){
	      //Write your code here
	        if(root == null){
	            return 0;
	        } else {
	            int leftleaf = getHeight2(root.left);
	            int rightleaf = getHeight2(root.right);
	        if(leftleaf >rightleaf)
	            return leftleaf+1;
	            else
	                return rightleaf+1;
	            }
	        
	    }

	public static int getHeight(Node root){


		if (root == null)
			return 0;
		else
		{
			/* compute the depth of each subtree */
			int lefth = getHeight(root.left);
			int righth = getHeight(root.right);

			if (lefth > righth) {
				return lefth + 1;
			} else {
				return righth + 1;
			}
		}
	}
			
	public static int getHeight3(Node root){

		 return root == null ? -1 : 1 + Math.max(getHeight(root.left), getHeight(root.right));
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
        int height=getHeight(root);
        System.out.println(height);
    }

}
