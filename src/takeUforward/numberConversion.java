package takeUforward;

public class numberConversion {
    public static void main(String[] args) {

//DECIMAL TO HEX TO DECIMAL
/*
        int i=5245;
        String array="abcdef";

        String digit=Integer.toHexString(i);
        System.out.print(digit);
        System.out.println();

        int n=Integer.parseInt(digit,16);
        System.out.println(n+"\n");

        String ans="";
        while(i>0){
            int a=i%16;
            if(a>9) {
                a=a-9;
                ans=ans+array.charAt(a-1);
            }else {
                ans=ans+a;
            }
            i=i/16;
        }

        for (int j = ans.length()-1; j >=0 ; j--) {
            System.out.print(ans.charAt(j));
        }

        System.out.println();
        int m=0,k=0;
        for (int j = 0; j < ans.length() ; j++) {
            if(ans.charAt(j)=='a') {
                k=10;
            } else if (ans.charAt(j)=='b') {
                k=11;
            } else if (ans.charAt(j)=='c') {
                k=12;
            } else if (ans.charAt(j)=='d') {
                k=13;
            } else if (ans.charAt(j)=='e') {
                k=14;
            } else if (ans.charAt(j)=='f') {
                k=15;
            }else {
                k=Integer.parseInt(String.valueOf(ans.charAt(j)));
            }
            m= (int) (m+ k * Math.pow(16,j));
        }
        System.out.println(m);
*/


//DECIMAL TO OCTAL TO DECIMAL
/*
        int i=8;

        String digit=Integer.toOctalString(i);
        System.out.print(digit);
        System.out.println();

        int n=Integer.parseInt(digit,8);
        System.out.println(n);

        String ans="";
        while(i>0){
            ans=ans+ String.valueOf(i%8);
            i=i/8;
        }
        for (int j = ans.length()-1; j >=0 ; j--) {
            System.out.print(ans.charAt(j));
        }

        System.out.println();
        int m=0;
        for (int j = 0; j < ans.length() ; j++) {
            m= (int) (m+Integer.parseInt(String.valueOf(ans.charAt(j))) * Math.pow(8,j));
        }
        System.out.println(m);
*/


//DECIMAL TO BINARY TO DECIMAL
/*
        int i=8;

        String digit=Integer.toBinaryString(i);
        System.out.print(digit);
        System.out.println();

        int n=Integer.parseInt(digit,2);
        System.out.println(n);

        String ans="";
        while(i>0){
            ans=ans+ String.valueOf(i%2);
            i=i/2;
        }
        for (int j = ans.length()-1; j >=0 ; j--) {
            System.out.print(ans.charAt(j));
        }

        System.out.println();
        int m=0;
        for (int j = 0; j < ans.length() ; j++) {
            m= (int) (m+Integer.parseInt(String.valueOf(ans.charAt(j))) * Math.pow(2,j));
        }
        System.out.println(m);
 */
    }
}
