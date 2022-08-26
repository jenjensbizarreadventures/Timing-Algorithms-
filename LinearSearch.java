public class LinearSearch extends Algorithm
{
	public String toString()
        {
            return "LinearSearch";
        }
    public int methodToTime(int [] x)
    {
        LinearSearch(x);
        return 0;
    }
	public int LinearSearch(int [] x)
	{

		for (int i = 0; i < x.length; i++)
		{
			int target = (int)(Math.random() * Integer.MAX_VALUE);
			if(x[i] == target)
			{ 
				return x[i];
			}
		}
		return -1;
	}
}