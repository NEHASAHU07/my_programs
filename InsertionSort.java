/*
 * This implementation uses insertion sort to sort an unordered input array.
 * Input: unordered array of integers
 * Output: Sorted Array
 */
import java.io.*;
import java.lang.*;
import java.util.*;

class InsertionSort {
    public static void main(String[] args) throws java.lang.Exception {
        int []arr = {2,30,48,25,21,1,3};
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            j  = i - 1;
            int key = arr[i];
            while (j >= 0 && key < arr[j]) {
                arr[j+1] = arr[j];
                j--;    
            }
            arr[j+1] = key;
        }
        for (int k = 0; k < arr.length; k++)
            System.out.println("Array Element at index k is :" + arr[k]);
    }
}
