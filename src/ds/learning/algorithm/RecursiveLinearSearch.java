package ds.learning.algorithm;

public class RecursiveLinearSearch {

	public static void main(String[] args) {
		int[] A = { 1, 5, 9, 11, 13, 17, 19, 21 };
		System.out.println("find recursive: " + findByLinear(A, 0, 21));

	}

	public static int findByLinear(int[] A, int i, int x) {
		if (A[i] == x)
			return i;
		else if (i < A.length - 1)
			return findByLinear(A, i + 1, x);
		else
			return -1;
	}

}
