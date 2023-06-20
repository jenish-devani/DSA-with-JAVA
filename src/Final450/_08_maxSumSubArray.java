package Final450;

public class _08_maxSumSubArray {

    public static void main(String[] args) {
        int a[]={-1,-2,-3,-4,5};
        int maxsum=-999,sum=0,j=0,k=0;

        for (int i = 0; i < a.length; i++) {
            sum=sum+a[i];
            if(sum>maxsum){
                maxsum=sum;
                k=i;
            }
            if(sum<0){
                sum=0;
                if(i!=a.length-1 && a[i+1]>0){
                    j=i+1;
                }
            }
        }

        for (int i = j; i <= k; i++) {
            System.out.print(a[i]+" ");
        }



        System.out.print("\nMax subArray Sum is :"+maxsum);
    }
}
