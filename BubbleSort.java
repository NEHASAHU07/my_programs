/*
 * Bubble Sort Implementation
 */
import java.io.*;
import java.lang.*;
import java.util.*;

class BubbleSort {
    public static void main(String[] args) throws java.lang.Exception {
        int[] a = {10, 68, 26, 28, 39, 2, 32};
        for (int i = 0; i < a.length - 1; i++) { 
            int count = 0;
            int temp;
            for (int j = 0; j < a.length - i - 1; j++)
                if (a[j] > a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    count++;
                }
                if (count == 0)
                    break;
        }
        for (int k = 0; k < a.length; k++)
            System.out.println("Array ELement at index k is :" + a[k]);
    }
}
