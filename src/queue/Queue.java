package queue;

public class Queue {
	int front = 0;
	int rear = -1;
	int MAX = 10;
	int[] arr = new int[MAX];
	
	public boolean isEmpty() {
		return (rear<=front);
	}
	public void enqueue(int value)
	{
		if(rear>=(MAX-1))
			System.out.println("Queue is overflow...");
		else
			arr[++rear] = value;
	}
	public int dequeue()
	{
		if(front>=rear)
		{
			System.out.println("Queuse is empty");
			return 0;
		}else
		{
			return arr[front++];
		}			
	}
	public void printQueue()
	{
		if(front>-1 && front <=rear)
		{
			int index = front;
			System.out.println("Queue: ");
			while(index<=rear)
			System.out.println("  "+ arr[index++]);
		}
			
	}

}
