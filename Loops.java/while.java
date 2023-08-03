import org.w3c.dom.css.Counter;

public class Loops {
    public static void main(String[] args) {
       int i = 0;
       while (i<3){
           System.out.println(i++);
        }
    }
}
// output ---> 0
//             1
//             2
-------------------------------------------------------------------------------------
import org.w3c.dom.css.Counter;

public class Loops {
    public static void main(String[] args) {
       int i = 0;
       while (i<3){
           System.out.println(i);
           i = i + 1; //i++
        }

    }
}
// output ---> 0
//             1
//             2
