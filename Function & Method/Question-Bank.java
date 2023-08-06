Ques1. Enter 3 numbers from the user & make a function to print their average.
Answer:-
import java.util.*;

public class Function {
    public static float averageSum(float a, float b, float c){
        float average = (a + b + c)/3;
        return average;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a: ");
        float a = sc.nextInt();
        System.out.print("Enter the number b: ");
        float b = sc.nextInt();
        System.out.print("Enter the number c: ");
        float c = sc.nextInt();

        float average= averageSum(a, b, c);
        System.out.println("Average of three numbers: "+average);
    }
}
// Enter the number a: 6
// Enter the number b: 5
// Enter the number c: 8
// Average of three numbers: 6.3333335
------------------------------------------------------------------------------------------------------------------------
Ques2. Write a function to print the sum of all odd numbers from 1 to n.
Answer:- 
import java.util.Scanner;
public class Function {
    public static int calculateSumOfOddNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        
        int sum = calculateSumOfOddNumbers(n);
        System.out.println("The sum of odd numbers from 1 to " + n + " is: " + sum);
        }
    }
// output --->
// Enter the value of n: 2
// The sum of odd numbers from 1 to 2 is: 1
------------------------------------------------------------------------------------------------------------------------
Ques3. Write a function that takes in the radius as input and returns the circumference of a circle.
Answer:- 
import java.util.*;

public class Function {
    public static int circumferenceOfaCircle(int radius){
        int circumference = 2 * Math.PI * radius;
        return circumference;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number radius: ");
        int radius = sc.nextInt();

        int circumference= circumferenceOfaCircle(int radius);
        System.out.println("Circumference of a circle: "+circumference);
    }
}
// output --->
// Enter the number radius: 5
// Circumference of a circle: 31.41592653589793
------------------------------------------------------------------------------------------------------------------------
Ques4. Write an infinite loop using do while condition.
Answer:-
public class Function {
    public static void main(String[] args) {
        do {
            // Code to be executed in the loop
            System.out.println("This is an infinite loop!");
        } while (true);
    }
}
------------------------------------------------------------------------------------------------------------------------
Ques5. Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
Answer:
import java.util.*;

public class Function {
    public static boolean checkVotingEligibility(int age) {
        return age > 18;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age  of person: ");
        int age = sc.nextInt();
        boolean isEligible = checkVotingEligibility(age);

        if (isEligible) {
            System.out.println("The person is eligible to vote.");
        } else {
            System.out.println("The person is not eligible to vote.");
        }
    }
}
// output --->
// Enter the age  of person: 21
// The person is eligible to vote.
------------------------------------------------------------------------------------------------------------------------
Ques6.Write a function which takes in 2 numbers and returns the greater of those two.
Answer:-
import java.util.Scanner;

public class Function {

    public static int findGreaterNumber(int num1, int num2) {
        return Math.max(num1, num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the value of num2: ");
        int num2 = sc.nextInt();
        
        int result = findGreaterNumber(num1, num2);
        System.out.println("The greater number is: " + result);
    }
}
// output --->
// Enter the value of num1: 5
// Enter the value of num2: 8
// The greater number is: 8
------------------------------------------------------------------------------------------------------------------------
Ques7. Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 21 ..... 
In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
Answer:-
import java.util.Scanner;

public class Function {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci series of " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
// output --->
// Enter the number of terms in the Fibonacci series: 7
// Fibonacci series of 7 terms:
// 0 1 1 2 3 5 8
------------------------------------------------------------------------------------------------------------------------
Ques8. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
Answer:- 
import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        char choice;
        do {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Count of positive numbers: " + positiveCount);
        System.out.println("Count of negative numbers: " + negativeCount);
        System.out.println("Count of zeros: " + zeroCount);
    }
}
// output --->
// Enter a number: 1
// Do you want to enter another number? (y/n): y
// Enter a number: 0
// Do you want to enter another number? (y/n): y
// Enter a number: -1
// Do you want to enter another number? (y/n): n
// Count of positive numbers: 1
// Count of negative numbers: 1
// Count of zeros: 1
------------------------------------------------------------------------------------------------------------------------
Ques9. Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n.
Answer:-
import java.util.Scanner;

public class Function {

    public static int calculatePower(int x, int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= x;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        
        int result = calculatePower(x, n);
        System.out.println(x + " raised to the power of " + n + " is: " + result);
    }
}
// output --->
// Enter the value of x: 2
// Enter the value of n: 5
// 2 raised to the power of 5 is: 32
------------------------------------------------------------------------------------------------------------------------
Ques10. Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
Answer:-
import java.util.Scanner;
public class Function {
    public static int calculateGCD(int num1, int num2) {
        // Ensure num1 is greater than or equal to num2
        if (num2 > num1) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        while (num2 != 0) {
            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }
        return num1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the value of num2: ");
        int num2 = sc.nextInt();

        int gcd = calculateGCD(num1, num2);
        System.out.println("The Greatest Common Divisor (GCD) of " + num1 + " and " + num2 + " is: " + gcd);
    }
}
// Enter the value of num1: 4
// Enter the value of num2: 2
// The Greatest Common Divisor (GCD) of 4 and 2 is: 2
------------------------------------------------------------------------------------------------------------------------
