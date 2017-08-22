package array;

/*
 * To search an element in array.
 * @author Div (Vidhikara)
 */
import java.util.Scanner;

public class array_search {

	// Function for Searching the item in the array
	public static int searchk(int[] a, int value) {

		int size = a.length;
		for (int i = 0; i < size; i++) {
			if (a[i] == value) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int n = s.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements: ");
		for (int i = 0; i < n; i++) {// for reading array
			arr[i] = s.nextInt();
		}
		// Search for element
		System.out.println("Enter search key:  ");
		int searchKey = s.nextInt();

		int sk = searchk(arr, searchKey);
		if (sk < 0) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at " + sk + " position");
		}

		s.close();
	}

}
