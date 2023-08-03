Ques1. Print the pattern
*
**
***
****
Answer:-
package com.apnacollege;

public class Main {
    public static void main(String[] args) {
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.print("****");
        }
     }
//output ---> *
//            **
//            ***
//            ****
-------------------------------------------------------------------------------------------------
Ques2. Make a program that takes the radius of a circle as input,
calculates its radius and area and prints it as output to the user.
Answer:- 
package apnacollege.com;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Circumference of the circle: " + circumference);
        System.out.print("Area of the circle: " + area);
    }
}
// output ---> Enter the radius of the circle: 5
//             Circumference of the circle: 31.41592653589793
//             Area of the circle: 78.53981633974483
------------------------------------------------------------------------------------------------
Ques3. 1 ---> Hello
       2 ---> Nameste
       3 ---> Bonjour
Answer:-
import java.util.*;

public class custom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");

        int button = sc.nextInt();

        if(button==1){
            System.out.println("Hello");
        } else if (button==2) {
            System.out.println("Nameste");
        } else if (button==3) {
            System.out.println("Bonjour");
        }else {
            System.out.println("Invalid");
        }
    }
}
// output ---> Enter the number:2
//             Nameste
//             Enter the number:5
//             Invalid
//             Area of the circle: 78.53981633974483
------------------------------------------------------------------------------------------------
Ques4. Print the sum of First n natural numbers.
// 1+2+3+4+......+n
Answer:-
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");

        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i++) {
            sum = sum + i;
        }
            System.out.println(sum);
    }
}

// output ---> Enter the value of n: 6
//                                   21
------------------------------------------------------------------------------------------------
Ques5. Print the table number given by user.
Answer:-
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");

        int n = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(i * n);
        }
    }
}
// output ---> Enter the value of n:2
// it will print table of 2
