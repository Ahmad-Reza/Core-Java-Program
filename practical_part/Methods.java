package practical_part;

/**
# Data type:
- the type of data which are ecpecting as input to program.
    1.) primitive DT
    2.) Non-primitive DT

1.) primitive: the data type which are existing in single valued data formats. 
        ex: Integer, float, character, Boolead

 a.) Integer: the numeric data without decimal point representation
        types: byte - 1byte - 8 bits
               short - 2bytes
               int - 4bytes
               long - 8bytes 

 b.) float: the numeric data with decimal point representation
            eg: float - 4bytes
                double - 8bytes
 c.) character: A single characyter like 'a', 'A'
                eg: char - 2bytes 
 d.) Boolean: to represent true and false 
                eg: boolean - 1 bit

# field storage: the memory which is generated part of java program to hold single valued.
  note: when we have primitive data types in the program they generated field storage
   
            int count = 4 ;  4byte(field storage)

2.) Non-primitive: the data type which are existing in group of same type valued data formats. 
    eg: class, Interface, enum, Array, String

# Object storage: the memory which is generated part of java program to hold group members.
  note: when we have Non- primitive data types in the program they generated object storage
  eg: 
        Methods obj = new Mthods();

# Object: object is a memory created part of heap area related to class holding the non-static/instance members of the class
# object refrence: the address location where the object is created

 */

/**
# Methods: methods are the actions performed on the variable int the process of generating results.
    syntax:
        accesModifier returnType methodName(parameters/argument){
            // some of code...
        }
    eg;
        public void test(int a, float y){
            //// some of code...
        }

    1.) Non-Static Method
    2.) Static Method

1.) Non-Static Method: 
- the method which are declared without static keyword 
- Non-Static Method is also knows as instance method
- Non-Static Methods will get memory within the object while object creation and accessed with the object name 

# there are two types of Non-Static Method...
a.) Built-in instance method:- instance method which are already exist within the javalib(java library).
    eg: Methods of Scannner class
        nextLine()
        nextInt() etc.

 note: we use 'javap' command in command promt to see all the Built-in methods of Classes and Interface
   syntax: [ javap java.packageName.className/InterfaceName]
        eg: javap java.util.Scanner

b.) User defined instance method: instance method are defind by user

# defined parameters?
- parameters are the variables, which are used to carry the data from one method to another method in java stack area.
            a.) method without parameter
            b.) method with parameter
            
a.) method without parameter: which are declared without parameter.
        eg: show(), test() etc

b.) method with parameter: which are declared with parameter.
        eg: show(int a), test(float a, int b) etc

 */

import java.util.Scanner;

 public class Methods {

    // non-static/instance method
    // method without parameter
    void show(){
        System.out.println("instance method");
    }

    // method with parameter
    // method without return type: Do not return any value after method execution
    void sum(int a, int b){
        int result = a + b;
        System.out.println("Result for addition: " + result); // o/p - Result: 100
    }

    // method with return type: return any value after method execution
    int sub(int x, int y){
        int result = x - y;
        return result;
    }

    public static void main(String[] args){
        Methods obj = new Methods();
        
        obj.show();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter value for num1: ");
            int num1 = sc.nextInt(); // Built-in/predefined method

            System.out.print("enter value for num2: ");
            int num2 = sc.nextInt();

            // in a simple way...
            int result1 = num1 + num2;
            System.out.println("Result1: " + result1); // o/p -> Result: 100
            
            obj.sum(num1, num2);
            int result2 = obj.sub(num1, num2);
            System.out.println("Result for subtraction: " + result2); // o/p -> Result: 10
        }
        
        // Creating an instance of the class
        Test obj2 = new Test();
         
        // Calling the m1() method by the object created in above step.
        int i = obj2.m1();
        System.out.println("Control returned after method m1 :" + i);
         
        // Call m2() method -> obj2.m2();

        int no_of_objects = Test.get();
         
        System.out.print("No of instances created till now : ");
        System.out.println(no_of_objects);
    }
}

class Test
{
    public static int i = 0;
    // constructor of class which counts the number of the objects of the class.
    Test() {
        i++;     
    }
    // static method is used to access static members of the class and for getting total 
    // no of objects of the same class created so far
    public static int get() {
        // statements to be executed....
        return i;
    }
 
    // Instance method calling object directly that is created inside another class 'Methods'. Can also be called by object directly created in the same class 
    // and from another method defined in the same class and return integer value as return type is int.
    public int m1() {
        System.out.println("Inside the method m1 by object of GFG class");
         
        // calling m2() method within the same class.
        this.m2();
         
        // statements to be executed if any
        return 1;
    }
 
    // It doesn't return anything as return type is 'void'.
    public void m2() {
        System.out.println("In method m2 came from method m1");
    }
}

// Memory allocation for methods calls: Methods calls are implemented through a stack. 
    // Whenever a method is called a stack frame is created within the stack area and after that, 
    // the arguments passed to and the local variables and value to be returned by this called method are stored in 
    // this stack frame and when execution of the called method is finished, the allocated stack frame would be deleted. 
    // There is a stack pointer register that tracks the top of the stack which is adjusted accordingly.