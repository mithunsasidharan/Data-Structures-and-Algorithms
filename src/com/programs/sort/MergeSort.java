package com.programs.sort;

import java.util.Arrays;

public class MergeSort {

	public static int[] mergeSort(int[] array) {
		int[] result = null;
		if (array.length > 1) {
			int halfLength = array.length/2;

			int[] leftArray = Arrays.copyOfRange(array, 0, halfLength);
			int[] rightArray = Arrays.copyOfRange(array, halfLength, array.length);

			mergeSort(leftArray);
			mergeSort(rightArray);

			 result = merge(array, leftArray, rightArray);
		}
		return result;
	}

	static int[] merge(int[] array, int[] left, int[] right) {
		int totElem = left.length + right.length;
		int i,li,ri;
		i = li = ri = 0;
		while ( i < totElem) {
			if ((li < left.length) && (ri < right.length)) {
				if (left[li] < right[ri]) {
					array[i] = left[li];
					i++;
					li++;
				}
				else {
					array[i] = right[ri];
					i++;
					ri++;
				}
			}
			else {
				if (li >= left.length) {
					while (ri < right.length) {
						array[i] = right[ri];
						i++;
						ri++;
					}
				}
				if (ri >= right.length) {
					while (li < left.length) {
						array[i] = left[li];
						li++;
						i++;
					}
				}
			}
		}
		return array;
	}

	public static void main(String[] args) {
		int[] array = {1,56,7,34,12};
		array = MergeSort.mergeSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
