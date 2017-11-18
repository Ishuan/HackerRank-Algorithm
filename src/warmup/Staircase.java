package warmup;

import java.io.*;
import java.util.*;

public class Staircase {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner sc = new Scanner(System.in);
      int inp = sc.nextInt();
      int flag = inp;
      for(int i=0; i<inp ;i++){
        for(int j=flag-1;j>0;j--){
          System.out.print(" ");
        }
        for(int k=0;k<=i;k++){
          System.out.print("#");
        }
        flag--;
        System.out.println();
      }
    }
}