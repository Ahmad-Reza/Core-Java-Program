package practical_part;

public class StringProgram {

    /**
     * # String: Strings in Java are Objects that are backed internally by a char array. Since arrays are 
     * immutable(cannot grow), Strings are immutable as well. Whenever a change to a String is made, an entirely new String is created. 
     * 
     */
    
     public static void main(String[] args) {
        // Whenever a String Object is created as a literal, the object will be created in String constant pool.
        // This allows JVM to optimize the initialization of String literal.

        String str = "Ahmad";
        System.out.println(str); // Ahmad

        // The string can also be declared using new operator i.e. dynamically allocated. In case of String are dynamically allocated 
        // they are assigned a new memory location in heap. This string will not be added to String constant pool.

        String str1 = new String("Ahmad Reza");
        System.out.println(str1); // Ahmad Reza

        // If you want to store this string in the constant pool then you will need to “intern” it.
        String internedString = str1.intern(); 
        System.out.println(internedString); // Ahmad Reza         
     }
}
