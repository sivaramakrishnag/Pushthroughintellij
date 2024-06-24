import java.io.*;

//Binary Search Algorithm:
        //In this algorithm, Divide the search space into two halves by finding the middle index “mid”.

       // Finding the middle index “mid” in Binary Search Algorithm
        //	Compare the middle element of the search space with the key.
//If the key is found at middle element, the process is terminated.
        //	If the key is not found at middle element, choose which half will be used as the next search space.
        //	If the key is smaller than the middle element, then the left side is used for next search.
        //	If the key is larger than the middle element, then the right side is used for next search.
// This process is continued until the key is found or the total search space is exhausted.



public class BinarySearch {


        // Returns index of x if it is present in arr[].
        int binarySearch(int arr[], int x)
        {
            int l = 0, r = arr.length - 1;
            while (l <= r) {
                int m = l + (r - l) / 2;

                // Check if x is present at mid
                if (arr[m] == x)
                    return m;

                // If x greater, ignore left half
                if (arr[m] < x)
                    l = m + 1;

                    // If x is smaller, ignore right half
                else
                    r = m - 1;
            }

            // If we reach here, then element was
            // not present
            return -1;
        }

        // Driver code
        public static void main(String args[])
        {
            BinarySearch ob = new BinarySearch();
            int arr[] = { 2, 3, 4, 10, 40 };
            int n = arr.length;
            int x = 10;
            int result = ob.binarySearch(arr, x);
            if (result == -1)
                System.out.println(
                        "Element is not present in array");
            else
                System.out.println("Element is present at "
                        + "index " + result);
        }
    }


