import org.w3c.dom.css.Counter;

public class Loops {
    public static void main(String[] args) {
        for (int counter = 0; counter < 3; counter = counter + 1) {
            System.out.println("Hello YS07");
        }
    }
}

//output ---> Hello YS07
//            Hello YS07
//            Hello YS07
---------------------------------------------------------------------------------------
import org.w3c.dom.css.Counter;

public class Loops {
    public static void main(String[] args) {
        for (int counter = 0; counter < 11; counter++ ) {
            //counter++ ---> counter = counter + 1
            System.out.println(counter);
        }
    }
}
// output ---> 0
//             1
//             2
//             3
//             4
//             5
//             6
//             7
//             8
//             9
//             10
---------------------------------------------------------------------------------------
import org.w3c.dom.css.Counter;

public class Loops {
    public static void main(String[] args) {
        for (int counter = 0; counter < 11; counter++ ) {
            //counter++ ---> counter = counter + 1
            System.out.print(counter);
        }
    }
}
//output  ---> 012345678910
---------------------------------------------------------------------------------------
import org.w3c.dom.css.Counter;

public class Loops {
    public static void main(String[] args) {
        for (int counter = 0; counter < 11; counter++ ) {
            //counter++ ---> counter = counter + 1
            System.out.print(counter+" ");
        }
    }
}
// output ---> 0 1 2 3 4 5 6 7 8 9 10 
---------------------------------------------------------------------------------------
import org.w3c.dom.css.Counter;

public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++){
            System.out.println(i);
        }

    }
}
// output ---> 0
//             1
//             2
---------------------------------------------------------------------------------------
    

