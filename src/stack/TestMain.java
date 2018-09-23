package stack;

public class TestMain {
	public static void main(String args[]) 
	 { 
	     Stack s = new Stack(); 
	     s.push(10); 
	     s.push(20); 
	     s.push(30); 
	     s.printStack();
	     System.out.println(s.pop() + " Popped from stack"); 
	     System.out.println("I am top value: "+s.topelement());
	     System.out.println(s.pop() + " Popped from stack");
	 } 

}
