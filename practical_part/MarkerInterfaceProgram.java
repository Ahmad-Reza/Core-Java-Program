package practical_part;

import java.lang.Cloneable;
import java.io.*;

/**
 * It is an empty interface (no field or methods). Examples of marker interface are Serializable, 
 * Cloneable and Remote interface. All these interfaces are empty interfaces.
 * 
 * Cloneable interface: present in java.lang package. There is a method clone() in Object class. 
 * A class that implements the Cloneable interface indicates that it is legal for clone() method to make a field-for-field 
 * copy of instances of that class. classes that implement this interface should override Object.clone() method.
 * 
 */
class A implements Cloneable {
    int age;
    String name;
  
    // A class constructor
    public A(int age,String name) {
        this.age = age;
        this.name = name;
    }
  
    // Overriding clone() method
   @Override
   protected Object clone() throws CloneNotSupportedException {
       return super.clone();
   }
}

/**
 * Serializable: present in java.io package. It is used to make an object eligible for saving its state into a file. 
 * Classes that do not implement this interface will not have any of their state serialized or deserialized. 
 * All subtypes of a serializable class are themselves serializable.
 * 
 */
class B implements Serializable {
    int price;
    String fruit;
  
    // A class constructor
    public B(int price,String fruit)
    {
        this.price = price;
        this.fruit = fruit;
    }
}
  

public class MarkerInterfaceProgram {

    public static void main(String[] args)  throws CloneNotSupportedException, IOException, ClassNotFoundException {
        // Cloneable example...
        A a = new A(20, "Ahmad Reza");
  
        // cloning 'a' and holding new cloned object reference in b
        A b = (A) a.clone();
  
        System.out.println(b.age); //20
        System.out.println(b.name); //Ahmad Reza

        // Serializable example...
        B obj = new B(20,"Apple");
  
        // Serializing 'a'
        //File yourFile = new File("score.txt");
        //yourFile.createNewFile();
        FileOutputStream fos = new FileOutputStream("D:\test.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);
  
        // De-serializing 'a'
        FileInputStream fis = new FileInputStream("D:\test.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        B b1 = (B)ois.readObject(); //down-casting object
  
        System.out.println(b1.price+" "+b1.fruit);
  
        // closing streams
        oos.close();
        ois.close();
         
    }
}
/**
 * Remote interface: Present in java.rmi package. A remote object is an object which is stored at one machine and 
 * accessed from another machine. So, to make an object a remote object, we need to flag it with Remote interface. 
 * Here, Remote interface serves to identify interfaces whose methods may be invoked from a non-local virtual machine.Any object that is a remote object must directly or indirectly implement this interface. RMI (Remote Method Invocation) provides some convenience classes that remote object implementations can extend which facilitate remote object creation.
 */
