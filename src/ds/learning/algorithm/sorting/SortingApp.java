package ds.learning.algorithm.sorting;

public class SortingApp {

	public static void main(String[] args) {
		int[] a = { 1, 5, 9, 2, 3, 7, 82, 13, 49, 19, 20 };
		System.out.println("before sorting: " + a);
		displayArray(a);
		System.out.println("after sorting: ");
		displayArray(actualSelectionSort(a));
	}
	
	public static int[] actualSelectionSort(int[] A) {
		int minAt;
		for(int i = 0; i < A.length; i++) {
			minAt = i;
			for(int j= i+1; j< A.length; j++)
				if(A[j] < A[minAt])
					minAt = j;	
			if(minAt != i) {
				//swap here
				int temp = A[i];
				A[i] = A[minAt];
				A[minAt] = temp;
			}
		}
		return A;
		
	}

	// O(n2)
	public static int[] selectionSort(int[] input) {
		int[] sorted = new int[input.length];
		int min;

		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[j] < input[i]) {
					// swap it
					int temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}

		}
		return input;

	}
	
	private static void displayArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
