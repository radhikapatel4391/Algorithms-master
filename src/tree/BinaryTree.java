package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree 
{
	private TreeNode root = null;
	
	public BinaryTree(int key) {
		root = new TreeNode(key);
	}
	public void inOrderPrint()
	{
		traverseInOrder(root);
	}
	public void preOrderPrint()
	{
		traversePreOrder(root);
	}
	public void postOrderPrint()
	{
		traversePostOrder(root);
	}
	private void traverseInOrder(TreeNode node ) {		
	    if (node != null) {
	        traverseInOrder(node.left);
	        System.out.print(" " + node.key);
	        traverseInOrder(node.right);
	    }
	}
	private void traversePreOrder(TreeNode node) {
	    if (node != null) {
	        System.out.print(" " + node.key);
	        traversePreOrder(node.left);
	        traversePreOrder(node.right);
	    }
	}
	private void traversePostOrder(TreeNode node) {
	    if (node != null) {
	        traversePostOrder(node.left);
	        traversePostOrder(node.right);
	        System.out.print(" " + node.key);
	    }
	}
 public void BSTPrint() {
	 Queue<TreeNode> nodes = new LinkedList<TreeNode>();
	 nodes.add(root);
	 while(!nodes.isEmpty())
	 {
		 TreeNode current = nodes.remove();
		 System.out.print(" "+current.key);
		 if(current.left!=null)
				 nodes.add(current.left);
		 if(current.right!=null)
		 nodes.add(current.right);
	 }
 }  
	public void add(int key)
	{
		TreeNode newNode = new TreeNode(key);
		TreeNode temp = root;		
		while(temp!=null)
		{
			if(key<temp.key)
			{
				if(temp.left!=null)
				{
					temp = temp.left;					
				}else
				{
					temp.left = newNode;
					return;
				}
				
			}
			else
			{
				if(temp.right!=null)
				{
					temp = temp.right;					
				}else
				{
					temp.right = newNode;
					return;
				}				
			}
		}		
	}

	
	public boolean findelement(int key)
	{
		TreeNode temp = root;		
		while(temp!=null)
		{
			if(key<temp.key)
			{			
					temp = temp.left;
			}
			else if(key>temp.key)
			{
					temp = temp.right;
			}else {
				return true;
			}
		}	
		return false;
	}	
	public boolean remove(int key)
	{
		TreeNode temp = root;
		TreeNode pre = null;
		boolean leftFlag = false;
		while(temp!=null)
		{
			
			if(key<temp.key)
			{		pre = temp;
					leftFlag = true;
					temp = temp.left;
			}
			else if(key>temp.key)
			{
				pre = temp;	
				leftFlag = false;
				temp = temp.right;
			}else 
			{
				//delete child
				if(temp.left==null && temp.right == null)
				{
					if(pre==null)
					{
						root = null;
						
					}
					else if(leftFlag)
					{
						pre.left = null;
						
					}else {
						pre.right = null;
						
					}
					
				}
				else if(temp.left==null)
				{ //only right child exist.
					if(pre==null)
					{
						root = temp.right;
						
					}
					else if(leftFlag)
					{
						pre.left = temp.right;
						
					}else {
						pre.right = temp.right;
						
					}
					
				}else if(temp.right==null)
				{ //only left child exist. 

					if(pre==null)
					{
						root = temp.left;
						
					}
					else if(leftFlag)
					{
						pre.left = temp.left;
						
					}else {
						pre.right = temp.left;
						
					}
				}else {
					//both child exist.
					TreeNode suc = getSuccessor(temp);
					suc.left = temp.left; //suc will be search from right....
					if(pre==null)
					{
						root = suc;
						
					}
					else if(leftFlag)
					{
						pre.left = suc;
						
					}else {
						pre.right = suc;
						
					}					
				}
				return true;
			}
		}	
		return false;
		
	}
	public TreeNode getSuccessor(TreeNode deleleNode)
	{
		TreeNode successsor =null;
		TreeNode successsorParent =null;
		TreeNode current = deleleNode.right;
		while(current!=null){
			successsorParent = successsor;
			successsor = current;
			current = current.left;
		}
		//check if successor has the right child, it cannot have left child for sure
		// if it does have the right child, add it to the left of successorParent.
//		successsorParent
		if(successsor!=deleleNode.right){
			successsorParent.left = successsor.right;
			successsor.right = deleleNode.right;
		}
		return successsor;
		
	}
	public void display(){
		TreeNode current = root;
		displayInnerNode(current);
	}
	private void displayInnerNode(TreeNode current)	{
		
		if(current!=null){
			displayInnerNode(current.left);
			System.out.print(" " + current.key);
			displayInnerNode(current.right);
		}
		
	}
	// For printing...........	
	public void printNode() {
	        int maxLevel = maxLevel(root);
	        printNodeInternal(Collections.singletonList(root), 1, maxLevel);
	        
	    }

	private  void printNodeInternal(List<TreeNode> nodes, int level, int maxLevel) {
	        if (nodes.isEmpty() || isAllElementsNull(nodes))
	            return;

	        int floor = maxLevel - level;
	        int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
	        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
	        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

	       printWhitespaces(firstSpaces);

	        List<TreeNode> newNodes = new ArrayList<TreeNode>();
	        for (TreeNode node : nodes) {
	            if (node != null) {
	                System.out.print(node.key);
	                newNodes.add(node.left);
	                newNodes.add(node.right);
	            } else {
	                newNodes.add(null);
	                newNodes.add(null);
	                System.out.print(" ");
	            }

	            printWhitespaces(betweenSpaces);
	        }
	        System.out.println("");

	        for (int i = 1; i <= endgeLines; i++) {
	            for (int j = 0; j < nodes.size(); j++) {
	              printWhitespaces(firstSpaces - i);
	                if (nodes.get(j) == null) {
	                  printWhitespaces(endgeLines + endgeLines + i + 1);
	                    continue;
	                }

	                if (nodes.get(j).left != null)
	                    System.out.print("/");
	                else
	                   printWhitespaces(1);

	             printWhitespaces(i + i - 1);

	                if (nodes.get(j).right != null)
	                    System.out.print("\\");
	                else
	                  printWhitespaces(1);

	                printWhitespaces(endgeLines + endgeLines - i);
	            }

	            System.out.println("");
	        }

	        printNodeInternal(newNodes, level + 1, maxLevel);
	    }

	    private  void printWhitespaces(int count) {
	        for (int i = 0; i < count; i++)
	            System.out.print(" ");
	    }

	    private static  int maxLevel(TreeNode node) {
	        if (node == null)
	            return 0;

	        return Math.max(maxLevel(node.left),maxLevel(node.right)) + 1;
	    }

	    private   boolean isAllElementsNull(List list) {
	        for (Object object : list) {
	            if (object != null)
	                return false;
	        }

	        return true;
	    }

	
	

}
