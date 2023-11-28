package Collections.ArrayList;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayPackage {
    public static void main(String[] args) {
     
        String[] all=new String[]{"Sasi","kumar"};
   
        Stream<String> str=Arrays.stream(all);
        

        str.forEach((x)->System.out.print(x+" "));

    }
}
