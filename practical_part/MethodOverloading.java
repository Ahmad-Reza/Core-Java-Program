package practical_part;

/**
 * Method overloading: Overloading allows different methods to have the same name, but different signatures where 
 * the signature can differ by the number of input parameters or type of input parameters or both. 
 * Overloading is related to compile-time (or static) polymorphism.
 *
 */
public class MethodOverloading {
    // Overloaded sum(). This sum takes two int parameters
    public int sum(int x, int y) {
        return (x + y);
    }
  
    // Overloaded sum(). This sum takes three int parameters
    public int sum(int x, int y, int z) {
        return (x + y + z);
    }
  
    // Overloaded sum(). This sum takes two double parameters
    public double sum(double x, double y) {
        return (x + y);
    }

    public static int foo(int a) { return 10; }
    public static char foo(int a, int b) { return 'a'; }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        System.out.println(obj.sum(10, 20)); //30
        System.out.println(obj.sum(10, 20, 30)); //60
        System.out.println(obj.sum(10.5, 20.5)); //31.0 

        // We cannot overload by return type. 
        // However, Overloading methods on return type are possible in cases where the data type of the method being called is explicitly specified.
        
        System.out.println(foo(1)); //10
        System.out.println(foo(1, 2)); //a

       
       //we can overload static methods. We can have two or more static methods with same name, but differences in input parameters.
    
       //We cannot overload two methods in Java if they differ only by static keyword (number of parameters and types of parameters is same). 

       //Like other static methods, we can overload main() in Java.
       System.out.println("Hey coder (from main)");
       MethodOverloading.main("Coder");

    }

    // Overloaded main methods
    public static void main(String arg1) {
        System.out.println("Hi, " + arg1);
        MethodOverloading.main("Dear coder", "My friend");
    } 

    public static void main(String arg1, String arg2) {
        System.out.println("Hi, " + arg1 + ", " + arg2);
    }
}

/**
 * Advantage: We don't have to create and remember different names for functions doing the same thing. 
 * For example, in our code, if overloading was not supported by Java, we would have to create method names like sum1, sum2, … or sum2Int, sum3Int, … etc.
 */
