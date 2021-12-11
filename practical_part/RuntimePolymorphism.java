package practical_part;

/**
 * Method overriding is one of the ways in which Java supports Runtime Polymorphism. 
 * Dynamic method dispatch is the mechanism by which a call to an overridden method is resolved at run time, rather than compile time.
 *
 */

class A {
    void m1() {
        System.out.println("Inside A's m1 method");
    }
}
  
class B extends A {
    // overriding m1()
    void m1() {
        System.out.println("Inside B's m1 method");
    }
}
  
class C extends A {
    // overriding m1()
    void m1() {
        System.out.println("Inside C's m1 method");
    }
}
  

public class RuntimePolymorphism {
    public static void main(String[] args) {

        // object of type A
        A a = new A();
        B b = new B();
        C c = new C();
   
        A ref; // obtain a reference of type A

        //ref refers to an A object
        ref = a; 
        ref.m1(); //calling A's version of m1()
   
        ref = b;
        ref.m1();
   
        ref = c;
        ref.m1();         
    }
}
// o/p: Inside A's m1 method
//      Inside B's m1 method
//      Inside C's m1 method