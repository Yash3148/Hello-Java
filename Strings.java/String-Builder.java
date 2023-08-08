public class Strings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Yoshita");
        System.out.println(sb);
    }
}
// output ----> Yoshita
----------------------------------------------------------------------------------------------------------
public class Strings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Yoshita");
        System.out.println(sb);
        // char at index 0
        System.out.println(sb.charAt(0));
    }
}
// output ----> Yoshita
//              Y
----------------------------------------------------------------------------------------------------------
public class Strings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Yoshita");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index
        sb.setCharAt(0, 'y');
        System.out.print(sb);
    }
}
// output ----> Yoshita
//              Y
//              yoshita
----------------------------------------------------------------------------------------------------------
public class Strings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Yoshita");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index
        sb.setCharAt(0, 'y');
        System.out.println(sb);

        // insert a char
        sb.insert(7,'7');
        System.out.print(sb);
    }
}
// output ----> Yoshita
//              Y
//              yoshita
//              yoshita7
----------------------------------------------------------------------------------------------------------
public class Strings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Yoshita");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index
        sb.setCharAt(0, 'y');
        System.out.println(sb);

        // insert a char
        sb.insert(7,'7');
        System.out.println(sb);

        // delete a char
        sb.delete(7,8);
        System.out.print(sb);
    }
}
// output ----> Yoshita
//              Y
//              yoshita
//              yoshita7
//              yoshita
----------------------------------------------------------------------------------------------------------
public class Strings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("H");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        sb.append("!");
        sb.append("!");
        System.out.print(sb);
    }
}
// output ----> Hello!!
----------------------------------------------------------------------------------------------------------
public class Strings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("H");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        sb.append("!");
        sb.append("!");
        System.out.print(sb.length());
    }
}
// output ----> 7
----------------------------------------------------------------------------------------------------------
public class Strings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Yoshita");

        for(int i =0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1-i;  //5-1-0 => 4

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.print(sb);
    }
}
// output ---> atihsoY
----------------------------------------------------------------------------------------------------------
