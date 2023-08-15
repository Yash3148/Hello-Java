class Pen{
    String color;
    String type;

    public void write(){
        System.out.print("writing something");
    }
}
public class OOPS {
    public static void  main(String[] args){
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen1.write();
    }
}
// output ---> writing something
------------------------------------------------------------------------------------------------------------
class Pen{
    String color;
    String type;

    public void write(){
        System.out.print(this.color);
    }
}
public class OOPS {
    public static void  main(String[] args){
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen1.write();
    }
}
// output ---> blue
------------------------------------------------------------------------------------------------------------
class Pen{
    String color;
    String type;

    public void printColor(){
        System.out.println(this.color);
    }
}
public class OOPS {
    public static void  main(String[] args){
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "ball-point";

        pen1.printColor();
        pen2.printColor();
    }
}
// output ---> Blue
//        ---> Black
------------------------------------------------------------------------------------------------------------
class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.print(this.age);
    }
}
public class OOPS {
    public static void  main(String[] args){
        Student s1 = new Student();
        s1.name = "Yash";
        s1.age = 21;

        Student s2 = new Student();
        s2.name = "Yoshita";
        s2.age = 21;

        s1.printInfo();
        s2.printInfo();
    }
}
// output ---> Yash
//        ---> 21
//        ---> Yoshita
//        ---> 21
------------------------------------------------------------------------------------------------------------
class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.print(this.age);
    }
    Student(){
        System.out.println("Constructor Called");
}
}
public class OOPS {
    public static void  main(String[] args){

        Student s1 = new Student();
        s1.name = "Yoshita";
        s1.age = 21;

        s1.printInfo();
    }
}
// output ---> Constructor Called
//        ---> Yoshita
//        ---> 21
------------------------------------------------------------------------------------------------------------
class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.print(this.age);
    }
    Student(String name, int age){                 ------------>> parameterized constructors 
        this.name = name;
        this.age = age;
    }

}
public class OOPS {
    public static void  main(String[] args){
        Student s1 = new Student("Yoshita", 21);
        s1.printInfo();
    }
}
// output ---> Yoshita
//        ---> 21
------------------------------------------------------------------------------------------------------------
class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.print(this.age);
    }
    Student(Student s2){
        this.name = s2.name ;
        this.age = s2.age;
    }
    Student(){

    }

}
public class OOPS {
    public static void  main(String[] args){                 ------------>> copy constructor.
        Student s1 = new Student();
        s1.name = "Yoshita";
        s1.age = 21;
        Student s2 = new Student(s1);
        s2.printInfo();
    }
}

// output ---> Yoshita
//        ---> 21
------------------------------------------------------------------------------------------------------------ 
