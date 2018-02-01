package implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;

public class Designer_PDF_Viewer {

    static int designerPdfViewer(int[] h, String word) {
        // Complete this function
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();       
        int len = word.length();
        int ascVal = 97;
        int max=0;
        for(int i=1;i<=26;i++,ascVal++){
            map.put(ascVal, h[i-1]);
        }
        for (int j=0;j<len;j++){
            int height = map.get((int)word.charAt(j));
            if (height>=max){
                max=height;
            }
        }
        //System.out.println(map);
        return (len*1*max);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i = 0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int result = designerPdfViewer(h, word);
        System.out.println(result);
        in.close();
    }
}

