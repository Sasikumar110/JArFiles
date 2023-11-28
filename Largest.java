
import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the N value");
        int n = sc.nextInt();
        int maxval = Integer.MIN_VALUE;
        for (int i = 1; i <=n; i++) {
            int current = sc.nextInt();
            maxval = Math.max(maxval, current);
        }

        System.out.println("The largest number is " + maxval);
    }

}