import org.w3c.dom.css.Counter;

public class Loops {
    public static void main(String[] args) {
       int i = 0;
       do{
           System.out.println(i);
           i = i + 1;
        }while (i<3);
    }
}
// output ---> 0
//             1
//             2
--------------------------------------------------------------------------------------------------------
import org.w3c.dom.css.Counter;

public class Loops {
    public static void main(String[] args) {
       int i = 12;
       while (i<11){
           System.out.println("Hello YS07");
       }
       do{
           System.out.print("Yoshita");
       }while (i<11);
    }
}
// output ---> Yoshita
// do will print it because System.out.print("Yoshita") is first stage in loop, then it will check condition in while (i<11); then it will stop.
//this is called as false conditiom.
