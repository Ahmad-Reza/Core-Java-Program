package practical_part;

/**
 * Inheritance: Inheritance is an important pillar of OOP(Object-Oriented Programming). 
 * It is the mechanism in java by which one class is allowed to inherit the features(fields and methods) of another class. 
 * 
 * Super Class: The class whose features are inherited is known as superclass(or a base class or a parent class).
 * Sub Class: The class that inherits the other class is known as a subclass(or a derived class, extended class, or child class). 
 * The subclass can add its own fields and methods in addition to the superclass fields and methods.
 * Reusability: Inheritance supports the concept of "reusability", i.e. when we want to create a new class and there is already 
 * a class that includes some of the code that we want, we can derive our new class from the existing class. 
 * By doing this, we are reusing the fields and methods of the existing class. 
 * 
 * The keyword used for inheritance is extends. 
 * 
 */


// base class
class Bicycle {
    // fields
    public int gear;
    public int speed;
 
    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }
 
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
 
    public void speedUp(int increment) {
        speed += increment;
    }
 
    public String toString() {
        return ("No of gears are " + gear + "\n" + "speed of bicycle is " + speed);
    }
}
 
// derived class
class MountainBike extends Bicycle {
 
    // the MountainBike subclass adds one more field
    public int seatHeight;
 
    public MountainBike(int gear, int speed, int startHeight) {
        // invoking base-class(Bicycle) constructor
        super(gear, speed);
        seatHeight = startHeight;
    }
 
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
 
    // overriding toString() method of Bicycle to print more info
    @Override
    public String toString() {
        return (super.toString() + "\nseat height is " + seatHeight);
    }
}

//Multiple inheritence implementation through interface.
interface one {
    public void print_geek();
}
 
interface two {
    public void print_for();
}
 
interface three extends one, two {
    public void print_geek();
}

class child implements three {

    @Override
    public void print_geek() {
        System.out.println("Geeks");
    }
 
    public void print_for() { System.out.println("for"); }

}

public class InheritenceProgram {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.toString());

        //In the above program, when an object of MountainBike class is created, a copy of all methods and fields of the 
        //superclass acquire memory in this object. That is why by using the object of the subclass we can also access the 
        //members of a superclass. during inheritance only the object of the subclass is created, not the superclass.

        //1. Single Inheritance: In single inheritance, subclasses inherit the features of one superclass. 
        // like class A -> class B
        B b = new B();
        b.print_geek();
        b.print_for();
        b.print_geek();

        //2. Multilevel Inheritance: A derived class will be inheriting a base class and as well as 
        //the derived class also act as the base class to other class. like Class One -> Two -> Three 
        Three g = new Three();
        g.print_geek();
        g.print_for();
        g.print_geek();

        //3. Hierarchical Inheritance: One class serves as a superclass (base class) for more than one subclass.
        //4. Multiple Inheritance (Through Interfaces): One class can have more than one superclass and inherit features from all parent classes.
        //Java does not support multiple inheritances with classes. We can achieve multiple inheritances only through Interfaces.
        child c = new child();
        c.print_geek();
        c.print_for();
        c.print_geek();

        //5. Hybrid Inheritance: It is a mix of two or more of the above types of inheritance. Since java doesn’t support 
        //multiple inheritances with classes, hybrid inheritance is also not possible with classes. we can achieve 
        //hybrid inheritance only through Interfaces.

        //Java IS-A type of Relationship: 
        //IS-A is a way of saying: This object is a type of that object. Let us see how the extends keyword is used to achieve inheritance.
        SolarSystem s = new SolarSystem();
        Earth e = new Earth();
        Mars m = new Mars();
 
        System.out.println(s instanceof SolarSystem); //true
        System.out.println(e instanceof Earth); //true
        System.out.println(m instanceof SolarSystem); //true

    }
}

class SolarSystem { }
class Earth extends SolarSystem { }
class Mars extends SolarSystem { }
class Moon extends Earth { }

class A {
    public void print_geek() {
        System.out.println("Geeks");
    }
}
 
class B extends A {
    public void print_for() { System.out.println("for"); }
}

class One {
    public void print_geek()
    {
        System.out.println("Geeks");
    }
}
 
class Two extends One {
    public void print_for() { System.out.println("for"); }
}
 
class Three extends Two {
    public void print_geek()
    {
        System.out.println("Geeks");
    }
}

//Important facts about inheritance: 
//Default superclass: Except Object class, which has no superclass, every class has one and only one direct superclass(single inheritance). 
//In the absence of any other explicit superclass, every class is implicitly a subclass of the Object class.

//Superclass can only be one: A superclass can have any number of subclasses. But a subclass can have only one superclass. 
//This is because Java does not support multiple inheritances with classes. Although with interfaces, multiple inheritances are supported by java.

//Inheriting Constructors: A subclass inherits all the members (fields, methods, and nested classes) from its superclass. 
//Constructors are not members, so they are not inherited by subclasses, but the constructor of the superclass can be invoked from the subclass.

//Private member inheritance: A subclass does not inherit the private members of its parent class. However, 
//if the superclass has public or protected methods(like getters and setters) for accessing its private fields, these can also be used by the subclass.
