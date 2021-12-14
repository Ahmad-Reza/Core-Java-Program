package practical_part;

/**
 * Exception Handling: An exception is an unwanted or unexpected event, which occurs during the execution of a program 
 * i.e at run time, that disrupts the normal flow of the program’s instructions.
 * 
 * Error: An Error indicates serious problem that a reasonable application should not try to catch.
 * Exception: Exception indicates conditions that a reasonable application might try to catch.
 *
 */
public class ExceptionHandlingProgram {

    // It throws the Exception(ArithmeticException). Appropriate Exception handler is not found within this method.
    static int divideByZero(int a, int b) {    
        // this statement will cause ArithmeticException(/ by zero)
        int i = a/b;   

        return i;
    }
      
    // The runTime System searches the appropriate Exception handler
    // in this method also but couldn't have found. So looking forward on the call stack.
    static int computeDivision(int a, int b) {
        int res =0;
          
        try {
          res = divideByZero(a,b);
        }
        // doesn't matches with ArithmeticException
        catch(NumberFormatException ex) {
           System.out.println("NumberFormatException is occured"); 
        }

        return res;
    }
      
    // In this method found appropriate Exception handler, i.e. matching catch block.
    public static void main(String[] args) {
        //String str = null;
        //System.out.println(str.length()); // null pointer exception 

        // try {
        //     // block of code to monitor for errors
        //     // the code you think can raise an exception
        // }
        // catch (ExceptionType1 exOb) {
        //     // exception handler for ExceptionType1
        // }
        // catch (ExceptionType2 exOb) {
        //     // exception handler for ExceptionType2
        // }
        
        // // optional
        // finally {
        //     // block of code to be executed after try block ends
        // }

        int a = 1, b = 0;   

        try {
            int i = computeDivision(a,b);
        } 
        // matching ArithmeticException
        catch(ArithmeticException ex) {
            // getMessage will print description of exception(here / by zero)
            System.out.println(ex.getMessage()); // / by zero
        }

        /**
         * Customized Exception Handling : Java exception handling is managed via five keywords: try, catch, throw, throws, and finally. 
         * Briefly, here is how they work. Program statements that you think can raise exceptions are contained within a try block. 
         * If an exception occurs within the try block, it is thrown. Your code can catch this exception (using catch block) and handle 
         * it in some rational manner. System-generated exceptions are automatically thrown by the Java run-time system. 
         * To manually throw an exception, use the keyword throw. Any exception that is thrown out of a method must be specified as such by a throws clause. 
         * Any code that absolutely must be executed after a try block completes is put in a finally block.
         * 
         */
    }
}

/**
 * In a method, there can be more than one statements that might throw exception, So put all these statements within 
 * its own try block and provide separate exception handler within own catch block for each of them.
 * If an exception occurs within the try block, that exception is handled by the exception handler associated with it. 
 * To associate exception handler, we must put catch block after it. There can be more than one exception handlers. 
 * Each catch block is a exception handler that handles the exception of the type indicated by its argument. 
 * The argument, ExceptionType declares the type of the exception that it can handle and must be the name of the 
 * class that inherits from Throwable class. For each try block there can be zero or more catch blocks, 
 * but only one finally block. The finally block is optional.It always gets executed whether an exception occurred 
 * in try block or not . If exception occurs, then it will be executed after try and catch blocks. 
 * And if exception does not occur then it will be executed after the try block. 
 * The finally block in java is used to put important codes such as clean up code e.g. closing the file or closing the connection.
 * 
 */
