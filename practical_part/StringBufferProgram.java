package practical_part;

public class StringBufferProgram {
    
    /**
     * StringBuffer: StringBuffer is a peer class of String that provides much of the functionality of strings.
     * The string represents fixed-length, immutable character sequences while StringBuffer represents growable and 
     * writable character sequences. StringBuffer may have characters and substrings inserted in the middle or appended
     * to the end. It will automatically grow to make room for such additions and often has more characters preallocated 
     * than are actually needed, to allow room for growth.
     * 
     * 
     * # Some Interesting Facts about the StringBuffer class :
     * java.lang.StringBuffer extends (or inherits from) Object class.
     * All Implemented Interfaces of StringBuffer class: Serializable, Appendable, CharSequence.
     * public final class StringBuffer extends Object implements Serializable, CharSequence, Appendable.
     * String buffers are safe for use by multiple threads. The methods can be synchronized wherever necessary so that all 
     * the operations on any particular instance behave as if they occur in some serial order.
     * Whenever an operation occurs involving a source sequence (such as appending or inserting from a source sequence)
     * this class synchronizes only on the string buffer performing the operation, not on the source.
     * It inherits some of the methods from the Object class which such as clone(), equals(), finalize(), getClass(), hashCode(), notifies(), notifyAll().
     * 
     * 
     */
    
     public static void main(String[] args) {
        // Creating and storing string by creating object of StringBuffer
        StringBuffer str = new StringBuffer("AhmadReza");
 
        int strLength = str.length(); //gives string length 
 
        int strCapcity = str.capacity(); //gives string capacity 
 
        System.out.println(strLength); //9
        System.out.println(strCapcity); //25

        // append method add the string in the end of original string(str)
        str.append("Nice"); 
        System.out.println(str); //AhmadRezaNice
 
        str.append(1);
        System.out.println(str); //AhmadRezaNice1

        StringBuffer str1 = new StringBuffer("AhmadReza");
        str1.insert(5, "for");
        System.out.println(str1); //AhmadforReza

        // Declaring and initializing character array
        char strArr[] = { 'p', 'a', 'w', 'a', 'n' };
  
        // Inserting character array at offset 9
        str1.insert(2, strArr);
        System.out.println(str1); //AhpawanmadforReza

        str.reverse(); 
        System.out.println(str); //azeRdamhA

        str1.delete(2, 7);
        System.out.println(str1); //AhmadforReza
 
        str1.deleteCharAt(7);
        System.out.println(str1); //AhmadfrReza

        str1.replace(5, 7, "are");
        System.out.println(str1); //AhmadareReza
     }
}
