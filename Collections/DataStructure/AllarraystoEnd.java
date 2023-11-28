package Collections.DataStructure;

import java.util.*;
import java.lang.*;

public class AllarraystoEnd {
    public static void main(String[] args) {
        int arr[] = { 2, 0, 5, 0, 6, 7, 0, 5, 0, 7, 9 };
        int n = arr.length;
        pushToZeros(arr, n);
        System.out.println("Array after pushing zeros to the back: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int pushToZeros(int arr[], int n) {
        int count = 0;

        // int arr[] = { 2, 0, 5, 0, 6, 7, 0, 5, 0, 7, 9 };
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < n) {
            arr[count++] = 0;
        }
        return 0;
    }
}
