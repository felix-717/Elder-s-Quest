/**
 * Used for getting a result out of a probability
 */

public class Probability {

    // Utility function to find ceiling of r in arr[l..h]
    static int findCeil(int[] arr, int r, int l, int h)
    {
        int mid;
        while (l < h)
        {
            mid = l + ((h - l) >> 1); // Same as mid = (l+h)/2
            if(r > arr[mid])
                l = mid + 1;
            else
                h = mid;
        }
        return (arr[l] >= r) ? l : -1;
    }

    // The main function that returns a random number
// from arr[] according to distribution array
// defined by freq[]. n is size of arrays.
    static int myRand(int[] arr, int[] freq, int n)
    {
        // Create and fill prefix array
        int[] prefix = new int[n];
        int i;
        prefix[0] = freq[0];
        for (i = 1; i < n; ++i)
            prefix[i] = prefix[i - 1] + freq[i];

        // prefix[n-1] is sum of all frequencies.
        // Generate a random number with
        // value from 1 to this sum
        int r = ((int)(Math.random()*(323567)) % prefix[n - 1]) + 1;

        // Find index of ceiling of r in prefix arrat
        int indexc = findCeil(prefix, r, 0, n - 1);
        return arr[indexc];
    }

//    // Driver code
//    public static void main(String[] args)
//    {
//        int[] arr;
//        arr = new int[]{25,50,100};
//        int[] freq = {75,50,25};
//        int i, n = arr.length;
//
////        // Let us generate 10 random numbers accroding to
////        // given distribution
////        for (i = 0; i < 10; i++)
////            System.out.println( myRand(arr, freq, n) );
//        System.out.println(myRand(arr,freq,n));
//
//    }}

    /**Gets number probability
     *
     * @param arr Selection array
     * @param freq Respective Frequency
     * @return double result
     */
    public double getProbability(int[] arr, int[] freq){

//        int[] arr;
//        arr = new int[]{1, 2, 3, 4};
//        int[] freq = {5, 5, 1, 2};
        int  n = arr.length;

        return myRand(arr, freq, n);
    }
}

