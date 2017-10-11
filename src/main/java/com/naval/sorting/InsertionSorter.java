package com.naval.sorting;

public class InsertionSorter {

	public int[] sort(int[] a) {
		for (int unsortedAt = 1; unsortedAt < a.length; unsortedAt++) {
			insertIntoSorted(a, unsortedAt);
		}

		return a;
	}

	private static void insertIntoSorted(int[] a, int unsortedAt) {
		int unsortedKey = a[unsortedAt];
		int sortedAt = unsortedAt - 1;

		for (; sortedAt >= 0 && unsortedKey < a[sortedAt]; sortedAt--) {
			a[sortedAt + 1] = a[sortedAt];
		}

		a[sortedAt + 1] = unsortedKey;
	}
}
