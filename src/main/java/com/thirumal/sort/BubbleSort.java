package com.thirumal.sort;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println();
		int arr[] = {12, 2, 3, 123, 123, 12, 1, 34, 3, 20, 40, 24, 35, 6, 43, 14, 16, 2, 45, 28, 49, 36, 9, 48, 21, 23, 2, 44, 2, 13, 7, 3, 13, 2, 14, 22, 30, 3, 3, 20, 38, 31, 18, 1, 23, 6, 4, 13, 37, 24, 9, 27, 30, 47, 39, 18, 20, 18, 8, 4, 48, 25, 31, 35, 19, 42, 26, 1, 21, 33, 31, 11, 34, 6, 15, 25, 2, 14, 33, 7, 47, 4, 20, 8, 3, 8, 45, 25, 45, 21, 3, 30, 10, 2, 12, 43, 35, 38, 26, 44, 10, 2, 18, 0, 3, 36, 42, 25, 34, 1, 43};
		Instant start = Instant.now();
		for (int i = 0 ; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		Instant end = Instant.now();
		System.out.println(start);
		System.out.println(end);
		System.out.println(Arrays.toString(arr));
		System.out.println("Total execution time: " + Duration.between(start, end).toNanosPart());
		
		bubbleSort();
		
	}
	
	public static void bubbleSort() {
		System.out.println("-------------Bubble Sort ---------------");
		int arr[] = {12, 2, 3, 123, 123, 12, 1, 34, 3, 20, 40, 24, 35, 6, 43, 14, 16, 2, 45, 28, 49, 36, 9, 48, 21, 23, 2, 44, 2, 13, 7, 3, 13, 2, 14, 22, 30, 3, 3, 20, 38, 31, 18, 1, 23, 6, 4, 13, 37, 24, 9, 27, 30, 47, 39, 18, 20, 18, 8, 4, 48, 25, 31, 35, 19, 42, 26, 1, 21, 33, 31, 11, 34, 6, 15, 25, 2, 14, 33, 7, 47, 4, 20, 8, 3, 8, 45, 25, 45, 21, 3, 30, 10, 2, 12, 43, 35, 38, 26, 44, 10, 2, 18, 0, 3, 36, 42, 25, 34, 1, 43};
		Instant start = Instant.now();
		for (int i = 0 ; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		Instant end = Instant.now();
		System.out.println(start);
		System.out.println(end);
		System.out.println(Arrays.toString(arr));
		System.out.println("Total execution time: " + Duration.between(start, end).toNanosPart());
	}

}
