package implementation;

import java.util.Scanner;

public class Birthday_Chocolate {

	static int solve(int n, int[] s, int d, int m){
		int pieces = 0, sum=0;
		for(int i=0;i<=(n-m);i++){
			for(int j=0;j<m;j++){
				sum += s[i+j];
			}
			if(sum==d)
				pieces++;
			sum=0;
		}
		return pieces;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] s = new int[n];
		for(int s_i=0; s_i < n; s_i++){
			s[s_i] = in.nextInt();
		}
		int d = in.nextInt();
		int m = in.nextInt();
		int result = solve(n, s, d, m);
		System.out.println(result);
		in.close();
	}
}
