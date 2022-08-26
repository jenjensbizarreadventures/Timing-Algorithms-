public class MergeSort 
{   
    public static void main(String[] args) 
    {
    //Running pure MergeSort: 
    // for (int i = 0 ; i < 29; i++)
    // {   
    //     int [] randomArray = makeRandomArray((int)(Math.pow(2, i)));
    //     long start = System.currentTimeMillis();
    //     sort(randomArray, 0, randomArray.length - 1);
    //     long end = System.currentTimeMillis();
    //     long difference = end - start; 
    //     System.out.println(difference);
    // }

    //Timing Merge and Insertion Hybrid 
        for (int i = 0 ; i < 29; i++)
        {   
            int [] randomArray = makeRandomArray((int)(Math.pow(2, i)));
            long start = System.currentTimeMillis();
            sort(randomArray, 0, randomArray.length - 1, 26); 
            long end = System.currentTimeMillis();
            long difference = end - start; 
            System.out.println(difference);
        }
    }

    public static int [] makeRandomArray(int length)
    {
        int [] ret = new int[length];
        for (int i = 0; i < ret.length; i++)
        {
            ret[i] = (int) (Math.random() * Integer.MAX_VALUE);
        }
        return ret;
    }

    public static void insertionSort(int [] x, int start, int end)
    {   
        for (int j = start; j < end; j++) 
        {  
            int key = x[j];  
            int i = j-1;  
            while ( (i > start) && ( x[i] > key)) 
            {  
                x[i+1] = x[i];  
                i--;  
            }  
            x[i+1] = key;  
        }  
    }

    public static void sort(int[] x, int start, int end, int k)
    {   
    
        if (end - start < k)
            {
            insertionSort(x, start, end);
            return;
            }  

            int mid = start + (end - start)/2;
            sort(x, start, mid, k);
            sort(x, mid + 1, end, k);
            merge(x, start, mid, end);
    }
    public static void merge(int [] x, int start, int mid, int end)
    {   
        int[] holder = new int[mid + 1 - start];

        for(int i = 0; i < holder.length; i++)
        {
            holder[i] = x[start + i];
        }
        int i = start; //lower index
        int j = 0; //holdIndex
        int k = mid + 1; //higher

        while (i < k && k <= end)
        {
            if (x[k] < holder[0])
            {
                x[i++] = x[k++];
            }
            else
            {
                x[i++] = holder[j++];
            }
        }
        while (i < k)
        {
            x[i++] = holder[j++];
        }
    }
}