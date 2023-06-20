package takeUforward;

public class patterns {
    public static void main(String[] args) {

// SPIRAL MATRIX
//1  2  3  4  5
//16 17 18 19 6
//15 24 25 20 7
//14 23 22 21 8
//13 12 11 10 9

/*
        int top = 0, bottom = 4, left = 0, right = 4, count = 1;
        int direction = 1;
        int[][] array = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = 0;
            }
        }
        while (count <= 25) {
            if (direction == 1) {
                // Left to Right
                for (int j = left; j <= right; j++) {
                    array[top][j] = count;
                    count++;
                }
                top++;
                direction++;
            }

            if (direction == 2) {
                // Top to Bottom
                for (int j = top; j <= bottom; j++) {
                    array[j][right] = count;
                    count++;
                }
                right--;
                direction++;
            }

            if(direction==3)
            {
                // Right to Left
                for (int j = right; j >=left ; j--) {
                    array[bottom][j]=count;
                    count++;
                }
                bottom--;
                direction++;
            }
            if(direction==4)
            {
                // Bottom to Top
                for (int j = bottom; j >=top ; j--) {
                    array[j][left]=count;
                    count++;
                }
                left++;
                direction=1;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
*/


//PASCAL TRIANGLE
//    1
//   1 1
//  1 2 1
// 1 3 3 1
//1 4 6 4 1

/*
        for (int line = 1; line <=5 ; line++) {
            for (int space = 5; space > line ; space--) {
                System.out.print(" ");
            }
            int c=1;
            for (int item = 1; item <=line ; item++) {
                System.out.print(c+" ");
                c=c*(line-item)/item;
            }
            System.out.println();
        }
*/


//4444444
//4333334
//4322234
//4321234
//4322234
//4333334
//4444444

/*
        for (int i = 4; i >=1; i--) {
            for (int j = 4; j >=i ; j--) {
                System.out.print(j);
            }
            for (int j = 1; j <i*2-2 ; j++) {
                System.out.print(i);
            }
            for (int j = i; j <=4 ; j++) {
                if(j==1)
                    continue;
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 1; i <=4 ; i++) {
            if(i==1)
                continue;
            for (int j = 4; j >=i ; j--) {
                System.out.print(j);
            }
            for (int j = 1; j <i*2-2 ; j++) {
                System.out.print(i);
            }
            for (int j = i; j <=4 ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
*/


//*****
//*   *
//*   *
//*   *
//*****

/*
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=5 ; j++) {
                if (i==1 || i==5)
                    System.out.print("*");
                else {
                    if (j == 1 || j == 5) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
*/



//*       *
//**     **
//***   ***
//**** ****
//*********
//**** ****
//***   ***
//**     **
//*       *

/*
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 9-(i*2); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                if(i==5 && j==1)
                    continue;
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <=5 ; i++) {
            if(i==1)
                continue;
            for (int j = 5; j >=i ; j--) {
                System.out.print("*");
            }
            for (int j = 1; j <i*2-2; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j >=i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
*/


//*********
//**** ****
//***   ***
//**     **
//*       *
//**     **
//***   ***
//**** ****
//*********

/*
        for (int i = 1; i <=5 ; i++) {
            for (int j = 5; j>=i; j--) {
                System.out.print("*");
            }
            for (int j = 1; j<i*2-2; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j>=i; j--) {
                if(i==1&&j==1)
                    break;
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <=5 ; i++) {
            if(i==1)
                continue;
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            for (int j = ((5-i)*2)-1; j>=1;j--) {
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++) {
                if(i==5&&j==5)
                    break;
                System.out.print("*");
            }
            System.out.println();
        }
 */


//E
//DE
//CDE
//BCDE
//ABCDE

/*
        for (int i = 5; i >=1 ; i--) {
            char a='A';
            a = (char) ((a + i) - 1);
            for (int j = 5; j >=i ; j--) {
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
 */


//   A
//  ABA
// ABCBA
//ABCDCBA

/*
        char a;
        for (int i = 1; i <=4 ; i++) {
            a='A';
            for (int j = i; j <4 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(a);
                a++;
            }
            a--;
            a--;
            for (int j = i; j > 1 ; j--) {
                System.out.print(a);
                a--;
            }
            System.out.println();
        }
*/

        
//A
//BB
//CCC
//DDDD
//EEEEE

/*
        char c='A';
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(c);
            }
            c++;
            System.out.println();
        }
*/


//ABCDE
//ABCD
//ABC
//AB
//A

/*
        char c;
        for (int i = 5; i >=1 ; i--) {
            c='A';
            for (int j = i; j >=1 ; j--) {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
*/


//A
//AB
//ABC
//ABCD
//ABCDE

/*
        char c;
        for (int i = 1; i <=5 ; i++) {
            c='A';
            for (int j = 1; j <=i ; j++) {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
*/


//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15

/*
        int k=1;
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
 */


//1       1
//12     21
//123   321
//1234 4321
//123454321

/*
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <=9-(i*2) ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >0 ; j--) {
                if(j==5) {
                    j=j-1;
                    System.out.print(j);
                }else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
 */

//1
//01
//101
//0101
//10101

/*
        int m,n;
        for (int i = 1; i <=5 ; i++) {
            if(i%2==0){
                m=0;
                n=1;
            }else {
                m=1;
                n=0;
            }
            for (int j = 1; j <=i ; j++) {
              if (j%2==0){
                  System.out.print(n);
              }else {
                  System.out.print(m);
              }
            }
            System.out.println();
        }
 */


//*
//**
//***
//****
//*****
//****
//***
//**
//*

/*
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <=5-i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
*/


//*********
// *******
//  *****
//   ***
//    *
//   ***
//  *****
// *******
//*********

/*
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <=5 ; j++) {
                System.out.print("*");
            }
            for (int j = i; j<5 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i <= 5 ; i++) {
            for (int j = 4; j >= i ; j--) {
                System.out.print(" ");
            }
            for (int j = 2; j <= i ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
*/


//*********
// *******
//  *****
//   ***
//    *

/*
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j<i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= 5 ; j++) {
                System.out.print("*");
            }
            for (int j = i; j <5 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
*/


//    *
//   ***
//  *****
// *******
//*********

/*
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 4 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
*/


//*****     12345
//****      1234
//***       123
//**        12
//*         1

/*
        for (int i = 1; i <=5 ; i++) {
            for (int j = 5; j>=i ; j--) {
                System.out.print(5-j+1);
            }
            System.out.println();
        }
*/


//*         1          1
//**        22         12
//***       333        123
//****      4444       1234
//*****     55555      12345

/*
       for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(i+1);
            }
            System.out.println();
        }
*/

    }
}
