package sorting;

public class ShellShort {

	public static void shellSort(int[] a) {
		int n = a.length;
		for (int gap = n / 2; gap > 0; gap /= 2) {
			// The first gap elements a[0..gap-1] are already
			for (int i = gap; i < n; i += 1) {
				int key = a[i];
				int j;
				for (j = i; j >= gap && a[j - gap] > key; j -= gap)
					a[j] = a[j - gap];

				// put temp (the original a[i]) in its correct
				a[j] = key;
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
		int[] shell = { 2, 4, 1, 9, 11, 7, 7, 91, 13, 21, 3 };
		System.out.print("Given Array: ");
		print(shell);
		System.out.println();
		shellSort(shell);
		System.out.print("Sorted Array: ");
		print(shell);
	}

}
