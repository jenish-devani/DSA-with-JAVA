package takeUforward;

import java.sql.SQLOutput;
import java.util.Scanner;

public class recursion {

    static void printName(int i,int n)
    {
        System.out.println(i+" Jenish");
        if(n>1) {
            i++;
            printName(i+1,n - 1);
        }
    }

    static void printNumbers(int i,int n){
        System.out.print(i+" ");
        if(n>1){
            printNumbers(i+1,n-1);
        }
    }

    public static void main(String[] args) {

        int n,i=1;
        System.out.println("Enter the Number: ");
        Scanner x=new Scanner(System.in);
        n= x.nextInt();
        printNumbers(i,n);
        
        //printName(n);
    }
}
