package implementation;

import java.util.Scanner;

public class Migratory_Birds {

	static int migratoryBirds(int n, int[] ar) {
		int arr[] = new int[5];
		for(int i=0;i<n;i++){
			arr[ar[i]-1]+= 1;
		}
		int max=arr[0];
		int pos = 0;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]>max){
				max=arr[j];
				pos = j+1;
			}
			else
				continue;
		}
		return pos;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int ar_i = 0; ar_i < n; ar_i++){
			ar[ar_i] = in.nextInt();
		}
		int result = migratoryBirds(n, ar);
		System.out.println(result);
	}
}
