public class Arrays {
    public static void main(String[] args){
        int [] marks = new int[3];
        marks[0] = 97; //physics
        marks[1] = 95; //maths
        marks[2] = 94; //chemistry
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.print(marks[2]);
    }
}
// output ---> 97
//             95
//             94
------------------------------------------------------------------------------------------------------------
public class Arrays {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 97; //physics
        marks[1] = 95; //maths
        marks[2] = 94; //chemistry

        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }
    }
}
------------------------------------------------------------------------------------------------------------
public class Arrays {
    public static void main(String[] args) {
        int[] marks = {97, 98, 95};
        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }
    }
}
------------------------------------------------------------------------------------------------------------
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int size = sc.nextInt();
        int [] numbers = new int[size];
        for (int i = 0; i<size; i++){
            System.out.print(numbers[i]+ " ");
       }
    }
}
// output ---> Enter the number: 5
//                               0 0 0 0 0 
------------------------------------------------------------------------------------------------------------
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int size = sc.nextInt();
        int [] numbers = new int[size];

        // input
        for (int i = 0; i<size; i++){
            System.out.print("Enter the values: ");
            numbers[i] = sc.nextInt();
        }

        //output
        for (int i = 0; i<size; i++){
            System.out.print(numbers[i]+ " ");
       }
    }
}
// output ---> 
// Enter the number: 5
// Enter the values: 2
// Enter the values: 2
// Enter the values: 2
// Enter the values: 2
// Enter the values: 2
//                   2 2 2 2 2 
------------------------------------------------------------------------------------------------------------
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int size = sc.nextInt();
        int [] numbers = new int[size];

        // input
        for (int i = 0; i<size; i++){
            System.out.print("Enter the values: ");
            numbers[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        //output
        for (int i = 0; i<numbers.length; i++){
            if (numbers[i] == x){
                System.out.println("x found at index :" + i);

            }
       }
    }
}
// output --->
// Enter the number: 5
// Enter the values: 2
// Enter the values: 4
// Enter the values: 6               {Linear  Search}
// Enter the values: 7
// Enter the values: 8
//                   6
// x found at index :2
------------------------------------------------------------------------------------------------------------
import java.util.*;

public class Arrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String names[] = new String[size];


        //input
        for(int i=0; i<size; i++) {
            names[i] = sc.next();
        }

        //output
        for(int i=0; i<names.length; i++) {
            System.out.println("name " + (i+1) +" is : " + names[i]);
        }

    }
}
// output ---> 
// 2
// 1
// 2
// name 1 is : 1
// name 2 is : 2
------------------------------------------------------------------------------------------------------------
