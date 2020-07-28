package ds.learning.algorithm;

public class LinearSearchAlgo {

	public static long find(long x, long[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x)
				return i;
		}
		return -1;
	}

	public static long recursiveLinearSearc(long[] A, int i, int x) {
		if (A[i] == x)
			return i;
		else if (i < A.length - 1)
			return recursiveLinearSearc(A, i + 1, x);
		else
			return -1;

	}

	public static void main(String[] args) {
		long[] a = { 1, 5, 9, 2, 3, 7 };
		long position = find(2, a);
		//System.out.println("position is at " + position);
		//System.out.println("negative scenario " + find(7, a));
		System.out.println("negative scenario " + recursiveLinearSearc(a, 0, 9));
	}

}
