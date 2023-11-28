package Collections.DataStructure;
import java.util.*;


public class PeakElementArray {
    public static void main(String[] args) {
        int arr[]={5, 10, 20, 15,4,9,6};
        int n=arr.length;
        System.out.println("Peak Point Value is :"+findPeak(arr,n));
        int j=findPeak(arr, n);
        for(int k=0;k<=j;k++)
        {
        if(k==j)
         System.out.println(arr[k]);
        }

    }

    public static int findPeak(int arr[],int n)
    {
       if(n==0)
       {
        return 0;
       }
       if(arr[0]>=arr[1])
       {
          return 0;
       }
       if(arr[n-1]>=arr[n-2])
       {
        return n-1;
       }

       for(int i=1;i<n-1;i++)
       {
        if(arr[i]>arr[i+1] && arr[i]>arr[i-1])
        {
            return i;
        }
       }

       return 0;
    }
}



