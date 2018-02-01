package implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Extra_Long_Factorials {

    static void extraLongFactorials(int n) {
        // Complete this function
        
        //BigInteger num = new BigInteger(n);
        BigInteger fact = new BigInteger("1");
        while(n>1){
            fact = fact.multiply(BigInteger.valueOf(n));
            n--;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        extraLongFactorials(n);
        in.close();
    }
}

