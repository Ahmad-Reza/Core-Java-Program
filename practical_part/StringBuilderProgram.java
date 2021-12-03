package practical_part;

public class StringBuilderProgram {

    /**
     * # StringBuilder: The StringBuilder in Java represents a mutable sequence of characters.
     * The function of StringBuilder is very much similar to the StringBuffer class, 
     * However the StringBuilder class differs from the StringBuffer class on the basis of synchronization. 
     * The StringBuilder class provides no guarantee of synchronization whereas the StringBuffer class does. 
     * Therefore this class is designed for use as a drop-in replacement for StringBuffer in places where the 
     * StringBuffer was being used by a single thread (as is generally the case). 
     * Where possible, it is recommended that this class be used in preference to StringBuffer as it will be faster 
     * under most implementations. Instances of StringBuilder are not safe for use by multiple threads. 
     * If such synchronization is required then it is recommended that StringBuffer be used.
     * 
     */
    
     public static void main(String[] args) {
        // create a StringBuilder object using StringBuilder() constructor
        StringBuilder str = new StringBuilder();
        str.append("Ahmad");
        System.out.println("String = " + str.toString()); //Ahmad

        StringBuilder str2 = new StringBuilder(10);
        System.out.println("String2 capacity = " + str2.capacity()); // 10

        StringBuilder str3 = new StringBuilder(str.toString());
        System.out.println("String3 = " + str3.toString()); //Ahmad
     }
}
