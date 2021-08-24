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

2.) static Method


 */

 public class Methods {

    // Non-static/instance Method 
   public void nonStaticMethod(){
       System.out.println("Non Static Method");
    }

    public static void main(String[] args){
        Methods obj = new Methods();
        obj.nonStaticMethod();
    }
}