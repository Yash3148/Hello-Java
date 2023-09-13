import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number:");
        int x = sc.nextInt();

        if (x%2==0){
            System.out.print("Even");
        }else {
            System.out.print("Odd");
        }
    }
}

// Enter the Number:42
// output      ---> Even
// Enter the Number:5
// output      ---> odd
