package Collections.DataStructure;
import java.util.*;
import java.lang.*;


// public class LargestThreeArray {
//     public static int printLargestThree(int arr[], int n) {
//         int i;
//         int first=0;
//         int secound=0;
//         int third=0;
//         if (n < 3) {
//             System.out.println("Invalid Input");
//             return 0;
//         }

//         // int arr[] = { 10,65,20,76, 45, 23 };
//         for (i = 0; i < n; i++) {
//             if (arr[i] > first) {
//                 third = secound;
//                 secound = first;
//                 first = arr[i];
//             } else if (arr[i] > secound) {
//                 third = secound;
//                 secound = arr[i];
//             }

//             else if (arr[i] > third) {
//                 third = arr[i];
//             }
//         }
//         System.out.println("Largest Three numbers arr " + first + " " + secound + " " + third);
//         return 0;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 10,65,20,76, 45, 23 };
//         int n = arr.length;
//         printLargestThree(arr, n);

//     }

// }

class LargestThreeArray{


    public static void main(String[] args) {
        LargestThreeArray larg=new LargestThreeArray();
        int arr[] = { 10,65,20,76, 45, 23 };
        larg.findLargestValue(arr);
    }

    public static int findLargestValue(int arr[])
    {
        System.out.println();
        Arrays.sort(arr);
        int n=arr.length;
        int count=1;
        int check=0;
        for (int i = 1; i <= n; i++) {
 
            if (count < 4) {
                if (check != arr[n - i]) {
                    // to handle duplicate values
                    System.out.print(arr[n - i] + " ");
                    check = arr[n - i];
                    count++;
                }
            }
            else
            {
                break;
            }
        }
        return 0;
    }
}
