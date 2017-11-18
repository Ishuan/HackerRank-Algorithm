package implementation;

import java.util.*;

public class Apple_and_Orange {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int t = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();
		int[] apple = new int[m];
		for(int apple_i=0; apple_i < m; apple_i++){
			apple[apple_i] = in.nextInt();
		}
		int[] orange = new int[n];
		for(int orange_i=0; orange_i < n; orange_i++){
			orange[orange_i] = in.nextInt();
		}
		int apple_num = 0;
		int orange_num = 0;
		for(int i=0;i<apple.length;i++){
			int dist = 0;
			dist = a+apple[i];
			if(dist>=s && dist<=t)
				apple_num++;
			else
				continue;
		}

		for(int i=0;i<orange.length;i++){
			int dist = 0;
			dist = b+orange[i];
			if(dist<=t && dist>=s)
				orange_num++;
			else
				continue;
		}

		System.out.println(apple_num+"\n"+orange_num);

		in.close();
	}
}
