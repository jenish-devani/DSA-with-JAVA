package Final450;

import java.util.Scanner;

public class _07_rotateArray {

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        //int n=0,tmp;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        int k=2;

        int n=0,tmp;
        int ar[]= new int[k];
        int af[]=new int[a.length-k];
        int an[]=new int[a.length];
        int p=0,q=0,st=0;

        for (int i = a.length-k; i <a.length; i++) {
            ar[p]=a[i];
            p++;
        }


        System.out.println("\nRear :");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }

        for (int i = 0; i <af.length; i++) {
            af[q]=a[i];
            q++;
        }

        System.out.println("\nFront :");
        for (int i = 0; i < af.length; i++) {
            System.out.print(af[i]+" ");
        }

        for (int i = 0; i < ar.length ; i++) {
            an[i]=ar[i];
        }

        int j=0;
        for (int i = ar.length; i <a.length ; i++) {
            an[i]=af[j];
            j++;
        }



        System.out.println("\nAns:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(an[i]+" ");
        }

        //Rotate Right
        /*
        while(n!=1){
            tmp=a[a.length-1];
            for (int i = a.length-1; i >0; i--) {
                a[i]=a[i-1];
            }
            a[0]=tmp;

            System.out.println("\nRotated Array:");
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]+" ");
            }

            System.out.println("\nIf you want to Rotate Enter 0 else Enter 1 to Exit: ");
            Scanner x=new Scanner(System.in);
            n=x.nextInt();
        }
        */

        // Rotate Left
        /*
        while(n!=1){
            tmp=a[0];
            for (int i = 0; i < a.length-1; i++) {
               a[i]=a[i+1];
            }
            a[a.length-1]=tmp;

            System.out.println("\nRotated Array:");
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]+" ");
            }

            System.out.println("\nIf you want to Rotate Enter 0 else Enter 1 to Exit: ");
            Scanner x=new Scanner(System.in);
            n=x.nextInt();
        }

         */
    }

}
