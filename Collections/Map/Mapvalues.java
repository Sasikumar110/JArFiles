package Collections.Map;

import java.util.*;
import java.util.Map.Entry;



public class Mapvalues {
    
    public static void main(String args[])
    
    {
         Map<String,Integer> mi=new HashMap<String,Integer>();
         mi.put("Sasikumar",1);
         mi.put("manikandan",2);
         mi.put("vinayak",1);
         mi.put("manik",4);

         System.out.println(mi);

         for(Map.Entry<String, Integer> val:mi.entrySet())
         {
            System.out.println(val.getKey()+":"+ val.getValue());
         }


    }
}
