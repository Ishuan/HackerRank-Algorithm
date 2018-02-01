package implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Find_Digits {

    static int findDigits(int n) {
        // Complete this function
        int num=n;
        int digit,count=0;
        while(num!=0){
            digit = num%10;
            num = num/10;
            if(digit==0)
                continue;
            else if(n%digit == 0){
                count++;
            }
            
        }
        return (count);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int result = findDigits(n);
            System.out.println(result);
        }
        in.close();
    }
}

