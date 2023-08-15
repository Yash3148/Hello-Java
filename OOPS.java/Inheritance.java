class Shape{
    String color;

}
class Triangle extends Shape{

}
public class OOPS {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "Blue";
        System.out.print(t1.color);
    }
}
// output ----> Blue
-----------------------------------------------------------------------------------------------------------
----------------------------- Single Level Inheritance ----------------------------------------------------
class Shape {
    public void area() {
        System.out.println("Display error");                                       ------> Base Class
    }
}

class Triangle extends Shape {
    public void area(int l, int b) {
        System.out.println("This is the area of a triangle:"+ +1/2*l*b );          ------> Derived Class
    }
}

public class OOPS {
    public static void main(String[] args) {
        Shape shape = new Triangle();
        shape.area();
    }
}
// output -----> Display error
-----------------------------------------------------------------------------------------------------------
----------------------------- multi Level Inheritance -----------------------------------------------------
class Shape {
    public void area() {
        System.out.println("Display error");                                    ------> Base Class
    }
}

class Triangle extends Shape {
    public void area(int l, int b) {
        System.out.println("This is the area of a triangle:"+ +1/2*l*b );    --------> Derived Class
    }
}

class Equilateral extends Triangle {
    public void area(int l, int b) {
        System.out.println("This is the area of a triangle:"+ +1/2*l*b );    --------> Sub Derived Class of Triangle
    }
}


public class OOPS {
    public static void main(String[] args) {
        Shape shape = new Triangle();
        shape.area(); 
    }
}
// output -----> Display error
-----------------------------------------------------------------------------------------------------------
----------------------------- Hierarchical Inheritance ----------------------------------------------------
class Shape {
    public void area() {
        System.out.println("Display error");                                -------> Base Class
}

class Triangle extends Shape {
    public void area(int l, int b) {
        System.out.println("This is the area of a triangle:"+ +1/2*l*b );  -----> Derived Class
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);                                  -----> Derrived Class
    }
}


public class OOPS {
    public static void main(String[] args) {
        Shape shape = new Triangle();
        shape.area(); 
    }
}
// output -----> Display error
-----------------------------------------------------------------------------------------------------------
