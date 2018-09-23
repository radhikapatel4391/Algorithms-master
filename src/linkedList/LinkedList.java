package linkedList;

import java.util.Collection;


public class LinkedList 
{
	private Node head;
	private int size=0;
	public LinkedList()
	{
		head = new Node();
	}
	public LinkedList(Collection c)
	{
		Node temp = head;
		for(Object x:c)
		{
			temp.setData(x);
			temp.setNext(new Node());
			temp = temp.getNext();
			size++;
		}
	}
	public boolean add(int index, Object element)
	{
		if(index>size)
			return false;
		if(index == 0) {
			addFirst(element);
			return true;
		}else if (index == size)
		{
			addLast(element);
			return true;
		}
		Node temp = head;
		for(int i = 0;i<index-1;i++)
		{
			temp = temp.getNext();
		}
		Node n = temp.getNext();
		Node newNode  = new Node(element) ;
		newNode.setNext(n);
		temp.setNext(newNode);
		size++;
		return true;
		
	}
	public void addFirst(Object o) {
		if(head.getData()!=null)
		{
			Node newNode  = new Node(o) ;
			newNode.setNext(head);
			head = newNode;
			
		}else {
			head.setData(o);
		}
		size++;
	}
	public void addLast(Object o) {
		if(head.getData()!=null)
		{
			Node temp = head;
			while(temp.getNext() !=null)
			{
				temp = temp.getNext();
			}
			Node newNode  = new Node(o) ;
			temp.setNext(newNode);
		}
		else {
			head.setData(o);
		}
		
		size++;
	}
	public int size() {
		return size;
	}
	public boolean add(Object o) 
	{
		this.addLast(o);
		return true;
	}
	public boolean contains(Object o)
	{
		Node temp = head;
		while(temp!=null)
		{
			if(temp.getData().equals(o))
			{
				return true;
			}
			temp = temp.getNext();
		}
		return false;
	}
	public boolean remove(Object o)
	{
		
		Node temp = head;
		Node pre = null;
		while(temp!=null)
		{
			
			if(temp.getData().equals(o))
			{
				if(pre == null)
				{
					head = temp.getNext();					
				} 
				else 
				{
					pre.setNext(temp.getNext());					
				}
				size--;
				return true;
			}
			pre = temp;
			temp = temp.getNext();
		}
		return false;
	}
	public Object getFirst() {
		return head.getData();
	}
	public Object getLast() 
	{
		Node temp = head;
		while(temp.getNext()!=null)
		{			
			temp = temp.getNext();
		}
		return temp.getData();
	}
	public int indexOf(Object o) 
	{
		Node temp = head;
		int index = -1;
		while(temp!=null)
		{
			index ++;
			if(temp.getData().equals(o))
			{
				return index;
			}
			temp = temp.getNext();
		}
		return index;
	}
	public int lastIndexOf(Object o)
	{
		Node temp = head;
		int index = -1;
		int lastIndex = -1;
		while(temp!=null)
		{
			index ++;
			if(temp.getData().equals(o))
			{
				lastIndex = index;
			}
			temp = temp.getNext();
		}
		return lastIndex;
	}
	public Object getElement(int index)
	{

		Node temp = head;
		for(int i = 0;i<index;i++)
		{
			temp = temp.getNext();
		}
		return temp.getData();
		
	}
	
	
	

}
