package practical_part;

/**
 * Scope of Variables: Scope of a variable is the part of the program where the variable is accessible.
 */

public class VariablesScope {

    // 1. Member Variables (Class Level Scope): 
    // These variables must be declared inside class (outside any function). They can be directly accessed anywhere in class.

    // 2. Local Variables (Method Level Scope):
    // Variables declared inside a method have method level scope and can’t be accessed outside the method. 
    // Note : Local variables don’t exist after method’s execution is over. 

    static int x = 11;
    private int y = 33;
    public void method1(int x)
    {
        VariablesScope v = new VariablesScope();
        this.x = 22;
        y = 44;
 
        System.out.println(VariablesScope.x); // 22
        System.out.println(v.x); // 22
        System.out.println(v.y); // 33
        System.out.println(y);   // 44
    }

    public static void main(String[] args) {
        VariablesScope vs = new VariablesScope();
        vs.method1(5);

        //example 1:
        // Loop Variables (Block Scope):A variable declared inside pair of brackets “{” and “}” in a method has scope within the brackets only.

        {
            // The variable x has scope within brackets
            int x = 10;
            System.out.println(x);  // 10
        }
       
       //example 2:
        // Uncommenting below line would produce error since variable x is out of scope.
        // System.out.println(x);

        for (int x = 0; x < 4; x++)
            System.out.println(x);
 
       // System.out.println(x); // cannot find symbol error

    //example 3:
       /* int a = 5;
        for (int a = 0; a < 5; a++)
        {
            System.out.println(a); // variable a is already defined error
        } */
    }

}
