import java.util.Scanner;
import java.util.*;

public class Twoarrays {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N Value: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];

        System.out.println("Enter the first Set Array");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the Secound Set Array");
        for (int j = 0; j < n; j++) {
            arr2[j] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                }
            }
        }
    }
}
