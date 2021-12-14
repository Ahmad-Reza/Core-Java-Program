package practical_part;

/**
 * Interface: Like a class, an interface can have methods and variables, but the methods declared in an interface 
 * are by default abstract (only method signature, no body).  
 * Interfaces specify what a class must do and not how. It is the blueprint of the class.
 * An Interface is about capabilities like a Player may be an interface and any class implementing Player must be 
 * able to (or must implement) move(). So it specifies a set of methods that the class has to implement.
 * If a class implements an interface and does not provide method bodies for all functions specified in the interface, 
 * then the class must be declared abstract. 
 * A Java library example is, Comparator Interface. If a class implements this interface, then it can be used to sort a collection.
 * 
 * 
 * To declare an interface, use interface keyword. It is used to provide total abstraction. That means all the 
 * methods in an interface are declared with an empty body and are public and all fields are public, static and final by default. 
 * A class that implements an interface must implement all the methods declared in the interface. 
 * To implement interface use implements keyword.
 * 
 * Use of interface:
 * It is used to achieve total abstraction.
 * Since java does not support multiple inheritance in case of class, but by using interface it can achieve multiple inheritance.
 * It is also used to achieve loose coupling.
 * Interfaces are used to implement abstraction. So the question arises why use interfaces when we have abstract classes?
 * The reason is, abstract classes may contain non-final variables, whereas variables in interface are final, public and static.
 * 
 */

// A simple interface
// example 1:
interface In1 {
    // public, static and final
    final int a = 10;
  
    // public and abstract 
    void display();
}

//A real-world example:
//Let’s consider the example of vehicles like bicycle, car, bike………, they have common functionalities. 
//So we make an interface and put all these common functionalities. And lets Bicycle, Bike, car ….etc implement all these functionalities in their own class in their own way.

// example 2:
interface Vehicle {
      
    // all are the abstract methods.
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}
  
class Bicycle implements Vehicle {
    int speed, gear;
      
    // to change gear
    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }
      
    // to increase speed
    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }
      
    // to decrease speed
    @Override
    public void applyBrakes(int decrement) {   
        speed = speed - decrement;
    }
      
    public void printStates() {
        System.out.println("speed: " + speed + " gear: " + gear);
    }
}
  
class Bike implements Vehicle {
      
    int speed;
    int gear;
      
    // to change gear
    @Override
    public void changeGear(int newGear){
          
        gear = newGear;
    }
      
    // to increase speed
    @Override
    public void speedUp(int increment){
          
        speed = speed + increment;
    }
      
    // to decrease speed
    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }
      
    public void printStates() {
        System.out.println("speed: " + speed + " gear: " + gear);
    }
      
}

//New features added in interfaces in JDK 8
/**
 * 1. We can now add default implementation for interface methods. 
 *    This default implementation has special use and does not affect the intention behind interfaces.
 * 
 * 2. we can now define static methods in interfaces which can be called independently without an object. 
 *    Note: these methods are not inherited.
 */

//example 3:
interface In2 {

    default void display1(){
        System.out.println("hello");
    }

    static void display2() {
        System.out.println("hello");
    }
}
public class InterfaceProgram implements In1, In2 {
    
    // Implementing the capabilities of interface.
    @Override
    public void display() {
        System.out.println("Geek");        
    }
  
    public static void main(String[] args) {
        InterfaceProgram t = new InterfaceProgram();
        t.display();
        System.out.println(a);
        t.display1();
        In2.display2();

        //example 2
        // creating an inatance of Bicycle 
        // doing some operations 
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);
          
        System.out.println("Bicycle present state :");
        bicycle.printStates();
          
        // creating instance of the bike.
        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);
          
        System.out.println("Bike present state :");
        bike.printStates();
    }
}
