package practical_part;

/**
 * Constructor chaining: The process of calling one constructor from another constructor with respect to current object. 
 * Within same class: It can be done using this() keyword for constructors in same class
 * From base class: by using super() keyword to call constructor from the base class.
 * 
 * Why do we need constructor chaining: This process is used when we want to perform multiple tasks in a single constructor 
 * rather than creating a code for each task in a single constructor we create a separate constructor for
 * each task and make their chain which makes the program more readable. 
 * 
 * Rules of constructor chaining : The this() expression should always be the first line of the constructor.
 * There should be at-least be one constructor without the this() keyword.
 * Constructor chaining can be achieved in any order.
 * 
 */

// Constructor Chaining within same class using this() keyword :
public class ConstructorChaining {
    // default constructor will call another constructor using this keyword from same class
    ConstructorChaining() {
        // calls constructor 2
        this(5);
        System.out.println("The Default constructor");
    }
 
    // parameterized constructor 2
    ConstructorChaining(int x) {
        // calls constructor 3
        this(5, 15);
        System.out.println(x);
    }
 
    // parameterized constructor 3
    ConstructorChaining(int x, int y) {
        System.out.println(x * y);
    }
    
    public static void main(String[] args) {
        // invokes default constructor first
        new ConstructorChaining();

        //using super() keyword...
        new Derived("test");
        //o/p: Calling parameterized constructor of base
        //     Calling parameterized constructor of derived
    }
}

//Constructor Chaining within same class using super() keyword :
class Derived extends Base {
    Derived() {
        System.out.println("No-argument constructor " + "of derived");
    }
 
    Derived(String name) {
        super(name);
        System.out.println("Calling parameterized " + "constructor of derived");
    }
}

class Base {
    String name;

    Base() {
        this("");
        System.out.println("No-argument constructor of" + " base class");
    }
 
    Base(String name) {
        this.name = name;
        System.out.println("Calling parameterized constructor" + " of base");
    }
}
