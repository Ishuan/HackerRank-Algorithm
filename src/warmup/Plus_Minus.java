package warmup;

import java.util.Scanner;

public class Plus_Minus {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner sc = new Scanner(System.in);
      int inp = sc.nextInt();
      int ar[] = new int[inp];
      int p =0;
      int n =0;
      int z = 0;
      
      for(int i=0;i<inp;i++){
        ar[i] = sc.nextInt();
        if(ar[i]<0)
        {n +=1;}
        if(ar[i]>0)
        { p +=1;}
        if(ar[i]==0)
        {z+=1;}
      }
      
      System.out.println((float)p/inp);
      System.out.println((float)n/inp);
      System.out.println((float)z/inp);
      
      sc.close();
      
    }
}