package implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Jumping_On_The_Clouds_Revisited {

    static int jumpingOnClouds(int[] c, int k, int n) {
        // Complete this function
        int energy = 100;
        int cloud=0;
        
        while (energy>0){
            cloud = (cloud+k)%(n);
            if (cloud==0){
                energy = (c[cloud]==0?energy-1:energy-3);
                break;
            } 
            else if(c[cloud]==0){
                energy = energy-1;
            }
            else{
                energy = energy-3;
            }
        }
        return (energy);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] c = new int[n];
        for(int c_i = 0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int result = jumpingOnClouds(c, k,n);
        System.out.println(result);
        in.close();
    }
}

