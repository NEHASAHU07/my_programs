/*
 * About:
 */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MergeSort {
    private static void mergeFunc(int []a, int []x, int []y, int l) {
       int i = 0;
       int j = 0;
       for (int k = 0; k < (x.length + y.length); k++) {
           if (i < x.length && j < y.length) {
               if (x[i] < y[j])
                   a[l+k] = x[i++];
               else
                   a[l+k] = y[j++];
            }
            else if (i < x.length)
               a[l+k] = x[i++];
            else if (j < y.length)
               a[l+k] = y[j++];
       }
    }
    private static void mergeSort(int []a, int l, int r) {
        if (l >= r)
            return;
        if (r - l == 1) {
            if (a[r] < a[l]) {
                int temp = a[r];
                a[r] = a[l];
                a[l] = temp;
            }
            return;
        }
        int mid = l + (r - l)/2;
        
        mergeSort(a, l, mid);
        mergeSort(a, mid + 1, r);
        int []x = new int[mid - l + 1];
        int []y = new int[r - mid];
        for (int i = 0; i < x.length; i++) {
            x[i] = a[l+i];
        }
        for (int j = 0; j < y.length; j++) {
            y[j] = a[mid+1+j];
        }
        mergeFunc(a,x,y,l);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		int []a = {3,5,5,1,9,2,72,24,247,18,14};
		mergeSort(a, 0, a.length - 1);
		System.out.print("Sorted array is :");
		for (int i = 0; i < a.length; i++)
		    System.out.print(a[i] + " ");
	}
}
//{3,5,5,1,9,2}