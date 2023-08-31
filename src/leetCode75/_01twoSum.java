package leetCode75;

import java.util.HashMap;

public class _01twoSum {

    public static void main(String[] args) {

        /* BrutForce

        int a[]={1,22,7,2},n=9;
        int ans[]=new int[2];

        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]+a[j]==n){
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }
            }
        }

        System.out.println("Index : "+ans[0]+" "+ans[1]);
        
         */

        int a[]={1,2,7,9,5},n=9;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if(map.containsKey(n-a[i])){
                System.out.println("Index : "+map.get(n-a[i])+" "+i);
            }else{
                map.put(a[i],i);
            }
        }
    }
}
