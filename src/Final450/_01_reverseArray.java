package Final450;

import java.util.Scanner;

public class _01_reverseArray {
    public static void main(String[] args) {
        int n;

        Scanner x =new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        n=x.nextInt();

        int a[]=new int[n];

        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            a[i]=x.nextInt();
        }

        System.out.println("Your Input Array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }

        int b[]=new int[n];
        b=reverseArray(a,0,n-1);

        System.out.println("\nReversed Array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(b[i]+" ");
        }

    }

    static int[] reverseArray(int a[],int start,int end)
    {
        int tmp,n;
        n=a.length;

        // Recursion Method
        if(start==end){
            return a;
        }else{
            tmp=a[start];
            a[start]=a[end];
            a[end]=tmp;
            reverseArray(a,start+1,end-1);
        }

        /*

        //2. Swap Element Internally in Array

        for (int i = 0; i <n/2 ; i++) {
            tmp=a[i];
            a[i]=a[n-1-i];
            a[n-1-i]=tmp;
        }
        */

        /*

        // 1. Create Another Array and fill it in Reverse Order

        int b[]=new int[n];
        for (int i = 0; i < a.length; i++) {
            b[i]=a[n-1-i];
        }

        */
        return a;
    }
}
