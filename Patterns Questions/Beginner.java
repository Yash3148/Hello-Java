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

