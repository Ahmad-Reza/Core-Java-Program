package practical_part;

/**
 * Constructors: Constructors must have the same name as the class within which it is defined while it is not necessary for the method in java. 
 * Constructors do not return any type while method(s) have the return type or void if does not return any value. 
 * Constructors are called only once at the time of Object creation while method(s) can be called any number of time.
 *
 * Constructor(s) of a class must have the same name as the class name in which it resides. 
 * A constructor in Java can not be abstract, final, static and Synchronized. 
 * Access modifiers can be used in constructor declaration to control its access i.e which other class can call the constructor.
 *
 * Need of Constructor: Think of a Box. If we talk about a box class then it will have some class variables (say length, breadth, and height). 
 * But when it comes to creating its object(i.e Box will now exist in the computer’s memory), 
 * then can a box be there with no value defined for its dimensions. The answer is no. So constructors are used to assigning 
 * values to the class variables at the time of object creation, either explicitly done by the programmer or by Java itself (default constructor).
 * 
 * 
 */

public class ConstructorProgram {
    int id;
    String name;
 
    //No-argument constructor
    ConstructorProgram() {
        System.out.println("Constructor called");
    }

    // Parameterized Constructor
    ConstructorProgram(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {

        ConstructorProgram cons = new ConstructorProgram();
 
        // Default constructor provides the default values to the object like 0, null
        System.out.println(cons.name); //null
        System.out.println(cons.id); // 0

        ConstructorProgram cons1 = new ConstructorProgram("adam", 1);
        System.out.println("Name is " + cons1.name + " and Id is" + cons1.id);

        // NOte: There are no “return value” statements in the constructor, 
        // but the constructor returns the current class instance. We can write 'return' inside a constructor.

        // Now the most important topic that comes into play is the strong incorporation of OOPS with constructors known as constructor overloading. 
        
        ConstructOverload geek2 = new ConstructOverload("Shikhar");
 
        // Invoke the constructor with two arguments
        ConstructOverload geek3 = new ConstructOverload("Dharmesh", 26);
 
        // Invoke the constructor with one argument of type 'Long'.
        ConstructOverload geek4 = new ConstructOverload(325614567);
    }
}

class ConstructOverload
{
    // constructor with one argument
    ConstructOverload(String name) {
        System.out.println("Constructor with one " +  "argument - String : " + name);
    }
 
    // constructor with two arguments
    ConstructOverload(String name, int age) {
        System.out.println("Constructor with two arguments : " + " String and Integer : " + name + " "+ age);
    }
 
    // Constructor with one argument but with different type than previous..
    ConstructOverload(long id) {
        System.out.println("Constructor with one argument : " + "Long : " + id);
    }
}
