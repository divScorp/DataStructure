package searching;

import java.util.Scanner;

public class LinearSearch {

	public static int linearSearch(int[] a,int num) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==num)return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] a= {11,3,7,2,9,10,9,14,18};
		System.out.print("Enter the number for Searching: ");
		int n=sc.nextInt();
		int index=linearSearch(a,n);
		if(index==-1) {
			System.out.println("Not Found !!");
		}else {
			System.out.println("Your no. located at: "+(index+1)+" position");
		}
		sc.close();
	}
}
