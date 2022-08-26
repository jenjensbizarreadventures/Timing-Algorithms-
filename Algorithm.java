public class Algorithm
{
    public String toString()
    {
        return "Generic Algorithm";
    }
    
    //if our specific algorithm needs a target (e.g. linear search)
    //this will generate a random target for us
    public int methodToTime(int [] x)
    {
        return methodToTime(x, (int) (Math.random() * Integer.MAX_VALUE));
    }
    
    public int methodToTime(int [] x, int target)
    {
        return 0;
    }
}
