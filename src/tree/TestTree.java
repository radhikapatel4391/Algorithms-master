package tree;

public class TestTree {

	public static void main(String[] args) {
		System.out.println("hello");
	BinaryTree bt = new BinaryTree(6);
	
	
	bt.add(3);
	bt.add(2);
	bt.add(4);
	bt.add(1);
	bt.add(8);
	bt.add(6);
	bt.add(7);
	bt.add(9);
	//bt.add(6);	
	bt.printNode();
	bt.remove(3);
	System.out.println("after remove");
	bt.printNode();
	System.out.println("inorder:  ");
	bt.inOrderPrint();
	System.out.println("preorder:  ");
	bt.preOrderPrint();
	System.out.println("postorder:  ");
	bt.postOrderPrint();
	System.out.println("BST:  ");
	bt.BSTPrint();
	
	}

}
