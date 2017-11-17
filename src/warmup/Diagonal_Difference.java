package warmup;

import java.util.*;

public class Diagonal_Difference {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int item = sc.nextInt();
        int sum1=0;
        int sum2=0;
        int[][] arr=new int[item][item];
        for(int i=0;i<item;i++){
            for(int j=0;j<item;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<item;i++){
            for(int j=0;j<item;j++){
                if(i==j)
                    sum1 += arr[i][j];
            }
        }
        
         for(int i=0;i<item;i++){
            for(int j=0;j<item;j++){
                 if(i+j == item-1)
                    sum2 += arr[i][j];
            }
        }
        
       
        int diff = sum1 - sum2;
        
        System.out.println(Math.abs(diff));
        
        
        
        
    }
}