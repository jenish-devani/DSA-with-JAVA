package Final450;

public class _05_negativeSort {
    public static void main(String[] args) {
        int a[]={1,2,-5,2,0,-7,8,-2,-5,7,8,9,-10,5,-9};
        int k=0,tmp;

        for (int i = 0; i < a.length; i++) {
            if(a[i]<0){
                tmp=a[k];
                a[k]=a[i];
                a[i]=tmp;
                k++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
