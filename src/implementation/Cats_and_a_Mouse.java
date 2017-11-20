package implementation;

import java.util.Scanner;

public class Cats_and_a_Mouse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            String str = catMouse(x,y,z);
            System.out.println(str);
            in.close();
        }
    }
  
  static String catMouse(int catA, int catB, int mouseC){
    int dist_a = 0, dist_b=0;
    String res="";
    dist_a = Math.abs(catA-mouseC);
    dist_b = Math.abs(catB-mouseC);
    if(dist_a < dist_b)
      res =  "Cat A";
    else if(dist_b < dist_a)
      res = "Cat B";
    else if(dist_b == dist_a)
      res = "Mouse C";
    
    return res;
  }
  
}
