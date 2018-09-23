package sortingAlgoritms;

public class QuickSort {
	public static void main(String args[])
	{
		//int[] arr = {2,8,7,1,3,5,6,4};
		int[] arr = {2,1,0};
		printArray(arr);
		int[] sortedarr = quickSort(arr,0,arr.length-1);
		printArray(sortedarr);
		
	}
	
	
	public static int[] quickSort(int[] arr,int start,int end)
	{
		if(start<end)
		{
			int q = partition(arr,start,end);
			quickSort(arr,start,q-1);
			quickSort(arr,q+1,end);			
		}
		return arr;
	}
	public static int partition(int[] arr,int start, int end)
	{
		int key = arr[end];		
		int i = start-1;
		for(int j=start;j<end;j++)
		{
			if(arr[j]<key)
			{
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[end];
		arr[end] = temp;
		return i;
	}
	public static void printArray(int[] arr)
	{
		System.out.println();
		for(int i = 0; i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}
}
