
import java.util.Scanner;

public class Smallest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the N value");
        int n = sc.nextInt();
        int minval = Integer.MAX_VALUE;
        for (int i = 1; i>n; i++) {
            int current = sc.nextInt();
            minval = Math.min(minval, current);
        }

        System.out.println("The largest number is " + minval);
    }

}