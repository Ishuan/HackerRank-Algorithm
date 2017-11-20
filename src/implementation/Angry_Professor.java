package implementation;

import java.util.Scanner;

public class Angry_Professor {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      int test_cases = sc.nextInt();
      for(int i=0;i<test_cases;i++){
      // Providing number of students and threshold
      int[] stu = new int[2];
      for(int j=0;j<2;j++){
        stu[j] = sc.nextInt();
      }
      //Providing arrival time
      int n = stu[0];
      int[] arr_time = new int[n];
      for(int k=0;k<n;k++){
        arr_time[k] = sc.nextInt();
      }
      String res = classCancel(stu,arr_time);
      System.out.println(res);
      }
      sc.close();
    }
  
  static String classCancel(int[] stu, int[] arr_time){
    String res="";
    int count=0;
    for(int i=0;i<arr_time.length;i++){
      if(arr_time[i] <= 0)
        count++;
    }
    if(count>=stu[1])
      res = "NO";
    else
      res = "YES";
    
    return res;
  }
  
}