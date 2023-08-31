package leetCode75;

public class _02buySell {
    public static void main(String[] args) {

        int a[]={7,3,4,2,8,3,4,1,4};
        int l=0,r=1,max=0;

        for (int i = 0; i < a.length-1; i++) {
            if(a[l]<a[r]){
                if(max<(a[r]-a[l])){
                    max=a[r]-a[l];
                }
                r++;
            }else{
                l=r;
                r++;
            }
        }
        System.out.println("Max Profit is: "+max);

    }
}
