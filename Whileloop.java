import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Whileloop {
    public static void main(String[] args) {
     
        // Creating a String array 
        String[] arr = { "Geeks", "for", "Geeks" }; 
  
        // Using Arrays.stream() to convert 
        // array into Stream 
        Stream<String> stream = Arrays.stream(arr); 
  
        // Displaying elements in Stream 
        stream.forEach(str -> System.out.print(str + " ")); 
    }
}
