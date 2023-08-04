Ques1. Print the pattern.
*        *
**      **
***    ***
****  ****
**********              {Butterfly Pattern}
**********
****  ****
***    ***
**      **
*        *
Answer:-
public class Patterns {
    public static void main(String[] args) {
        int n = 5;

        //First half - upper half
        for (int i = 1; i <= n; i++) {
            //1st part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            //2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for (int i = n; i >= 1; i--) {
            //1st part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            //2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
------------------------------------------------------------------------------------------------------------------
Ques2. Print the Pattern.
    *****
   *****
  *****
 *****
*****
Answer:-
public class Patterns {
    public static void main(String[] args) {
        int n = 5;

        //First half - upper half
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
------------------------------------------------------------------------------------------------------------------
Ques3. Print the pattern.
    1 
   2 2  
  3 3 3                        {Pyramid Pattern}
 4 4 4 4 
5 5 5 5 5 
Answer:- 
public class Patterns {
    public static void main(String[] args) {
        int n = 5;

        //First half - upper half
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //number
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
------------------------------------------------------------------------------------------------------------------
Ques4. Print the pattern.
    1
   212
  32123           {Palindromic Pattern}
 4321234
543212345
Answer:-
public class Patterns {
    public static void main(String[] args) {
        int n = 5;

        //First half - upper half
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //2nd half numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            //2nd half numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
------------------------------------------------------------------------------------------------------------------
Ques5. Print the pattern.
   *
  ***
 *****
*******
*******
 *****
  ***
   *
Answer:- 
public class Patterns {
    public static void main(String[] args) {
        int n = 4;

        //First half - upper half
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower
        //First half - upper half
        for (int i = n; i >= 1; i--) {
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
------------------------------------------------------------------------------------------------------------------
