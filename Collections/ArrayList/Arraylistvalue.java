package Collections.ArrayList;

import java.util.ArrayList;

public class Arraylistvalue {
    
    public static void main(String[] args) {
        ArrayList<Double> cl=new ArrayList<Double>();
        cl.add(10.2);
        cl.add(10.5);
        cl.add(90.9);
        cl.add(1,45.6);

        System.out.println("ArryaList One");
        System.out.println(cl);

        for(Double x:cl)
        {
            System.out.println(x);
        }

       ArrayList<Double> cl2=new ArrayList<Double>();
       cl2.add(10.1);
       cl2.add(20.1);
       cl2.add(95.1);

        System.out.println("ArryaList Two");
        System.out.println(cl2);
        

        for(Double y:cl2)
        {
            System.out.println(y);
        }

        cl.addAll(cl2);

        cl.clear();

        System.out.println(cl);

        System.out.println("Print all");

        for(Double z:cl)
        {
            System.out.println(z);
        }
        

    }
}
