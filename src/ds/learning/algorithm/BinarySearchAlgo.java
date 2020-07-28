package ds.learning.algorithm;

public class BinarySearchAlgo {

	public static void main(String[] args) {
		int[] a = { 1, 5, 9, 11, 13, 17, 19, 21 };
		System.out.println("position is at " + findBinarySearch(13, a));

	}

	public static int findBinarySearch(int x, int[] A) {

		int first = 0;
		int last = A.length - 1;
		int mid;

		while (first <= last) {
			mid = (first + last) / 2;
//			System.out.println(mid);
			if (x < A[mid])
				last = mid - 1;
			else if (x > A[mid])
				first = mid + 1;
			else
				return mid;
		}

		return -1;

	}

}
