/*
 * Implementing QuickSort which uses the divide and conquer paradigm
 */
import java.io.*;
import java.lang.*;
import java.util.*;

class QuickSort {
    static int partition(int []array, int l, int r) {
        int pivot = array[r];
        int i =  l - 1;
        int temp;
        for (int j = l; j < r; j++) {
            if (array[j] <= pivot) {
                i = i+1;
                temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
            temp = array[i+1];
            array[i+1] = array[r];
            array[r] = temp;
        return i+1;
    }

    static void quickSort(int[] array, int fIndex, int lIndex) {
        int q = -1;
        if (fIndex < lIndex) {
            q = partition(array, fIndex, lIndex);
            quickSort(array, fIndex, q-1);
            quickSort(array, q+1, lIndex);
        }
    }
    public static void main(String[] args) throws java.lang.Exception {
        int []a = {10,20,23,15};
        int p = 0;
        int r = a.length - 1;
        quickSort(a,p,r);
        System.out.print("Sorted array elements are as follows");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}
