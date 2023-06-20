package takeUforward;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {

//Sort the Array
/*
        int[] a={-45,10,2,0,59,-78,56};
        int tmp;

        //Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
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
            System.out.println(a[i]);
        }
*/

// Search Element in Array with MIN & MAX
/*
        int n,s;
        System.out.println("Enter the array size:");
        Scanner x=new Scanner(System.in);
        n=x.nextInt();

        int[] a=new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i]=x.nextInt();
        }

        System.out.println("Enter the element to search:");
        s=x.nextInt();

        int flag=0;
        for (int i = 0; i < n; i++) {
            if (s == a[i]) {
                flag = 1;
            }
        }

        if(flag==1){
            System.out.println("Element found");
        }else{
            System.out.println("Element not found");
        }

        int max=a[0],min=a[0];

        for (int i = 0; i < n ; i++) {
            if(a[i]>max) {
                max=a[i];
            }
            if(a[i]<min)
            {
                min=a[i];
            }
        }

        System.out.println("Max: "+max+"\nMin: "+min);
*/
    }
}
