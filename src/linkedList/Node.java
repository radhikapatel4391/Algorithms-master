package linkedList;

public class Node {
	private Node next = null;
	private Object data = null;
	public Node()
	{
		
	}
	public Node(Object data)
	{		
		this.setData(data);	
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}
