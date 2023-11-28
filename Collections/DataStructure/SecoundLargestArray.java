package Collections.DataStructure;

import java.util.*;
import java.lang.*;

public class SecoundLargestArray {
    public static void main(String[] args) {
        int arr[] = { 20, 36, 47, 13, 25 };
        int n = arr.length;
        // Arrays.sort(arr);
        // System.out.println("Secound Largest : "+arr[n-2]);
        System.out.println("Secound Largest : " + findSecoundLargest(arr, n));
    }

    public static int findSecoundLargest(int arr[], int n) {
        int i = 0;

        int first = 0;
        int secound = 0;
        int third = 0;
        for (i = 0; i < n; i++) {
            if (arr[i] > first) {
                third = secound;
                secound = first;
                first = arr[i];
            } else if (arr[i] > secound) {
                third = secound;
                secound = arr[i];
            } else if (arr[i] > third) {
                third = arr[i];
            }
        }
        System.out.println("First:" + first);
        System.out.println("Secound:" + secound);
        System.out.println("Secound:" + third);

        return 0;
    }
}
