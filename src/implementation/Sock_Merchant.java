package implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sock_Merchant {

    static int sockMerchant(int n, int[] ar) {
      List<Integer> sock = new ArrayList<Integer>();
      int total =0,count=0 ;
      for(int i=0;i<ar.length-1;i++){
        if(sock.contains(ar[i]))
            continue;
        for(int j=0;j<ar.length;j++){
          
          if(ar[j]==ar[i])
            count +=1;
        }
        total += count/2;
        count =0;
        sock.add(ar[i]);
      }
      return total;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        } 
        int result = sockMerchant(n, ar);
        System.out.println(result);
        in.close();
    }
}
