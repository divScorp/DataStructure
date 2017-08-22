package sorting;

public class TimSort {
	public final static int RUN = 6;

	// insertion sort algorithm implementation
	public static void insertionSort(int[] a, int left, int right) {
		int key, i, j;

		for (i = left + 1; i <= right; i++) {
			key = a[i];
			j = i - 1;
			while (j >= left && a[j] > key) {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = key;
		}
	}

	// Merging two array.
	public static void merge(int[] a, int low, int m, int up) {
		int len1 = m - low + 1;
		int len2 = up - m;
		int[] left = new int[len1];
		int[] right = new int[len2];
		for (int i = 0; i < len1; i++)
			left[i] = a[low + i];
		for (int j = 0; j < len2; j++)
			right[j] = a[m + 1 + j];

		int i = 0, j = 0, k = low;
		while (i < len1 && j < len2) {
			if (left[i] <= right[j])
				a[k] = left[i++];
			else
				a[k] = right[j++];
			k++;
		}
		while (i < len1)
			a[k++] = left[i++];
		while (j < len2)
			a[k++] = right[j++];
	}

	// TimSort Implementation
	public static void timSort(int[] arr, int n) {
		// Sort individual sub arrays of size RUN
		for (int i = 0; i < n; i += RUN)
			insertionSort(arr, i, Math.min((i + 31), (n - 1)));
		for (int size = RUN; size < n; size = 2 * size) {
			for (int left = 0; left < n; left += 2 * size) {
				int mid = left + size - 1;
				int right = Math.min((left + 2 * size - 1), (n - 1));
				merge(arr, left, mid, right);
			}
		}
	}

	// print the array element.
	public static void print(int[] a) {
		for (int n : a) {
			System.out.print(n + " ");
		}
	}

	public static void main(String[] args) {
		int[] m_array = { 2, 4, 1, 9, 11, 7, 7, 91, 13, 21, 3 };
		int len = m_array.length;
		System.out.print("Given Array: ");
		print(m_array);
		System.out.println();
		timSort(m_array, len);
		System.out.print("Sorted Array: ");
		print(m_array);

	}
}
