package implementation;

import java.util.Scanner;

public class Drawing_Book {

    static int solve(int n, int p){
      int pages=0;
      if(p==1 || p==n)
        return 0;
      else if(p<= (n/2)){
        if(p>1)
          pages = p/2;
      }
      else if(p > (n/2)){
        if((n-p)>1)
          pages = (n-p)/2;
        else if (n % 2 == 0 && (n-p) == 1){
                pages = 1;
      }
     
      }
     return pages;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
        in.close();
    }
}
