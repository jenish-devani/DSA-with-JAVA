package leetCode75;



public class _03duplicate {
    public static void main(String[] args) {
        int a[]={1,2,4,5};
        int flag=0;

        /* BrutForce
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]==a[j]){
                   flag=1;
                   break;
                }
            }
            break;
        }
        if(flag==1){
            System.out.println("Contains Duplicate");
        }else{
            System.out.println("No Duplicate");
        }
        */
    }
}
