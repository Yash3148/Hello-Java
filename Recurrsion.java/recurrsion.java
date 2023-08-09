// Print numbers from 5 to 1
public class Recursion {
    public static void printNumber(int n){
        if(n ==0){
            return;
        }
        System.out.println(n);
        printNumber(n-1);
    }
    public static void main(String[] args){
        int n =5;
        printNumber(n); // n = 5
    }
}
// output --->
// 5
// 4
// 3
// 2
// 1
----------------------------------------------------------------------------------------------------------------------
// Print numbers from 5 to 1
public class Recursion {
    public static void main(String[] args) {
        int n = 5;
        printNumber(n); // n = 5
    }

    public static void printNumber(int n) {
        if (n == 0) {    // -----> Base
            return;      // -----> Base
        }
        System.out.println(n);  // -----> Print
        printNumber(n - 1);  // -----> Recursion
    }
}
// output --->
// 5
// 4
// 3
// 2
// 1
----------------------------------------------------------------------------------------------------------------------
// Print numbers from 1 to 5
public class Recursion {
    public static void printNumber(int n){
        if(n ==6){
            return;
        }
        System.out.println(n);
        printNumber(n+1);
    }
    public static void main(String[] args){
        int n = 1;
        printNumber(n); // n = 1
    }
}
// output --->
// 1
// 2
// 3
// 4
// 5
----------------------------------------------------------------------------------------------------------------------
// Print the sum of first n natural numbers
public class Recursion {
    public static void printSum(int n, int sum){
        if(n ==0){
            System.out.print(sum);
            return;
        }
        sum += n;
        printSum(n-1,sum);
    }
    public static void main(String[] args){
        printSum(5,0); 
    }
}
// output ---> 15
----------------------------------------------------------------------------------------------------------------------
// Print factorial of a number n
public class Recursion {
    public static void printFactorial(int n, int fact){
        if(n ==0){
            System.out.print(fact);
            return;
        }
        fact *= n;
        printFactorial(n-1,fact);
    }
    public static void main(String[] args){
        printFactorial(5,1);
    }
}
// output ---> 120
----------------------------------------------------------------------------------------------------------------------
//  Print the fibonacci sequence till nth term
public class Recursion {
    public static void printFibonacci(int a, int b, int n){
        if(n ==0){
            return;
        }
        System.out.println(n);
        printFibonacci(b, a+b, n-1);
    }
    public static void main(String[] args){
        printFibonacci(0, 1, 5);
    }
}
// output --->
// 5
// 4
// 3
// 2
// 1
----------------------------------------------------------------------------------------------------------------------
//  Print x^n (with stack height = n)
public class Recursion {
    public static int printPower(int x, int n) {
        if(n==0){    // Base case 1
            return 1;
        }
        if (x==0){   // Base case 2
            return 0;
        }
        int xPowernm1 = printPower(x,n-1);
        int xPown = x * xPowernm1;
        return xPown;
    }
    public static void main(String[] args){
        int x = 2, n = 5;
        int ans = printPower(x,n);
        System.out.print(ans);
    }
}
// output ---> 32
----------------------------------------------------------------------------------------------------------------------
//  Print x^n (with stack height = logn)
public class Recursion {
    public static int printPower(int x, int n) {
    if(n == 0) {
        return 1;
    }
    // if n is even
    if(n % 2 == 0) {
        return printPower(x, n/2) * printPower(x, n/2);
    }
    else { // n is odd
        return x * printPower(x, n/2) * printPower(x, n/2);
    }
}
    public static void main(String[] args) {
        int x = 2, n = 5;
        int output = printPower(x, n);
        System.out.print(output);
    }
}
// output ---> 32
----------------------------------------------------------------------------------------------------------------------
