package linkedList;

public class testMain {

	public static void main(String[] args) {
	 LinkedList l = new LinkedList();
	 l.add(1);
	 l.add(2);
	 l.add(4);
	 printList(l);
	 System.out.println("I am the size: "+l.size());
	 l.addFirst(0);
	 printList(l);
	 l.addLast(5);
	 printList(l);
	 l.add(2, 3);
	 printList(l);
	 System.out.println("Check 3 is in list: "+l.contains(3));
	 l.add(6, 6);
	 printList(l);
	 l.add(0,-5);
	 printList(l);
	 l.add(1,-3);
	 printList(l);
	 
	 l.remove(2);
	 printList(l);
	 System.out.println("Last occurence of element: "+l.lastIndexOf(3));
	}
	
	public static void  printList(LinkedList list){
		System.out.println("List: ");
		for(int i=0; i<list.size();i++)
		{
			System.out.print(list.getElement(i));
			System.out.print("-->");
		}
		System.out.println("null");
	}

}
