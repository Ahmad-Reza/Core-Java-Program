package practical_part;

/**
 * Data Abstraction: Data Abstraction is the property by virtue of which only the essential details are displayed to the user. 
 * The trivial or the non-essentials units are not displayed to the user. Ex: A car is viewed as a car rather than its individual components.
 * Data Abstraction may also be defined as the process of identifying only the required characteristics of an object 
 * ignoring the irrelevant details. The properties and behaviours of an object differentiate it from other objects of 
 * similar type and also help in classifying/grouping the objects.
 * 
 * Consider a real-life example of a man driving a car. The man only knows that pressing the accelerators will increase 
 * the speed of a car or applying brakes will stop the car, but he does not know about how on pressing the accelerator 
 * the speed is actually increasing, he does not know about the inner mechanism of the car or the implementation of 
 * the accelerator, brakes, etc in the car. This is what abstraction is. 
 * In java, abstraction is achieved by interfaces and abstract classes. We can achieve 100% abstraction using interfaces.
 * 
 * 
 * Abstract classes and Abstract methods :
 * An abstract class is a class that is declared with an abstract keyword.
 * An abstract method is a method that is declared without implementation.
 * An abstract class may or may not have all abstract methods. Some of them can be concrete methods A method defined 
 * abstract must always be redefined in the subclass, thus making overriding compulsory OR either make the subclass itself abstract.
 * Any class that contains one or more abstract methods must also be declared with an abstract keyword.
 * There can be no object of an abstract class. That is, an abstract class can not be directly instantiated with the new operator.
 * An abstract class can have parameterized constructors and the default constructor is always present in an abstract class.
 * 
 * 
 */

abstract class Shape {
    String color;
  
    // these are abstract methods
    abstract double area();
    public abstract String toString();
  
    // abstract class can have the constructor
    public Shape(String color)
    {
        System.out.println("Shape constructor called");
        this.color = color;
    }
  
    // this is a concrete method
    public String getColor() { return color; }
}

class Circle extends Shape {
    double radius;
  
    public Circle(String color, double radius) {
       // calling Shape constructor
        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }
  
    @Override 
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }
  
    @Override 
    public String toString() {
        return "Circle color is " + super.getColor() + "and area is : " + area();
    }
}
class Rectangle extends Shape {
    double length;
    double width;
  
    public Rectangle(String color, double length, double width) {
        // calling Shape constructor
        super(color);
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }
  
    @Override
    double area() { return length * width; }
  
    @Override 
    public String toString() {
        return "Rectangle color is " + super.getColor() + "and area is : " + area();
    }
}

public class AbstractionProgram {
    public static void main(String[] args) {
        Shape s1 = new Circle("Red", 2.2);
        Shape s2 = new Rectangle("Yellow", 2, 4);
  
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
    
}


//Encapsulation vs Data Abstraction
// Encapsulation is data hiding(information hiding) while Abstraction is detailed hiding(implementation hiding).
// While encapsulation groups together data and methods that act upon the data, data abstraction deal with exposing 
// the interface to the user and hiding the details of implementation.

// Advantages of Abstraction
// It reduces the complexity of viewing the things.
// Avoids code duplication and increases reusability.
// Helps to increase the security of an application or program as only important details are provided to the user.