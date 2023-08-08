---------------------------------------- GET Bits -----------------------------------------------
public class Bits {
    public static void main(String[] args) {
        int n = 5; //0101
        int pos = 3;
        int bitMask = 1<<pos;

        if((bitMask & n) == 0){
            System.out.print("Bit was zero");
        }else {
            System.out.print("Bit was one");
        }
    }
}
// output ---> Bit was zero
-------------------------------------------------------------------------------------------------
---------------------------------------- SET Bits -----------------------------------------------
public class Bits {
    public static void main(String[] args) {
        int n = 5; //0101
        int pos = 1;
        int bitMask = 1<<pos;
        int newNumber = bitMask | n;
        System.out.print(newNumber);
    }
}
// ouutput ---> 7
---------------------------------------------------------------------------------------------------
---------------------------------------- CLEAR Bits -----------------------------------------------
public class Bits {
    public static void main(String[] args) {
        int n = 5; //0101
        int pos = 2;
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);

        int newNumber = notBitMask & n;
        System.out.print(newNumber);
    }
}
// output ---> 1
----------------------------------------------------------------------------------------------------
---------------------------------------- UPDATE Bits -----------------------------------------------
import java.util.Scanner;

public class Bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int oper = sc.nextInt();
        // oper=1 : set // oper=0 : clear
        int n = 5; //0101 --> 0111 --> dec 7
        int pos = 1;
        int bitMask = 1<<pos;

        //set oper
        if(oper == 1){
            int newnumber = bitMask | n;
            System.out.print(newnumber);
        }else {
            int newBitMask = ~(bitMask);
            int newnumber = newBitMask & n;
            System.out.print(newnumber);
        }

    }
}
// output ---> Enter the number: 0
//                               5
----------------------------------------------------------------------------------------------------
