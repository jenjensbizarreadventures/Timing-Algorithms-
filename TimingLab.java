public class TimingLab
{
    public static void main(String [] args)
    {
    
        // Algorithm getMin = new GetMinAlgorithm();
        // timeAlgorithm(getMin, 28, false);
    
    //SelectionSort, average case only
    //Time complexity: O(n^2)
    //unsorted
    //2^19

        // Algorithm SelectionSort = new SelectionSort();
        // timeAlgorithm(SelectionSort, 19, false); 

    //InsertionSort, best case AND average case
    //Time complexity: O(n^2), O(n) best case 
    //sorted and unsorted
    //2^19

        // Algorithm InsertionSort = new InsertionSort();
        // timeAlgorithm(InsertionSort, 19, false);
        // timeAlgorithm(InsertionSort, 19, true);

    // isSorted, average AND worst case 
    // Time complexity: O(n)
    // unsorted and sorted 
    // 2^28

        // Algorithm isSorted = new isSorted();
        // timeAlgorithm(isSorted, 28, false);
        // timeAlgorithm(isSorted, 28, true);

    //LinearSearch, average case only 
    //Time complexity: O(n)
    //both work 
    //2^28

        // Algorithm LinearSearch = new LinearSearch();
        // timeAlgorithm(LinearSearch, 28, true);
        // timeAlgorithm(LinearSearch, 28, false);

    //BinarySearch, average case 
    //Time complexity: O(log n)
    //sorted is the only thing that works here 
    //2^19

        // Algorithm BinarySearch = new BinarySearch();
        // timeAlgorithm( BinarySearch, 19, true);
    }   
    public static void timeAlgorithm(Algorithm alg, int maxExp, boolean useSortedArray) 
    {
        System.out.println("---Timing " + alg + "-----");


        if(useSortedArray == true)
        {
            for(int i = 0; i < maxExp; i++)
            {  
            int [] sortedArray = makeSortedArray((int)(Math.pow(2, i)));

            //time math
            long start = System.currentTimeMillis();
            alg.methodToTime(sortedArray);
            long end = System.currentTimeMillis();
            long difference = end - start; 
            System.out.println(difference);
            }
        }
        else
        {
            for(int i = 0; i < maxExp; i++)
            {  
            int [] randomArray = makeRandomArray((int)(Math.pow(2, i)));

            //time math
            long start = System.currentTimeMillis();
            alg.methodToTime(randomArray);
            long end = System.currentTimeMillis();
            long difference = end - start; 
            System.out.println(difference);
            }
        }
    }

    public static int [] makeSortedArray(int length)
    {   
        //initialize a random sorted array of input length. 
        int[] randSrt;
        randSrt = new int[length]; 

        //create range 
        int maxRange = Integer.MAX_VALUE;
        int minRange = Integer.MIN_VALUE;

        int randomNum;

        //loops through each element in array, 
        //makes each consecutive element larger than the last oneG
        for(int i=1; i< randSrt.length; i++)
        {   
            randomNum =(int)(Math.random()*maxRange/length);
            randSrt[i] = randSrt[i-1] + randomNum;
        }
        return randSrt;
        }
    //returns an array of random ints of the given length
    public static int [] makeRandomArray(int length)
    {
        int [] ret = new int[length];
        for (int i = 0; i < ret.length; i++)
        {
            ret[i] = (int) (Math.random() * Integer.MAX_VALUE);
        }
        return ret;
    }
}
