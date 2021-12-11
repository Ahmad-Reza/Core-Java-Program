package practical_part;

/**
 * Polymorphism: The word polymorphism means having many forms. In simple words, we can define polymorphism as the ability of a message to be displayed in more than one form.
 * Real life example: A person at the same time can have different characteristic. Like a man at the same time is a father, 
 * a husband, an employee. So the same person posses different behavior in different situations. This is called polymorphism.
 * 
 * Polymorphism allows us to perform a single action in different ways. In other words, polymorphism allows you to define one interface 
 * and have multiple implementations. The word "poly" means many and "morphs" means forms, So it means many forms.
 * 
 */

//1. Compiletime/Static polymorphism: This type of polymorphism is achieved by method overloading or operator overloading. 
// But Java doesn't support the Operator Overloading.

class MultiplyFun {

    static int Multiply(int a, int b) {
        return a * b;
    }
  
    static double Multiply(double a, double b) {
        return a * b;
    }
}

//2. Runtime/Dynamic polymorphism: It is a process in which a method call to the overridden method is resolved at Runtime. This is achieved by Method Overriding.

class Parent {
    
    void Print() {
        System.out.println("parent class");
    }
}
  
class subclass1 extends Parent {
  
    void Print(){
        System.out.println("subclass1");
    }
}
  
class subclass2 extends Parent {
  
    void Print() {
        System.out.println("subclass2");
    }
}

public class PolymorphismProgram {

    public static void main(String[] args) {
        // Method Overloading: When there are multiple functions with same name but different parameters then these functions are said to be overloaded. 
        // Functions can be overloaded by change in number of arguments or/and change in type of arguments.
        System.out.println(MultiplyFun.Multiply(2, 4)); // 8
        System.out.println(MultiplyFun.Multiply(5.5, 6.3)); // 34.65

        //Method overriding, on the other hand, occurs when a derived class has a definition for one of the member methods of the base class. 
        //That base function is said to be overridden.
        Parent a = new subclass1(); //subclass1
        a.Print();
  
        a = new subclass2(); //subclass2
        a.Print();
    }
    
}
