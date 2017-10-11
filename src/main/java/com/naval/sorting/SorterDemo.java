package com.naval.sorting;

/**
 * Sorting Demo
 * @author navalprabhakar
 */
import java.util.Arrays;

public class SorterDemo {

	public static void main(String[] args) {
		int[] unsorted = { 12, 2, 20, 48, 57, 15, 90, 49, 16, 4, 78, 12, 46, 1, 100 };

		printArray("Unsorted      : ", unsorted);
		printArray("Insertion Sort: ", new InsertionSorter().sort(copyOf(unsorted)));
		printArray("Selection Sort: ", new SelectionSorter().sort(copyOf(unsorted)));
		printArray("Merge Sort    : ", new MergeSorter().sort(copyOf(unsorted)));
	}

	private static int[] copyOf(int[] a) {
		return Arrays.copyOf(a, a.length);
	}

	private static void printArray(String label, int a[]) {
		System.out.print(label);
		Arrays.stream(a).forEach(e -> System.out.print(e + " "));
		System.out.println();
	}
}
