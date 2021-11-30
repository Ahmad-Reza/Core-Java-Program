package practical_part;

// A Java program to demonstrate working of a Class type object created by JVM to represent .class file in memory.
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class JVMWorkingProcess {
    public static void main(String[] args) {
        /**
         * 1.) Loading: The Class loader reads the .class file, generate the corresponding binary data and save it in the method area. For each .class file, 
         
         * JVM stores the following information in the method area. 
         * a.) The fully qualified name of the loaded class and its immediate parent class.
         * b.) Whether the .class file is related to Class or Interface or Enum.
         * c.) Modifier, Variables and Method information etc.
         * 
         * After loading the “.class” file, JVM creates an object of type Class to represent this file in the 
         * heap memory. Please note that this object is of type Class predefined in java.lang package. 
         * These Class object can be used by the programmer for getting class level information like the 
         * name of the class, parent name, methods and variable information etc.To get this object reference we can 
         * use getClass() method of Object class.
         * 
         */

        Student s1 = new Student();

		// Getting hold of Class object created by JVM.
		Class c1 = s1.getClass();

		// Printing type of object using c1.
		System.out.println(c1.getName());    // o/p: Stuent 

		// getting all methods in an array
		Method m[] = c1.getDeclaredMethods();
		for (Method method : m) {
			System.out.println(method.getName());  // o/p: getName, setName, getRoll_no, setRoll_no
        }

		// getting all fields in an array
		Field f[] = c1.getDeclaredFields();
		for (Field field : f) {
            System.out.println(field.getName());   // o/p: name, rolll_no
        }
    }
}

class Student {
	private String name;
	private int roll_No;   

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getRoll_no() { return roll_No; }
	public void setRoll_no(int roll_no) { this.roll_No = roll_no; }
}

/**
 * 3.) Execution Engine: Execution engine executes the “.class” (bytecode). It reads the byte-code line by line,
 * uses data and information present in various memory area and executes instructions. 
 * It can be classified into three parts:
 * 
 * a.) Interpreter: It interprets the bytecode line by line and then executes. The disadvantage here is that when one method is called multiple times, every time interpretation is required.
 * b.) Just-In-Time Compiler(JIT) : It is used to increase the efficiency of an interpreter. It compiles the entire bytecode and changes it to native code so whenever the interpreter sees repeated method calls, JIT provides direct native code for that part so re-interpretation is not required, thus efficiency is improved.
 * c.)Garbage Collector: It destroys un-referenced objects. For more on Garbage Collector, refer Garbage Collector.
 * 
 * 4.) Java Native Interface (JNI) : It is an interface that interacts with the Native Method Libraries and provides the native libraries(C, C++) required for the execution.
 *  It enables JVM to call C/C++ libraries and to be called by C/C++ libraries which may be specific to hardware.

 * 5.) Native Method Libraries : It is a collection of the Native Libraries(C, C++) which are required by the Execution Engine.
 * 
 */
