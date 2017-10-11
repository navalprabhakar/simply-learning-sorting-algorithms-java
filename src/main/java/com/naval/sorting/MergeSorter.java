package com.naval.sorting;

import java.util.Arrays;

public class MergeSorter {

	public int[] sort(int[] a) {
		mergeSort(a, 0, a.length - 1);
		return a;
	}

	private void mergeSort(int[] a, int from, int to) {
		if (from < to) {
			int middle = middle(from, to);
			mergeSort(a, from, middle);
			mergeSort(a, middle + 1, to);
			merge(a, from, middle, to);
		}
	}

	private void merge(int[] a, int fromLeft, int middle, int toRight) {
		int fromRight = middle + 1;

		int lengthLeft = length(fromLeft, middle);
		int lengthRight = length(fromRight, toRight);

		int[] sublistLeft = Arrays.copyOfRange(a, fromLeft, fromLeft + lengthLeft);
		int[] sublistRight = Arrays.copyOfRange(a, fromRight, fromRight + lengthRight);

		int i = 0, j = 0, k = fromLeft;

		while (i < lengthLeft && j < lengthRight) {
			a[k++] = (sublistLeft[i] <= sublistRight[j]) ? sublistLeft[i++] : sublistRight[j++];
		}

		while (i < lengthLeft) {
			a[k++] = sublistLeft[i++];
		}

		while (j < lengthRight) {
			a[k++] = sublistRight[j++];
		}
	}

	private int length(int from, int to) {
		return to - from + 1;
	}

	private int middle(int from, int to) {
		return from + (length(from, to) - 1) / 2;
	}
}
