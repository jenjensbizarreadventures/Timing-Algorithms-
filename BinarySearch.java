public class BinarySearch extends Algorithm
{
	public String toString()
	    {
	        return "Binary Search: ";
	    }
	
	public int methodToTime(int [] x, int target)
    {
        binarySearch(x, target);
        return 0;
    }
	public static int binarySearch(int [] x, int target)
		{	
			int start = 0;
			int end = x.length;
			while (start != end)
			{
				int middle = start + (end-start)/2;
				if(target < x[middle])
				{
					end = middle;
				}
				else if (target > x[middle])
				{
					start = middle + 1;
				}
				else if (target == x[middle])
				{	
					return middle; 
				}
				else if (start == x[middle])
				{
					return -1;
				}
			}
			return -1;
		}
}