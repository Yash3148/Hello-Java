Ques1. Print the pattern.
       *****
       *****
       *****                  {Solid Rectangle}
       *****
  Answer:-
  public class Patterns {
    public static void main(String[]args) {
        int n = 4;
        int m = 5;

        //outer loop
        for (int i=1; i<=n; i++) {
            //inner loop
            for (int j=1; j<=m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// output ---> 
// *****
// *****
// *****
// *****
// This Loop is known as nested loop. 
---------------------------------------------------------------------------------------------------------
Ques2. Print the pattern.
 *****
 *   *
 *   *          {Hallow Rectangle}
 *****
Answer:-
public class Patterns {
    public static void main(String[]args) {
        int n = 4;
        int m = 5;

        //outer loop
        for (int i=1; i<=n; i++) {
            //inner loop
            for (int j=1; j<=m; j++) {
                //cell --> (i,j)
                if (i == 1 || j == 1 || i == n || j == m) {
                     System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
// output ---> 
// *****
// *   *
// *   *
// *****
-----------------------------------------------------------------------------------------------------------------
Ques3. Print the pattern.
*
**
***      {Half Pyramid}
****  
Answers:-
public class Patterns {
    public static void main(String[]args) {
        int n = 4;

        //outer loop
        for (int i=1; i<=n; i++) {
            //inner loop
            for (int j=1; j<=i; j++ ) {
                System.out.print("*");
                }
            System.out.println();
            }
        }
    }
// output ---> 
// *
// **
// ***      
// ****
-----------------------------------------------------------------------------------------------------------------------
Ques4. Print the pattern.
****
***
**      {Inverted Half Pyramid}
*
Answer:-
public class Patterns {
    public static void main(String[]args) {
        int n = 4;

        //outer loop
        for (int i=n; i>=1; i--) {
            //inner loop
            for (int j=1; j<=i; j++ ) {
                System.out.print("*");
                }
            System.out.println();
            }
        }
    }
// output --->
// ****
// ***
// **     
// *
-------------------------------------------------------------------------------------------------------------------------
Ques5. Print the pattern.
   *
  **
 ***     {Inverted Half Pyramid}
****
Answer:-
public class Patterns {
    public static void main(String[]args) {
        int n = 4;

        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// output --->
//    *
//   **
//  ***    
// ****
-------------------------------------------------------------------------------------------------------------------------
Ques6. Print the pattern.
1
12
123
1234
12345
Answer:- 
public class Patterns {
    public static void main(String[]args) {
        int n = 5;

        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
// output --->
// 1
// 12
// 123
// 1234
// 12345
-------------------------------------------------------------------------------------------------------------------------
Ques7. Print the pattern.
12345
1234
123
12
1
Answer:-
public class Patterns {
    public static void main(String[]args) {
        int n = 5;

        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
// output ---> 
//12345
//1234
//123
//12
//1
-------------------------------------------------------------------------------------------------------------------------
Ques8. Print the pattern.
1
2 3
4 5 6               Floyd's Triangle
7 8 9 10
11 12 13 14 15
Answer:- 
public class Patterns {
    public static void main(String[]args) {
        int n = 5;
        int number = 1;

        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
// output --->
// 1
// 2 3
// 4 5 6
// 7 8 9 10
//11 12 13 14 15
-------------------------------------------------------------------------------------------------------------------------
Ques9. Print the pattern.
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
Answer:-
public class Patterns {
    public static void main(String[] args) {
        int n = 5;

        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                int sum = i+j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
// output --->
// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
//1 0 1 0 1           
-------------------------------------------------------------------------------------------------------------------------
