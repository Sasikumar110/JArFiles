import java.util.Scanner;

public class Reversearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the loop values");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }

        for(int j=0;j<n;j++)
        {
            System.out.print(arr[j]+" ");
        }
        System.out.println(" ");
        
        for (int i = arr.length-1; i >=0; i--) {
            System.out.print(arr[i]+" ");
        }

    }
}
