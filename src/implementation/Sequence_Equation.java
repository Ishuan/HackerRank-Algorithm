package implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sequence_Equation {

    static int[] permutationEquation(int[] p,int n) {
        // Complete this function
        int[] res = new int[n];
        for (int x=1;x<=n;x++){
            for(int i=0;i<p.length;i++){
                if(p[i]==x){
                    for(int j=0;j<p.length;j++){
                        if(p[j]==(i+1)){
                            res[(x-1)]=(j+1);
                        }
                    }
                }
                      
            }
        }
         return (res); 
      }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] p = new int[n];
        for(int p_i = 0; p_i < n; p_i++){
            p[p_i] = in.nextInt();
        }
        int[] result = permutationEquation(p,n);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}

