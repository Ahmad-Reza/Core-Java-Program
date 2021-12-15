package practical_part;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * A functional interface is an interface that contains only one abstract method. 
 * They can have only one functionality to exhibit. From Java 8 onwards, lambda expressions can be used to represent 
 * the instance of a functional interface. A functional interface can have any number of default methods. 
 * Runnable, ActionListener, Comparable are some of the examples of functional interfaces. 
 * 
 */
public class FunctionalInterface {
    
    public static void main(String[] args) {

        // Before Java 8, we had to create anonymous inner class objects or implement these interfaces.
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("New thread created");
            }
        }).start();

        //Java 8 onwards, we can assign lambda expression to its functional interface object
        // lambda expression to create the object
        new Thread(()-> {
            System.out.println("New thread created");
        }).start();

        //@FunctionalInterface Annotation example:
        int a = 5;
 
        // lambda expression to define the calculate method
        Square s = (int x) -> x*x;
 
        // parameter passed and return type must be same as defined in the prototype
        int ans = s.calculate(a);
        System.out.println(ans); //25

        //Predicate: The Predicate interface has an abstract method test which gives a Boolean value as a result for the specified argument.
        // create a list of strings
        List<String> names = Arrays.asList("Geek","GeeksQuiz","g1","QA","Geek2");
 
        // declare the predicate type as string and use
        // lambda expression to create object
        Predicate<String> p = (q)->q.startsWith("G");
 
        // Iterate through the list
        for (String st:names) {
            // call the test method
            if (p.test(st))
                System.out.println(st);
        }

        //o/p:Geek GeeksQuiz Geek2
    }
}

/**
 * @FunctionalInterface Annotation: Used to ensure that the functional interface can’t have more than one abstract method. 
 * In case more than one abstract methods are present, the compiler flags an 'Unexpected @FunctionalInterface annotation' message. 
 * However, it is not mandatory to use this annotation.
 */

//@FunctionalInterface
interface Square {
    int calculate(int x);
}

/**
 * Important Points/Observations: 
 * A functional interface has only one abstract method but it can have multiple default methods.
 * @FunctionalInterface annotation is used to ensure an interface can't have more than one abstract method. 
 * The use of this annotation is optional.
 * The java.util.function package contains many builtin functional interfaces in Java 8.
 */
