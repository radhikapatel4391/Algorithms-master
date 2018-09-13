package sortingAlgoritms;
//Created by Radhika Patel
class insertionSort
{
	public static void main(String args[])
    {        
        int arr[] = {0,5,3,1,-5,8};
 
        insertionSort s = new insertionSort();        
        s.sort(arr);         
        printArray(arr);
        s.sortInDecreasingOrder(arr);         
        printArray(arr);
    }
	/*Function to sort array using insertion sort*/
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; i++)
        {
            int key = arr[i];
            int j = i-1;
           
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    void sortInDecreasingOrder(int arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; i++)
        {
            int key = arr[i];
            int j = i-1;
 
            
            while (j>=0 && arr[j] < key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
 

    
} 
