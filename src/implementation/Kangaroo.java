package implementation;

import java.util.Scanner;

public class Kangaroo {

	static String kangaroo(int x1, int v1, int x2, int v2) {
		// Complete this function
		String res="";
		int kang_1 = x1;
		int kang_2 = x2;
		if((x2>x1) && (v2>v1))
			res = "NO";
		else{
			for(int i=1;i<=10000;i++){
				kang_1 += v1;
				kang_2 += v2;
				if(kang_1 == kang_2){
					res = "YES";
					break;
				}
				else{
					res = "NO";
					continue;
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		String result = kangaroo(x1, v1, x2, v2);
		System.out.println(result);
		in.close();
	}
}
