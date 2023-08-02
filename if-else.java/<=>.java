import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a==b){
            System.out.print("Equal");
        }else{
            if (a>b) {
                System.out.print("a is greator than b");
            }else{
                System.out.print("b is greator than a");
            }
        }
    }
}

// 8
// 5
// output ---> a is greator than b
