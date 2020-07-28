package ds.learning.algorithm;

public class RecursiveBinarySearch {

	public static void main(String[] args) {
		int[] A = { 1, 5, 9, 11, 13, 17, 19, 21 };
		System.out.println("found at: " + binarySearch(A, 21));
		System.out.println("found at: " + recursiveBinarySearch(A, 21));

	}

	public static int recursiveBinarySearch(int[] A, int x) {
		int first = 0;
		int last = A.length - 1;
		return findx(A, first, last, x);

	}

	public static int findx(int[] A, int first, int last, int x) {
		if(first > last)
			return -1;
		int mid = (first + last) / 2;
		if (A[mid] == x)
			return mid;
		else if (x < A[mid])
			return findx(A, first, mid - 1, x);
		else
			return findx(A, mid + 1, last, x);
		

	}

	public static int binarySearch(int[] A, int x) {
		int first = 0;
		int last = A.length - 1;
		int mid;

		while (first <= last) {
			mid = (first + last) / 2;
			if (x == A[mid])
				return mid;
			else if (x < A[mid])
				last = mid - 1;
			else
				first = mid + 1;
		}
		return -1;

	}

}
