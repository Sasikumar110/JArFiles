package Collections.DataStructure;

import java.util.*;
import java.lang.*;


public class pushToArr {
    public static void main(String[] args) {
       ArrayList<Integer> arl=new ArrayList<>(Arrays.asList(5,0,6,0,7,0,8,9,0,4));
       arl.forEach((x)->System.out.println(x));
       move_zeros_right(arl);
    }

    public static void move_zeros_right(ArrayList<Integer> arl) {
      int count=0;
      
      for(int i=0;i<arl.size();i++)
      {
        if(arl.get(i)==0)
        {
           count++;
           arl.remove(i);
           i--;
        }
      }

      for(int j=0;j<count;j++)
      {
        arl.add(0);
      }

      for(int i=0;i<arl.size();i++)
      {
         System.out.print(arl.get(i)+" ");
      }


    }
}
