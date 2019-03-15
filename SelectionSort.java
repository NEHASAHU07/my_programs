/*
 *Selection sort
 *Input : unordered array
 *output: Sorted Array
 */
import java.io.*;
import java.lang.*;
import java.util.*;

class SelectionSort {
    public static void main(String[] args) throws java.lang.Exception {
        int[] a = {10, 37, 25, 1, 27, 3};
        int temp;
        for (int i = 0; i < a.length - 1; i++)
            for (int j = i+1; j < a.length; j++)
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
       for (int k = 0; k < a.length ; k++)
           System.out.println(a[k]);
    }
}
