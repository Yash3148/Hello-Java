abstract class Animal {
    public void walk(){

    }
}
class Horse extends Animal{
    public void walk(){
        System.out.println("Walks on four legs");
    }
}
class Chicken extends Animal{
    public void walk() {
        System.out.println("Walks on two legs");
    }
}

public class OOPS{
    public static void main(String[] args){
        Horse horse = new Horse();
        horse.walk();
    }
}
// output ----> Walks on four legs
-------------------------------------------------------------------------------------------------------------
abstract class Animal {
    public void walk(){

    }
}
class Horse extends Animal{
    public void walk(){
        System.out.println("Walks on four legs");
    }
}
class Chicken extends Animal{
    public void walk() {
        System.out.println("Walks on two legs");
    }
}

public class OOPS{
    public static void main(String[] args){
        Horse horse = new Horse();
        horse.walk();
        Animal animal = new Animal();
        animal.walk();
    }
}
// output ----> Animal is abstract; cannot be instantiated {ERROR}
-------------------------------------------------------------------------------------------------------------
abstract class Animal {
    abstract void walk();

    Animal() {
        System.out.println("You are creating a new animal");
    }

    public void eat() {
        System.out.println("Animal eats");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("Created a Horse");
    }

    // @Override
    public void walk() {
        System.out.println("Walks on four legs");
    }
}

class Chicken extends Animal {
    // @Override
    public void walk() {
        System.out.println("Walks on two legs");
    }
}

public class OOPS {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();

        Chicken chicken = new Chicken();
        chicken.walk();
        chicken.eat();
    }
}
// output ----->
You are creating a new animal
Created a Horse
Walks on four legs
Animal eats
You are creating a new animal
Walks on two legs
Animal eats
-------------------------------------------------------------------------------------------------------------
------------------------------------ Interface --------------------------------------------------------------
interface Animal{
    public void walk();
}
class Horse implements Animal{
     public void walk(){
         System.out.println("Walks on 4 legs");
    }
}
public class OOPS {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        
    }
}
// output ---> Walks on 4 legs
-------------------------------------------------------------------------------------------------------------
