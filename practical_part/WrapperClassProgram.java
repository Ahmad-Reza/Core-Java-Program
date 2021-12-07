package practical_part;

import java.util.ArrayList;

/**
 * Wrapper class: A Wrapper class is a class whose object wraps or contains primitive data types. 
 * When we create an object to a wrapper class, it contains a field and in this field, we can store primitive data types. 
 * In other words, we can wrap a primitive value into a wrapper class object.
 * 
 * They convert primitive data types into objects. 
 * Objects are needed if we wish to modify the arguments passed into a method (because primitive types are passed by value). 
 * The classes in java.util package handles only objects and hence wrapper classes help in this case also.D
 * Data structures in the Collection framework, such as ArrayList and Vector, store only objects (reference types) and not primitive types.
 * An object is needed to support synchronization in multithreading.
 * 
 * eg: Character, Byte, Short, Integer, Long, Float, Double and Boolean
 * 
 */
public class WrapperClassProgram {
    public static void main(String[] args) {
        // Autoboxing: Automatic conversion of primitive types to the object of their corresponding wrapper classes. 
        // For example – conversion of int to Integer, long to Long, double to Double etc.

        char ch = 'a';
        Character a = ch;
        System.out.println(a);
  
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Autoboxing because ArrayList stores only objects
        arrayList.add(25);
        System.out.println(arrayList.get(0));

        // Unboxing: It is just the reverse process of autoboxing. Automatically converting an object of a wrapper class to its corresponding primitive type. 
        // For example – conversion of Integer to int, Long to long, Double to double, etc.

        char a2 = ch;
        System.out.println(a2);

        arrayList.add(24);
        int num = arrayList.get(1); // returns an Integer object
        System.out.println(num);

        // Need of Wrapper Classes: One of the major important features provided by wrapper classes is a lot of utility methods. 
        // Say when we have a float value, and we want to find the integer value of that float

        // In java, in case of floating values they are stored as x = (y)f
 
        // Conversion of float value to int
        Float floatWrap = Float.valueOf(45.158f);
 
        // Invoking the intValue() method over the stored float value to store
        int floatToInt = floatWrap.intValue();
        System.out.println(floatToInt); //o/p: 45
 
        // Convert the binary number to the integer value
        Integer five = Integer.valueOf("101", 2);
        System.out.println(five); ////o/p: 5
    }
}
