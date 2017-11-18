package warmup;

import java.util.*;

public class Birthday_Cake_Candles {

    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
      int  max = 0;
      int n1 =0;
      for(int j=0;j<n;j++){
        if(ar[j]>max)
          max = ar[j];
      }
      for(int k=0;k<n;k++){
        if(ar[k]==max)
          n1+=1;          
      }
      return n1;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
        in.close();
    }
   
}
