public class isSorted extends Algorithm
{
	public String toString()
    {
        return "isSorted: ";
    }

    public int methodToTime(int [] x)
    {
        for (int i = 0; i < x.length - 1; i++)
		{	
			if(x[i] > x[i + 1])
			{
				return(x[i]);
			}
		}
		return 1;
    }
}