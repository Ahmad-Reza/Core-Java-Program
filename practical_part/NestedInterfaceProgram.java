package practical_part;

/**
 * We can declare interfaces as member of a class or another interface.  
 * Interfaces (or classes) can have only public and default access specifiers when declared outside any other class. 
 * This interface declared in a class can either be default, public, protected not private. 
 * While implementing the interface, we mention the interface as ClassName.InterfaceName.
 */

class Test {
    interface Yes {
        void show();
    }
}
  
class Testing implements Test.Yes {
    public void show(){
        System.out.println("show method of interface");
    }
}

//Interface in another Interface: An interface can be declared inside another interface also. 
//We mention the interface as InterfaceName1.InterfaceName2.
interface Test1 {

   interface Yes1 {
      void show();    
   }
}
  
class Testing1 implements Test1.Yes1{

   public void show() {
      System.out.println("show method of interface");
   } 
} 
//Note: In the above example, access specifier is public even if we have not written public. 
//If we try to change access specifier of interface to anything other than public, we get compiler error.

public class NestedInterfaceProgram {
    public static void main(String[] args) throws NoClassDefFoundError{
        Test.Yes obj;
        Testing t = new Testing();
        obj=t;
        obj.show();

        //example2
        Test1.Yes1 obj1;
        Testing1 t1 = new Testing1();
        obj1 = t1;
        obj1.show();
    }
}

