
/**
 * An array is a group of some predefined number of elements.
 * For instance, we could have an array of 10 ints or 10 Strings.
 *
 * Or, we could have an array of our own custom Objects, such as our own Bird class for a birdwatching
 * application. This would allow us to keep track of many birds and their own behavior.
 *
 * For the following problems, all of the syntax we need is in this documentation:
 * https://www.learnjavaonline.org/en/Arrays
 */
public class Lab {
    /**
     * @param arr the array we're getting data from.
     * @return the length of arr.
     */
    public int getLengthOfArray(int[] arr){
        return arr.length;
    }



    /**
     * @param arr the array we're getting data from.
     * @param n the index (number) of the element we're looking to return.
     *          Indexes in arrays start counting from zero.
     * @return the element at index n of arr.
     */
    public int getNthElementOfArray(int[] arr, int n){
        return arr[n];      // Aside: .at() array method in JavaScript, C++ works, Java do NOT seem to have
    }

    /**
     *
     * @param arr the array we're getting data from.
     * @param n the index (number) of the element we're looking to modify.
     *          Indexes in arrays start counting from zero.
     * @param val the value that we will assign to a spot in the array.
     * @return nothing. Because of pass-by-reference, any change to the array will be reflected across our java program.
     */
    public void setNthElementOfArray(int[] arr, int n, int val){    // method w/ type "void" -- no return
        // change value at 'n' index in array 'arr' to 'val'
        arr[n] = val;
    }

    /**
     * @param n the size of the array we wish to create
     * @return a new int array that can contain n elements.
     */
    public int[] returnNewArraySizeN(int n){
        // initialize an array w/ length of n & type int -- the two characteristics determined on initialzation & can NOT be changed
        int ary[] = new int[n];
        // int[n] ary;   // do NOT work but empty w/ empty length will
        return ary;
    }
}
