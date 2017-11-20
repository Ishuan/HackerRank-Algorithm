package implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Electronics_Shop {

   static int getMoneySpent(int[] keyboards, int[] drives, int s){
        // Complete this function
     int sum=0,diff=0,price=0;
     List<Integer> newList = new ArrayList<Integer>();
     List<Integer> newList1 = new ArrayList<Integer>();
     for(int i=0;i<keyboards.length;i++){
       for(int j=0;j<drives.length;j++){
         sum = keyboards[i]+drives[j];
         newList.add(sum);
         diff = s-sum;
         newList1.add(diff);
       }
     }
     Collections.sort(newList);
     Collections.sort(newList1);
     if(s<newList.get(0))
       return -1;
     else{
       for(int i=0;i<newList1.size();i++){
         if(newList1.get(i)>=0){
           price = s- newList1.get(i);
           break;
         }
       }        
     }
     return price;
   }
         
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}
