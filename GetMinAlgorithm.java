
public class GetMinAlgorithm extends Algorithm
{
    public String toString()
    {
        return "Get Minimum Value: ";
    }

    //overrides the generic method, with the specific algorithm we are doing here
    public int methodToTime(int [] x)
    {
        int min = x[0];
        for (int i = 0; i < x.length; i++)
        {
            if (x[i] < min)
            {
                min = x[i];
            }
        }
        return min;
    }
}
