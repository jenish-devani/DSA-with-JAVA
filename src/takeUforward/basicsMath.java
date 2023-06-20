package takeUforward;

import java.util.Scanner;

public class basicsMath {
    public static void main(String[] args) {

// COUNT DIGIT, PALINDROME, AND REVERSE NUMBER

        int n,c=0,tmp,sum=0,flag=0,p;
        Scanner x=new Scanner(System.in);

        System.out.println("Enter the Number: ");
        n=x.nextInt();
        p=n;

        while (n>0){
            tmp=n%10;
            sum=(sum*10)+tmp;
            n=n/10;
            c++;
        }

        if(sum==p){
            flag=1;
        }

        System.out.print("DIGIT : "+c+"\nPALINDROME : "+flag+"\nREVERSE NUMBER : "+sum);



// PRINT ALL DIVISOR
/*
        int n;
        System.out.println("Enter the Number: ");
        Scanner x=new Scanner(System.in);
        n=x.nextInt();

        for (int i = 1; i <=Math.sqrt(n) ; i++) {
            if(n%i==0){
                System.out.print(i+" ");
                if(i!=n/i){
                    System.out.print(n/i+ " ");
                }
            }
        }

        /*
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
 */



// FIBONACI NUMBER EVEN SUM
/*
    int n,a=0,b=1,c=0,sum=1;
    System.out.println("Enter Number: ");
    Scanner x=new Scanner(System.in);
    n=x.nextInt();
    System.out.print(a+" "+b+" ");
    for (int i=0;i<n-2;i++) {
        c=a+b;
        a=b;
        b=c;
        System.out.print(c+" ");
        if(i%2!=0)
        {
            sum=sum+c;
        }
    }
    System.out.println();
    System.out.print(sum);
*/

// FACTORIAL OF NUMBER
/*    int a,ans=1;

    System.out.println("Enter the Number: ");
    Scanner x=new Scanner(System.in);
    a=x.nextInt();

    for (int i = a; i >=1 ; i--) {
        ans=ans*i;
    }
    System.out.println(ans);
*/

// ARMSTRONG NUMBERS BETWEEN 2 NUMBERS
/*
    int a,b,n=0,sum=0,len=0,k;
    String number;
    Scanner x=new Scanner(System.in);
    System.out.println("Enter a and b: ");
    a=x.nextInt();
    b=x.nextInt();

    for (int i = a; i < b; i++) {
        k=i;
        number=Integer.toString(k);
        len=number.length();

        while(k>0)
        {
            n=k%10;
            sum= (int) (sum+Math.pow(n,len));
            k=k/10;
        }
        if(sum==i)
            System.out.print(sum+" ");
        sum=0;
    }
*/

// LEAP YEAR
/*
    int y;
    Scanner x=new Scanner(System.in);
        System.out.println("Enter Year: ");
        y=x.nextInt();
        if((1804-y)%4==0){
            System.out.println("Leap Year...");
        }else{
            System.out.println("Not Leap Year...");
        }
*/

// PRIME NUMBERS
/*
    int i=2, a;

    Scanner x=new Scanner(System.in);
    a=x.nextInt();

    for(i=2;i<a;i++)
    {
        if(i%2==0 || i%3==0 || i%5==0 || i%7==0)
        {
            if(i==2 || i==3 || i==5 || i==7)
            {
                System.out.print(i+" ");
            }
            else {
                continue;
            }

        }
        else {
            System.out.print(i+" ");
        }
    }
*/

// LCM OF 2 NUMBERS WITH GCD
/*
    int a,b,gcd=1,min=1,lcm=0;
    System.out.println("Enter 2 Numbers: ");
    Scanner x=new Scanner(System.in);
    a=x.nextInt();
    b=x.nextInt();
    min=a<b?a:b;

    for(int i=1;i<=min;i++){
        if(a%i==0 && b%i==0){
            gcd=i;
        }
    }
    lcm=(a*b)/gcd;
    System.out.println("GCD: "+gcd);
    System.out.println("LCM: "+lcm);
*/

// EVEN ODD NUMBER
/*
        int a=10;
        if(a%2==0){
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number");
        }
*/

// MAX OF 3 NUMBERS
/*
        int a=25,b=75,c=105;

        if(a>b && a>c){
            System.out.println("Max:"+a);
        } else if (b>a && b>c) {
            System.out.println("Max:"+b);
        }else{
            System.out.println("Max:"+c);
        }

        if(a>b){
            if (a>c){
                System.out.println("Max:"+a);
            }
            else{
                System.out.println("Max:"+c);
            }
        }else{
            if(b>c){
                System.out.println("Max:"+b);
            }else {
                System.out.println("Max:"+c);
            }
        }
*/

// ADD TWO BINARY STRINGS
/*
        String s1="011011";
        String s2="1010111";

        int a,b,sum;

        a=Integer.parseInt(s1,2);
        b=Integer.parseInt(s2,2);
        sum=a+b;

        System.out.println(Integer.toBinaryString(sum));

*/

// SWAP TO NUMBERS
/*
        int a=5,b=7,tmp;
        a=a+b;
        b=a-b;
        a=a-b;

        tmp=a;
        a=b;
        b=tmp;
        System.out.println("a:"+a+ "\nb:"+b);

*/
    }

}