package com;
// The lower bound algorithm finds the first or the smallest index in a sorted array where the value at that index is greater than or equal to a given key i.e. x.
public class Test2 {
	 public static int lowerBound(int []arr, int n, int x) {
	        for (int i = 0; i < n; i++) {
	            if (arr[i] >= x) {
	                // lower bound found:
	                return i;
	            }
	        }
	        return n;
	    }

	    public static void main(String[] args) {
	        int[] arr = {3, 5, 8, 15, 19,21,23,25};
	        int n = arr.length, x = 19;
	        int ind = lowerBound(arr, n, x);
	        System.out.println("The lower bound is the index: " + ind);
	    }
}
