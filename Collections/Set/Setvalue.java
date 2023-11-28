package Collections.Set;

import java.util.Set;
import java.util.TreeSet;

public class Setvalue {

    public static void main(String args[])
    {
        Set<Integer> si=new TreeSet<Integer>();
        si.add(4);
        si.add(3);
        si.add(7);
        si.add(2);
        si.add(2);

        System.out.println(si);
    }
    
}
