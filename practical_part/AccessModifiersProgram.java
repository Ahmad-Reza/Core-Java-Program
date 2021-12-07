package practical_part;

/**
 * Access Modifiers: As the name suggests access modifiers in Java helps to restrict the scope of a class, 
 * constructor, variable, method, or data member. eg, Default(No keyword required), Private, Protected, Public
 * 
 */

public class AccessModifiersProgram {
    public static void main(String[] args) {

        // Default: When no access modifier is specified for a class, method, or data member – It is said to be having 
        // the default access modifier by default. i.e, having default access modifier are accessible only within the same package.

        // If Ahmad class in another package then, will get Compile time error 
        Ahmad obj = new Ahmad(); 
        obj.display(); 

        /**
         * Private: The methods or data members declared as private are accessible only within the class in which they are declared.
         * Any other class of the same package will not be able to access these members.
         * Top-level classes or interfaces can not be declared as private because private means "only visible within the enclosing class".
         * protected means "only visible within the enclosing class and any subclasses"
         * 
        */
        
        // Trying to access private method of another class 
        // obj.show(); will get error: display() has private access in A obj.display();

        /**
         * Protected: The methods or data members declared as protected are accessible within the same package or subclasses in different packages.
         * 
         * Public: The public access modifier has the widest scope among all other access modifiers. Classes, methods, or 
         * data members that are declared as public are accessible from everywhere in the program. There is no restriction on the scope of public data members.
         * 
         */
    }
}

class Ahmad { 
    // example for default access modifier...
    void display() { 
        System.out.println("Hello World!"); 
    } 

    private void show() { 
        System.out.println("Ahmad Reza"); 
    } 
} 
