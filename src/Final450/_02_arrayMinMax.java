package Final450;

public class _02_arrayMinMax {
    public static void main(String[] args) {
        int a[]={2,5,10,23,5,6,41,26,32,11,4};
        findMinMax(a);
    }

    static void findMinMax(int a[])
    {
        int min=a[0],max=a[0];

        for (int i = 0; i <a.length ; i++) {

            min=Math.min(min,a[i]);
            max=Math.max(max,a[i]);
           /*
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
            */
        }

        System.out.println("Minimum is: "+min);
        System.out.println("Maximum is :"+max);
    }
}
