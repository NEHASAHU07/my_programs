/*
 * This implementation search the key element in an array and returns the index value if matched, else returns -1
 * Input : A sorted Array of size n, input Key element to be searched in array
 * output: Index value of key in array if matched, else -1.
 */
import java.io.*;
import java.lang.*;
import java.util.*;
class BinarySearchRec {
	public static int bSearch(int arr[], int l, int r, int x) {
	    int mid;
            if (r >= l) {
               	mid = l + (r - l) / 2;
               if (arr[mid] == x)
                   return mid;
               if (arr[mid] > x) 
                   return bSearch(arr, l, mid - 1, x);
               return bSearch(arr, mid + 1, r, x);
               }
               return -1;
        }
        public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 10, 40,30 };
		int n = arr.length;
		int key = 4;
		int result = bSearch(arr, 0, n - 1, key); 
		if (result == -1) 
			System.out.println("Element not present"); 
		else
			System.out.println("Element found at index " + result);
        }
}
