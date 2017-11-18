package warmup;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Mini_Max_Sum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
    int temp=0;
      for(int j=0;j<arr.length-1;j++){
        for(int k=j+1;k<arr.length;k++){
        if(arr[j]>arr[k]){
          temp = arr[j];
          arr[j] = arr[k];
          arr[k] = temp;
          
        }  
        }
        
      } 
      long min_s=0;
      long max_s=0;
      for(int x=0;x<arr.length-1;x++){
        min_s += arr[x];
      }
      
      for(int y=1;y<arr.length;y++){
        max_s += arr[y];
      }
      
      System.out.println(min_s+" "+max_s);
      }
        
    }

