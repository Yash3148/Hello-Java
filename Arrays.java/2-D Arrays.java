import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int column = sc.nextInt();

        int[][] numbers = new int[rows][column];

        //input
        //rows
        for (int i = 0; i < rows; i++) {
            //column
            for (int j = 0; j < column; j++) {
                numbers[i][j] = sc.nextInt();

            }
        }
        // output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
// output --->
3   ----> rows
5   ----> column
1 2 3 4 5     -------|
6 7 8 9 10    -------|  -----> input 
1 4 7 8 9     -------| 
  
1 2 3 4 5     -------|
6 7 8 9 10    -------|  -----> output
1 4 7 8 9     -------|
--------------------------------------------------------------------------------------------------------------
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int column = sc.nextInt();

        int[][] numbers = new int[rows][column];

        //input
        //rows
        for (int i = 0; i < rows; i++) {
            //column
            for (int j = 0; j < column; j++) {
                numbers[i][j] = sc.nextInt();

            }
        }
        int x = sc.nextInt();
        // output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                //compare with x
                if (numbers[i][j] == x) {
                    System.out.println("x found at location(" + i + "," + j + ")");
                }
            }

        }
    }
}
// output 
3     ------> rows
4     ------> column
1 2 3 4 
4 5 6 7
7 8 9 1
1      ------> value of x
x found at location(0,0)
x found at location(2,3)
--------------------------------------------------------------------------------------------------------------
