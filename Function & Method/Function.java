import java.util.*;

public class Function {
    public static void printMyName(String name){
        System.out.print(name);
        return;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter my name:");
        String name = sc.next();
        
        printMyName(name); //call kiya funciton ko

    }
}
// output --->
//            Enter my name:Yoshita
//                          Yoshita
--------------------------------------------------------------------------------------------------------------
import java.util.*;

public class Function {
    public static int calculateSum(int a, int b ){
        int sum = a + b;
        return sum ;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println("Sum of two numbers: "+sum);//call kiya funciton ko

    }
}
// output --->          5
//                      6
// Sum of two numbers: 10
--------------------------------------------------------------------------------------------------------------
import java.util.*;

public class Function {
    public static int calculateMul(int a, int b ){
        int mul = a * b;
        return mul;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int mul = calculateMul(a, b);
        System.out.println("Multiplication of two numbers: "+mul); //call kiya funciton ko
    }
}
// output --->  
//                                 6
//                                 6
// Multiplication of two numbers: 36
--------------------------------------------------------------------------------------------------------------
Above Question can be done as:
import java.util.*;

public class Function {
    public static int calculateMul(int a, int b ){
        return a * b;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Multiplication of two numbers: "+calculateMul(a,b));//call kiya funciton ko
    }
}
--------------------------------------------------------------------------------------------------------------
  // Factorial Numbers //
import java.util.*;

public class Function {
    public static void Factorial(int n) {
        if(n < 0){
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;
        for(int i=n; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        Factorial(n);
    }
}
// output ---> Enter the number: 5
//                               120
--------------------------------------------------------------------------------------------------------------
  

