package ds.learning.algorithm.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] unsorted = { 1, 5, 9, 2, 3, 7, 82, 13, 49, 19, 20, 49, 9 };
		System.out.println("unsorted array: ");
		displayArray(unsorted);
		System.out.println("sorted array: ");
		displayArray(insertionSorting(unsorted));

	}
	
	private static void displayArray(int[] unsorted) {
		for(int i = 0; i< unsorted.length; i++) {
			System.out.print(unsorted[i] + " ");
		}
	}

	public static int[] insertionSorting(int[] A) {
		
		for(int i = 1; i< A.length ; i++) {
			int pickedElememnt = A[i];
			int j = i-1;
			while(j>=0 && A[j] > pickedElememnt) {
				A[j+1] = A[j];
				j--;
			}
			A[j+1]=pickedElememnt;
		}
		return A;
		
	}

}
