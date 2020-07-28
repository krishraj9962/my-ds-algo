package ds.learning.algorithm.sorting;

public class MergeSort {

	public static void main(String[] args) {

		int[] A = { 6, 8, 2, 7, 1, 3, 5, 4, 9, 0, 89, 50, 43, 40, 56, 72, 63, 90, 88, 9 };

		displayArray(mergeSortAlg(A));

	}

	public static int[] mergeSortAlg(int[] A) {
		mergeSort(A, 0, A.length - 1);
		return A;
	}

	private static void mergeSort(int[] A, int lb, int up) {

		if (lb >= up)
			return;
		//Divide the Array till each sub array has only one element in it.
		int mid = (lb + up) / 2;
		mergeSort(A, lb, mid);
		mergeSort(A, mid + 1, up);
		//start merging the elements
		merge(A, lb, mid, up);

	}

	private static void merge(int[] A, int lb, int mid, int up) {
		int i = lb;
		int j = mid + 1;
		int k = 0;
		int[] B = new int[up - lb + 1];

		while (i <= mid && j <= up) {
			if (A[i] < A[j]) {
				B[k] = A[i];
				k++;
				i++;
			} else {
				B[k] = A[j];
				k++;
				j++;
			}
		}
		if (i > mid) {
			while (j <= up) {
				B[k] = A[j];
				j++;
				k++;
			}
		} else {
			while (i <= mid) {
				B[k] = A[i];
				i++;
				k++;
			}
		}
		// Copying the arrayElement
		for (int m = 0; m < B.length; m++) {
			A[lb + m] = B[m];
		}

	}

	private static void displayArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
