package com;

//The upper bound algorithm finds the first or the smallest index
//in a sorted array where the value at that index is greater than the given key i.e. x.
import java.util.*;
public class Test3 {



    public static int upperBound(int[] arr, int x, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] > x) {
                // upper bound found:
                return i;
            }
        }
        return n;
    }
// second approach
    public static int upperBound1(int[] arr, int x, int n) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] > x) {
                ans = mid;
                //look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 9, 15, 19};
        int n = 6, x = 5;
     //   int ind = upperBound(arr, x, n);
        int ind = upperBound1(arr, x, n);
        System.out.println("The upper bound is the index: " + ind);
    }
}
