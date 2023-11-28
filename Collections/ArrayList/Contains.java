package Collections.ArrayList;
import java.util.ArrayList;


public class Contains {

    public static void main(String[] args) {
    ArrayList<Integer> mn=new ArrayList<Integer>();
    mn.add(32);
    mn.add(45);
    mn.add(67);
    mn.add(89);
    mn.add(100);
    
    Boolean s;


    s=mn.contains(45);

    if(s)
    {
        System.out.println("true boy");
    }
    else
    {
        System.out.println("Worst Not have");
    }

    }
    
}
