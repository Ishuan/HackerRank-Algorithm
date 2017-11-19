package implementation;

import java.util.Scanner;

public class Between_two_Sets {

	static int getTotalX(int[] a, int[] b) {
		int div_a =0;
		int div_b = 0;
		int total=0;
		for(int x=1;x<=100;x++) {
			for(int i=0;i<a.length;i++) {
				if(x%a[i]==0)
					div_a++;
			} if(div_a == a.length) {
				for(int j=0;j<b.length;j++) {
					if(b[j]%x==0)
						div_b++;
				}

				if(div_b == b.length)
					total++;
			}
			div_a =0;
			div_b =0;
			//	System.out.println(x);
		}  //end of x loop
		return total;
	}


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n];
		for(int a_i = 0; a_i < n; a_i++){
			a[a_i] = in.nextInt();
		}
		int[] b = new int[m];
		for(int b_i = 0; b_i < m; b_i++){
			b[b_i] = in.nextInt();
		}
		int total = getTotalX(a, b);
		System.out.println(total);
		in.close();
	}
}
