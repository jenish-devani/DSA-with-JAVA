package Final450;

public class _09_minTowerHeight {
    public static void main(String[] args) {
        int a[]={1,15,10};
        int k=6,tmp;

        for (int i = 0; i < a.length-1; i++) {
            for (int j = 1; j < a.length; j++) {
                if(a[i]>a[j]){
                    tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        }
        int min=a[0]+k;
        int max=a[a.length-1]-k;

        System.out.println("Minimum Tower Height Difference is :"+a[0]+a[1]+a[2]+(max-min));
    }
}
