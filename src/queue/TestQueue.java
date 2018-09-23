package queue;

public class TestQueue {
	public static void main(String args[])
	{
		System.out.println("Hello welcome to queue functions...");
		Queue q = new Queue();
		q.dequeue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		q.enqueue(8);
		q.enqueue(9);
		q.enqueue(10);
		q.enqueue(11);
		q.printQueue();
		q.dequeue();
		q.printQueue();
		q.dequeue();
		q.printQueue();
		q.dequeue();
		q.printQueue();
	}

}
