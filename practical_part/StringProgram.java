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

        String str = "Ahmad Reza"; //String literal
        System.out.println(str); // o/p: Ahmad Reza

        // The string can also be declared using new operator i.e. dynamically allocated. In case of String are dynamically allocated 
        // they are assigned a new memory location in heap. This string will not be added to String constant pool.

        String str1 = new String("Ahmad");
        System.out.println(str1); // o/p: Ahmad

        // If you want to store this string in the constant pool then you will need to “intern” it.
        String internedString = str1.intern(); 
        System.out.println(internedString); // o/p: Ahmad Reza 
        
        // String Class: String is a sequence of characters. In java, objects of String are immutable which means a 
        // constant and cannot be changed once created.
        
        // return string length
        System.out.println("String length = " + str.length()); // 10
  
        // Returns the character at ith index.
        System.out.println("Character at 3rd position = " + str.charAt(3)); // a
  
        // Return the substring from the ith  index character to end of string
        System.out.println("Substring " + str.substring(3)); // ad Reza
  
        // Returns the substring from i to j-1 index.
        System.out.println("Substring  = " + str.substring(2,5)); // mad
  
        // Concatenates string2 to the end of string1.
        String s1 = "Ahmad";
        String s2 = "Reza";
        System.out.println("Concatenated string  = " + s1.concat(s2)); // AhmadReza
  
        // Returns the index within the string of the first occurrence of the specified string.
        String s4 = "Learn Share Learn";
        System.out.println("Index of Share " + s4.indexOf("Share")); // 6
  
        // Returns the index within the string of the first occurrence of the specified string, starting at the specified index.
        System.out.println("Index of a  = " + s4.indexOf('a',3)); // 8
  
        // Checking equality of Strings
        Boolean out = "Ahmad".equals("ahmad");
        System.out.println("Checking Equality  " + out); // false
        out = "Ahmad".equals("Ahmad");
        System.out.println("Checking Equality  " + out); // true
  
        out = "Geeks".equalsIgnoreCase("gEeks ");
        System.out.println("Checking Equality " + out); // true
          
        //If ASCII difference is zero then the two strings are similar
        int out1 = s1.compareTo(s2);
        System.out.println("the difference between ASCII value is="+out1); // -31

        // Converting cases
        String word1 = "AhmaD";
        System.out.println("Changing to lower Case " + word1.toLowerCase()); // ahmad
  
        // Converting cases
        String word2 = "AhmaD";
        System.out.println("Changing to UPPER Case " + word2.toUpperCase()); // AHMAD
  
        // Trimming the word (clear the white space from both side)
        String word4 = " Learn Share Learn ";
        System.out.println("Trim the word " + word4.trim()); // Learn Share Learn
  
        // Replacing characters
        String str2 = "feeksforfeeks";
        System.out.println("Original String " + str2); // feeksforfeeks
        String str3 = str2.replace('f' ,'g') ;
        System.out.println("Replaced f with g -> " + str3); // geeksgorgeeks

     }
}
