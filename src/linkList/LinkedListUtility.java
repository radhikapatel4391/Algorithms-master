package linkList;

public class LinkedListUtility {
	public int length(LinkedListNode head) {
		int length = 0;
		while (head != null) {
			length++;
			head = head.next;
		}
		return length;
	}

	public LinkedListNode moveOffset(LinkedListNode head, int offset) {
		while (offset > 0) {
			head = head.next;
			offset--;
		}
		return head;
	}

	public LinkedListNode getIntersectingNode(LinkedListNode headA, LinkedListNode headB) {
		// Get the length of both the list
		int lengthA = length(headA);
		int lengthB = length(headB);
		// Move Longer List to offset steps
		if (lengthA > lengthB) {
			headA = moveOffset(headA, lengthA - lengthB);
		} else if (lengthA < lengthB) {
			headB = moveOffset(headB, lengthB - lengthA);
		}
		// Check for Intersection
		while (headA != null) {
			if (headA.equals(headB)) {
				return headA;
			} else {
				headA = headA.next;
				headB = headB.next;
			}
		}
		return null;
	}
	public LinkedListNode InsertNth(LinkedListNode head, int data, int position) {
		LinkedListNode temp = new LinkedListNode(data);		
		if (head == null) {
			// head = temp;
			return temp;
		} else {// To insert node at front
			if (position == 0) {
				temp.next = head;
				return temp;

			} else {
				LinkedListNode current = head;
				for (int i = 0; i < position - 1; i++) {
					current = current.next;
				}
				temp.next = current.next;
				current.next = temp;
				return head;
			}
		}
	}
}