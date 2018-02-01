package implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Utopian_Tree {

    static int utopianTree(int n) {
        // Complete this function
        int height =1;
        int num=1;
        if (n==0){
            return (1);
        }
        else{
            while(num<=n){
                if(num%2!=0){
                    height *=2;
                }
                else if(num%2==0){
                    //Summer cycle
                    height +=1;
                }
                num++;
            }
            return (height);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int result = utopianTree(n);
            System.out.println(result);
        }
        in.close();
    }
}

