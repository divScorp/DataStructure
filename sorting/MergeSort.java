package sorting;

public class MergeSort {

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
	
	//Merge sort implementation 
	public static void mergeSort(int[] a, int lower, int upper) {
		if (lower < upper) {
			int mid = (lower + upper) / 2;
			mergeSort(a, lower, mid);
			mergeSort(a, mid + 1, upper);
			merge(a, lower, mid, upper);
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
		int low = 0, high = m_array.length - 1;
		System.out.print("Given Array: ");
		print(m_array);
		System.out.println();
		mergeSort(m_array, low, high);
		System.out.print("Sorted Array: ");
		print(m_array);
	}

}
