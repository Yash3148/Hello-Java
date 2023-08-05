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
    public static void main(String args[]) {
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
