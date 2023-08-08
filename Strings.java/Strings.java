public class Strings {
    public static void main( String[] args){
        String name = "Yoshita";
        String FullName = "YS07";
        String sentence = "My name is YS07";
        System.out.println(name);
        System.out.println(FullName);
        System.out.print(sentence);
    }
}
// output --->
//            Yoshita
//            YS07
//            My name is YS07
--------------------------------------------------------------------------------------------------------------------
import java.util.Scanner;

public class Strings {
    public static void main( String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.print(name);
    }
}
// output --->
//            Enter the name: Yoshita
//            Yoshita
--------------------------------------------------------------------------------------------------------------------
public class Strings {
    public static void main( String[] args) {
                                                                      // concatenation
        String Firstname = "Yoshita";
        String Lastname = "YS07";
        String Fullname = Firstname +" "+ Lastname;
        System.out.println(Fullname);
    }
}
// output ---->
//            Yoshita YS07
--------------------------------------------------------------------------------------------------------------------
public class Strings {
    public static void main( String[] args) {
       // concatenation
        String Firstname = "Yoshita";
        String Lastname = "YS07";
        String Fullname = Firstname +" "+ Lastname;
        System.out.print(Fullname.length());
    }
}
// output ---> 12
--------------------------------------------------------------------------------------------------------------------
public class Strings {
    public static void main( String[] args) {
       // concatenation
        String Firstname = "Yoshita";
        String Lastname = "YS07";
        String Fullname = Firstname +" "+ Lastname;
        System.out.println(Fullname.length());
        //charAt
        for(int i =0; i < Fullname.length(); i++){
            System.out.println(Fullname.charAt(i));
        }
    }
}
// output --->
12
Y
o
s
h
i
t
a
 
Y
S
0
7
--------------------------------------------------------------------------------------------------------------------
public class Strings {
    public static void main( String[] args) {
       // compare
        String name1 = "Yoshita";
        String name2 = "YS07";

        //1 s1 > s2; +ve value
        //2 s1 == s2; 0
        //3 s1 < s2; -ve value
        if(name1.compareTo(name2) == 0){
            System.out.println("Strings are equal");
        }else{
            System.out.print("Strings are not equal");
        }
    }
}
// output ---> Strings are not equal
--------------------------------------------------------------------------------------------------------------------
public class Strings {
    public static void main( String[] args) {
       // compare
        String name1 = "hello";
        String name2 = "wello";

        //1 s1 > s2; +ve value
        //2 s1 == s2; 0
        //3 s1 < s2; -ve value

        //hello wello
        if(name1.compareTo(name2) == 0){
            System.out.println("Strings are equal");
        }else{
            System.out.print("Strings are not equal");
        }
    }
}
// output ---> Strings are not equal
--------------------------------------------------------------------------------------------------------------------
public class Strings {
    public static void main( String[] args) {
        String sentence = "My name is Tony";
       //substring(beg index, end index)
        String name = sentence.substring(11,sentence.length());
        System.out.print(name);
    }
}
// output ---> Tony
--------------------------------------------------------------------------------------------------------------------
public class Strings {
    public static void main( String[] args) {
        String sentence = "YoshitaYs07";
       //substring(beg index, end index)
        String name = sentence.substring(0,7);
        System.out.print(name);
    }
}
// output ---> Yoshita
--------------------------------------------------------------------------------------------------------------------
public class Strings {
    public static void main( String[] args) {
        String sentence = "YoshitaYs07";
       //substring(beg index, end index)
        String name = sentence.substring(7);
        System.out.print(name);
    }
}
// output ---> YS07
--------------------------------------------------------------------------------------------------------------------
  
