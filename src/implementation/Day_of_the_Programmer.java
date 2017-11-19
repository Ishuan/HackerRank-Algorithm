package implementation;

import java.util.Scanner;

public class Day_of_the_Programmer {

    static String solve(int yr){
      String res="";
      if((yr<=1917) || (yr > 1918)){
        if(leapyear(yr))
          res = "12.09."+Integer.toString(yr);
        else
          res = "13.09."+Integer.toString(yr);
      }
      else{
        res = "26.09."+Integer.toString(yr);
      }
      return res; 
    }
  
  static boolean leapyear(int yr){
    if(yr<=1917){
      return (yr%4==0 ? true:false);
    }
    else
      return (((yr%4==0 && yr%100!=0) || (yr%400==0)) ? true:false);
  }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
        in.close();
    }
}
