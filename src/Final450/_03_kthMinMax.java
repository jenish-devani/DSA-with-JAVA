package Final450;

import java.util.Scanner;

public class _03_kthMinMax {
    public static void main(String[] args) {
        int a[]={1,5,2,4,2,3,4,1,0,1,2,3,4,5,6,4,6,7};
        int tmp,k,flag=0;

        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a[j]>a[i])
                {
                    tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }

            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

        System.out.println("\nEnter the K value: ");
        Scanner x=new Scanner(System.in);
        k=x.nextInt();

        int c=0;
        for (int i = 0; i < a.length; i++) {
            if(k==1){
                System.out.println(a[k-1]);
                break;
            }else if(i!=0 && a[i]!=a[i-1]){
                c++;
                if(c==k-1)
                {
                    System.out.println(a[i]);
                    break;
                }
            }
        }

        // New Array of Unique Items
        /*
        for (int i = 0; i < a.length-1; i++) {
            if(a[i]!=a[i+1])
            {
                flag++;
            }
            System.out.print(a[i]+" ");
            if (i==a.length-2)
            {
                System.out.print(a[i+1]);
            }
        }

        System.out.println("\nSize: "+flag);

        int b[]=new int[flag+1];
        int j=0;

        for (int i = 0; i < a.length-1; i++) {
            if(a[i]!=a[i+1]) {
                b[j]=a[i];
                j++;
            }
        }
        b[j]=a[a.length-1];

        System.out.println("Unique elements in Array");
        for (int i = 0; i < b.length ; i++) {
            System.out.print(b[i]+" ");
        }
        System.out.println("\nEnter the K value: ");
        Scanner x=new Scanner(System.in);
        k=x.nextInt();

        System.out.println(k+"th Min is "+b[k-1]+" and "+k+"th Max is "+b[b.length-k]);
        */


    }
}
