public class SelectionSort extends Algorithm
{
	public String toString()
        {
            return "Selection Sort";
        }

    public int methodToTime(int [] x, int target)
    {
        selectionSort(x);
        return 0;
    }
	public static void selectionSort(int [] x){
		 for (int i = 0; i < x.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < x.length; j++){  
                if (x[j] < x[index]){  
                    index = j;
                }  
            }  
            int smallerNumber = x[index];   
           	x[index] = x[i];  
            x[i] = smallerNumber;  
        }  
	}
}