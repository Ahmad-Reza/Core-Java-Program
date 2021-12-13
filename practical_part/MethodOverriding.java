package practical_part;

/**
 * Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method 
 * that is already provided by one of its super-classes or parent classes. When a method in a subclass has the same 
 * name, same parameters or signature, and same return type(or sub-type) as a method in its super-class, 
 * then the method in the subclass is said to override the method in the super-class.
 * Method overriding is one of the way by which java achieve Run Time Polymorphism.
 * 
 */

// Base Class
class Parent {
    void show() {
        System.out.println("Parent's show()");
    }

    // private methods are not overridden
    // private void m1() {
    //     System.out.println("From parent m1()");
    // }
   
    protected void m2() {
        System.out.println("From parent m2()");
    }
}
  
// Inherited class
class Child extends Parent {
    // This method overrides show() of Parent
    @Override
    void show(){
        System.out.println("Child's show()");
    }

    // new m1() method unique to Child class
    // private void m1() {
    //     System.out.println("From child m1()");
    // }
  
    // overriding method with more accessibility
    @Override
    public void m2() {
        System.out.println("From child m2()");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        // If a Parent type reference refers to a Parent object, then Parent's show is called
        Parent obj1 = new Parent();
        obj1.show(); //Parent's show()
  
        // If a Parent type reference refers to a Child object Child's show() is called. This is called RUN TIME POLYMORPHISM.
        Parent obj2 = new Child();
        obj2.show(); //Child's show()


        //Rules for method overriding:
        //1. Overriding and Access-Modifiers : The access modifier for an overriding method can allow more, but not less, 
        // access than the overridden method. For example, a protected instance method in the super-class can be made public, 
        // but not private, in the subclass. Doing so, will generate compile-time error.
        
        Parent obj3 = new Parent();
        obj3.m2(); //From parent m2()

        Parent obj4 = new Child();
        obj4.m2(); //From child m2()

        // private void m1() { System.out.println("From child m1()"); }

        //2. Final methods can not be overridden : If we don't want a method to be overridden, we declare it as final.

        //3. Static methods can not be overridden(Method Overriding vs Method Hiding) : When you define a static method 
        // with same signature as a static method in base class, it is known as method hiding.

        //4. Private methods can not be overridden : Private methods cannot be overridden as they are bonded during compile time. 
        //Therefore we can’t even override private methods in a subclass

        //5. Overriding and constructor : We can not override constructor as parent and child class can never have 
        // constructor with same name(Constructor name must always be same as Class name).

        
    
    }
}

//6. Overriding and Exception-Handling : Below are two rules to note when overriding methods related to exception-handling.
//Rule#1 : If the super-class overridden method does not throw an exception, subclass overriding method can 
//only throws the unchecked exception, throwing checked exception will lead to compile-time error.
class Parent1 {
    void m1() {
        System.out.println("From parent m1()");
    }
  
    void m2() {
        System.out.println("From parent  m2()");
    }
}
  
class Child1 extends Parent1 {
    @Override
    // no issue while throwing unchecked exception
    void m1() throws ArithmeticException {
        System.out.println("From child m1()");
    }
  
    //@Override
    // compile-time error issue while throwin checked exception
    // void m2() throws Exception { System.out.println("From child m2"); }
}

//Rule#2 : If the super-class overridden method does throws an exception, subclass overriding method can only throw same, subclass exception. 
//Throwing parent exception in Exception hierarchy will lead to compile time error.Also there is no issue if subclass overridden method is not throwing any exception.