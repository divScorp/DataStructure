package array;

public class MergeTwoArray {

	public static void merge(int[] a, int[] b) {
		int alen = a.length;
		int blen = b.length;
		int clen = alen+blen;
		int[] c=new int[clen];
		for (int i = 0; i < alen; i++) {
			c[i] = a[i];
		}
		int j=0;
		for (int k = alen; k < clen; k++) {
			c[k] = b[j];
			j++;
		}
		for(int n:c) {
			System.out.print(n+" ");
		}
	}
		

	public static void main(String[] args) {
		int[] a1 = { 1, 22, 3, 7, 11 };
		int[] a2 = { 2, 4, 12, 5 };
		merge(a1,a2);
	}
}
