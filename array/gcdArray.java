package array;

import java.util.Scanner;

public class gcdArray {

	public static int gcd(int x,int y) {
		int min,max;
		if(x<y) {
			min=x; max=y;
		}else {
			min=y; max=x;
		}
		
		return (min == 0)?max:gcd(min, max % min);
	}
	
	public static int  findGCD(int[] a, int n) {
		int res=a[0];
		for(int i=0;i<n;i++) {
			res=gcd(a[i],res);
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements in array? ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("GCD of "+n+" Numbers: "+findGCD(arr,n));
		sc.close();
	}

}
