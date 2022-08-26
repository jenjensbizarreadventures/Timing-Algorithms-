public class InsertionSort extends Algorithm
{
	public String toString()
        {
            return "Insertion Sort: ";
        }
    public int methodToTime(int [] x, int target)
    {
        insertionSort(x);
        return 0;
    }
	public static void insertionSort(int [] x)
	{	
		int n = x.length;  
        for (int j = 1; j < n; j++) 
        {  
            int key = x[j];  
            int i = j-1;  
            while ( (i > -1) && ( x[i] > key ) ) 
            {  
                x[i+1] = x[i];  
                i--;  
            }  
            x[i+1] = key;  
        }  
	}

}