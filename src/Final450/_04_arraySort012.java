package Final450;

public class _04_arraySort012 {
    public static void main(String[] args) {
        int a[]={0,0,1,2,0,1,2,0,1,2,2,0,1,2,0,1,2,1};
        int c0=0,c1=0,c2=0,k0=0,k1=0;

        for (int i = 0; i < a.length; i++) {
            if(a[i]==0){
                c0++;
            } else if (a[i]==1) {
                c1++;
            }else {
                c2++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if(k0<c0){
                a[i]=0;
                k0++;
            } else if (k1<c1) {
                a[i]=1;
                k1++;
            } else {
                a[i]=2;
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

    }
}
