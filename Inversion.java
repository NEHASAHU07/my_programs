/*
 * This implementation is to count number of Inversion in given Array[0,1,2,....N-1]
 * A pair (A[i], A[j]) is said to be an inversion if these numbers are out of order, i.e., i < j but A[i] > A[j].
 * Input: An array of size n
 * output: Count of inverted pair
 * 
 */
import java.io.*;
import java.lang.*;
import java.util.*;

/*
 *Approach: This implementation uses the MergeSort Algorithm to count Inverted pair in an array.
 *          Total number of Inversion = c(A[0...mid]) + c(A[mid+1....n-1])+ Inverted Pair in both the arrays (accross)
 */

class Inversion  {
    //This method is used to count the Inversion accross two sorted array x and y
    private static int countAccrossInversion(int []a, int []x, int []y, int l) {
        int p = 0, q = 0;
        int ans = 0;
        for (int i = 0; i < (x.length + y.length); i++) {
            if ( p < x.length & q < y.length) {
                if (x[p] <= y[q])
                    a[l+i] = x[p++];
                else {
                    a[l+i] = y[q++];
                    ans += x.length - p;
                }
            }
            else if (p < x.length) 
                a[l+i] = x[p++];
            else
                a[l+i] = y[q++];
        }
        return ans;
    }
    // This function is to count the inversion in a given array A with starting with index l and ending at index r
    private static int countInversion(int []a, int l, int r) {
        int temp, ans = 0;
        if (l >= r)
            return 0;
        if (r-l == 1 && a[r] < a[l]) {
            temp = a[r];
            a[r] = a[l];
            a[l] = temp;
            return 1;
        }
        int mid = l + (r - l) / 2;
        ans = countInversion(a, l, mid);
        ans += countInversion(a, mid +1, r);
        int []x = new int [mid - l + 1];
        int []y = new int [r - mid];
        for (int i = 0; i < x.length; i++)
            x[i] = a[l+i];
        for (int j = 0; j < y.length; j++)
            y[j] = a[mid + j+ 1];
        ans += countAccrossInversion(a, x, y, l);
        return ans;
    }
    public static void main(String []args) {
        //unsorted Input array
        int []a = {8,2,4,9,5,7,3,1};
        System.out.println("\nTotal Inversion pair :"
            + countInversion(a, 0, a.length - 1));
       
    }
}
