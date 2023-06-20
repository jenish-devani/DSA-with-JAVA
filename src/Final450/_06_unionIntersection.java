package Final450;

import java.util.ArrayList;

public class _06_unionIntersection {
    public static void main(String[] args) {
        int a[]={7,8,1,2,3};
        int b[]={4,5,6,7,8};
        ArrayList intersection=new ArrayList<Integer>();
        ArrayList union=new ArrayList<Integer>();


        int flag=0;
        for (int i = 0; i < a.length; i++) {
            union.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            flag=0;
            for (int j = 0; j < a.length; j++) {
                if(b[i]==a[j]){
                   flag++;
                }
            }
            if(flag==0){
                union.add(b[i]);
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i]==b[j]){
                    intersection.add(a[i]);
                }
            }
        }

        System.out.println("Union Array is: ");
        for (int i = 0; i < union.size(); i++) {
            System.out.print(union.get(i)+" ");
        }

        System.out.println("\nIntersection Array is: ");
        for (int i = 0; i < intersection.size(); i++) {
            System.out.print(intersection.get(i)+" ");
        }

    }
}
