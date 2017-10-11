package com.naval.sorting;

public class SelectionSorter {

	public int[] sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int minAt = minimumIndex(a, i);
			if (i != minAt) {
				swap(a, i, minAt);
			}
		}
		return a;
	}

	static int minimumIndex(int[] a, int startIndex) {
		int minAt = startIndex;
		for (int i = startIndex + 1; i < a.length; i++) {
			if (a[i] < a[minAt]) {
				minAt = i;
			}
		}
		return minAt;
	}

	private static void swap(int[] a, int i, int mini) {
		int temp = a[i];
		a[i] = a[mini];
		a[mini] = temp;
	}

}
