package warmup;

import java.util.*;

public class Time_Conversion {

    static String timeConversion(String s) {
        String str[] = s.split(":");
      if(str[2].contains("AM")){
        int hr = Integer.parseInt(str[0]);
        if(hr==12){
          str[0] = "00";
        }
        str[2]=str[2].replace("AM","");
      }
      else if(str[2].contains("PM")){
        int hr;
        hr = Integer.parseInt(str[0]);
        if(hr!=12){
        hr +=12;
        str[0] = Integer.toString(hr);
        }
        str[2]=str[2].replace("PM","");   
      }
      String res = str[0]+":"+str[1]+":"+str[2];
      return res;
    }
  
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
