/*
 *Binary Search without recursion
 */
import java.io.*;
import java.lang.*;
import java.util.*;

class BinarySearch {
    private static int bSearch(int[] arr,int key) {
        int l = 0, r = arr.length -1;
        int mid = 0;
        while (r >= l) {
            mid = l + (r - l)/ 2;
        if (arr[mid] == key)
            return mid;
        if (arr[mid] <  key)
            l = mid+1;
        else
            r = mid - 1;
       }
    return -1;
    }
    public static void main(String[] args) throws java.lang.Exception {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = Input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = Input.nextInt();
        }
        System.out.println("Enter key element to be searched in array");
        int key = Input.nextInt();
        int res = bSearch(arr, key);
        if (res == -1)
            System.out.println("Element does not exist in array");
        else
            System.out.println("Element found at index :" + res);
    }
}
