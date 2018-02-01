package implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Beautiful_Days_At_The_Movies {

    static int beautifulDays(int i, int j, int k) {
        // Complete this function
        
        int num=0;
        int days =0;
        for(int a=i;a<=j;a++){
            num = a;
            int rev=0;
            while (num!=0){
                rev = rev*10+num%10;
                num /= 10;
            }
            int diff = Math.abs(a-rev);
            if(diff%k==0)
                days++;
        }
        return (days);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int result = beautifulDays(i, j, k);
        System.out.println(result);
        in.close();
    }
}

