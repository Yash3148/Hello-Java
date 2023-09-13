import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the correct age:");
        int age = sc.nextInt();

        if (age>18){
            System.out.print("Adult");
        }else {
            System.out.print("Not Adult");
        }
    }
}
//             Enter the correct age:21
// output ---> Adult
//             Enter the correct age:11
//             Not Adult           
