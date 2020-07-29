package com.enkindle.search;

import java.time.Instant;

public class Binary {
	 
    public static int recursiveBinarySearch(int[] sortedArray, int start, int end, int key) {
    	System.out.println(Instant.now());
        if (start < end) {        	
        	System.out.println("div: " + start);
            int mid = start + (end - start) / 2;  
            if (key < sortedArray[mid]) {
                return recursiveBinarySearch(sortedArray, start, mid, key);                 
            } else if (key > sortedArray[mid]) {
                return recursiveBinarySearch(sortedArray, mid+1, end , key);                 
            } else {
                return mid;   
            }
        }
        return -(start + 1);  
    }
 
    public static void main(String[] args) {
         
        int[] arr1 = {2,45,234,567,876,900,976,999};
        System.out.println(java.util.Arrays.toString(arr1));
        System.out.println("array length: " + arr1.length);
        
        int index = recursiveBinarySearch(arr1, 0, arr1.length, 45);
        
        System.out.println("Found 45 at "+index+" index");
        index = recursiveBinarySearch(arr1,0,arr1.length,999);
        System.out.println("Found 999 at "+index+" index");
        index = recursiveBinarySearch(arr1,0,arr1.length,876);
        System.out.println("Found 876 at "+index+" index");
    }
}
