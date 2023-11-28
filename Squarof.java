import java.util.*;
public class Squarof {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the N Value: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int a=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            a=arr[i]*arr[i];
            System.out.print(a+" ");
        }

    }
}
