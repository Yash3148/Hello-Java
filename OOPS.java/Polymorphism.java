class Student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Yoshita";
        s1.age = 21;

        s1.printInfo(s1.name); // Passing the age field to the appropriate method
    }
}
// output -----> Yoshita
-----------------------------------------------------------------------------------------------------------
class Student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Yoshita";
        s1.age = 21;

        s1.printInfo(s1.age); // Passing the age field to the appropriate method
    }
}
// output -----> 21
-----------------------------------------------------------------------------------------------------------
class Student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Yoshita";
        s1.age = 21;

        s1.printInfo(s1.name, s1.age); // Passing the age field to the appropriate method
    }
}
// output -----> Yoshita 21
-----------------------------------------------------------------------------------------------------------
  
