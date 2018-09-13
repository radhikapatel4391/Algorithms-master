package linkList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedListNode n11 = new LinkedListNode(11);
		LinkedListNode n12 = new LinkedListNode(12);
		LinkedListNode n13 = new LinkedListNode(13);
		LinkedListNode n14 = new LinkedListNode(14);
		LinkedListNode n15 = new LinkedListNode(15);
		LinkedListNode n16 = new LinkedListNode(16);
		LinkedListNode n21 = new LinkedListNode(21);
		LinkedListNode n22 = new LinkedListNode(22);
		LinkedListNode n23 = new LinkedListNode(23);
		LinkedListNode n24 = new LinkedListNode(24);
		n11.appendToTail(n12);
		n11.appendToTail(n13);
		n11.appendToTail(n14);
		n11.appendToTail(n15);
		n11.appendToTail(n16);
		n11.print();
		n21.appendToTail(n22);
		n21.appendToTail(n23);
		n21.appendToTail(n24);
		n21.appendToTail(n14); // intersection
		n21.print();
		LinkedListUtility utility = new LinkedListUtility();
		LinkedListNode intersectingNode = utility.getIntersectingNode(n11, n21);
		if (intersectingNode != null) {
			System.out.println("Intersecting Node :: " + intersectingNode.data);
		} else {
			System.out.println("No Intersection");
		}
	}
}