import java.util.*;

public class Linearsearch {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the N Value: ");
        int n=sc.nextInt();
        int arr[] =new int[n];

        for(int i=0;i<n;i++)
        {
             arr[i]=sc.nextInt();
        }

        System.out.println("Enter the Key Value to find the condition");

        int key=sc.nextInt();

        int ans=-1;

        for(int j=0;j<n;j++)
        {
            if(arr[j]==key)
            {
              ans=j;
              break;
            }
        }

        System.out.println(ans);
    }
}
