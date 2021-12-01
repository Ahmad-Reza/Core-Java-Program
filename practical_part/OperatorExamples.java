package practical_part;

public class OperatorExamples {
    
    public static void main(String[] args) {
        int num1 = 5, num2 = 2;
        
        // 1.) Arithmetic Operators: +, -, *, /(division), %(moduls), ++(increment), --(decrement)

        int mod = num1 % num2; // return reminder
        System.out.println("Remainder = " + mod); // o/p: 1 

        int div = num1 % num2; // return division
        System.out.println("Remainder = " + div); // o/p: 2
        
        // Post-increment operator: When placed after the variable name, the value of the operand is incremented 
        // but the previous value is retained temporarily until the execution of this statement and it gets updated before the execution of the next statement.
        int incr = 5, decr = 6;
        System.out.println(incr++); // o/p: 5
        System.out.println(decr--); // o/p: 6

        // Pre-increment operator: When placed before the variable name, the operand’s value is incremented instantly.
        // incr was 6, incremented to 7 then printed
        System.out.println(++incr);
        // decr was 5, decremented to 4 then printed
        System.out.println(--decr); // 4


        // 2. Assignment Operators: These operators are used to assign values to a variable.
        String name = "Ahmad";
        num1 += num2; // this means num1 + num2 which is store in left side variable
        //Note: same action happen with all operators *=, -=, /= and %=

        System.out.println(name); // o/p: Ahmad
        System.out.println(num1); // o/p: 7

        // Unary Operators: Java unary operators are the types that need only one operand to perform any operation like increment, decrement, negation, etc.
        // It consists of various arithmetic, logical and other operators that operate on a single operand.
        boolean cond = true;
        System.out.println("Cond is: " + cond); // true
        System.out.println("Now cond is: " + !cond); // false
        System.out.println("!(a < b) = " + !(num1 < num2)); // true

        // 3. Bitwise Complement(~): This unary operator returns the one’s complement representation of the input value or operand,
        // i.e, with all bits inverted, which means it makes every 0 to 1, and every 1 to 0. 

        // Example:
        // a = 5 [0101 in Binary]
        // result = ~5

        // This performs a bitwise complement of 5
        // ~0101 = 1010 = 10 (in decimal)

        // Then the compiler will give 2’s complement
        // of that number.
        // 2’s complement of 10 will be -6.
        // result = -6

        // 4. Relational Operators: like: ==, !=, >, <, <=, >= etc

        // 5. Logical Operators:
        // initializing variables
        int a = 5, b = 7, c = 20;
  
        // AND Operator && : (return true if all conditions under consideration are satisfied)
        if ((a > b) && (b == c)) {
            System.out.println("True conditions");
        }
        else
            System.out.println("False conditions");
        // o/p: False conditions
        
        // OR Operator || : (return true if any of conditions under consideration are satisfied) and !(NOT)
        if ((a > b) || (b == c)) {
            System.out.println("True conditions");
        }
        else
            System.out.println("False conditions");
        // o/p: True conditions

        // 6. Ternary Operator : result = condition ? true : false; if conditio is true then print true or false
        String result = (a<b) ? "Ahmad Reza" : "ahmad";
        System.out.println(result); // o/p: Ahmad Reza

        // 7. Bitwise operators: used to performing manipulation of individual bits of a number.
        // They can be used with any of the integral types (char, short, int, etc). 
 
        // Bitwise AND (&) – This operator is a binary operator, denoted by "&". 
        // It returns bit by bit AND of input values, i.e, if both bits are 1, it gives 1, else it gives 0. 
    
        System.out.println("a&b = " + (a & b)); // 0101 & 0111=0101 = 5
 
        // Bitwise OR (|) – This operator is a binary operator, denoted by "|". It returns bit by bit OR of input 
        //values, i.e, if either of the bits is 1, it gives 1, else it gives 0. 
        
        System.out.println("a|b = " + (a | b)); // 0101 | 0111=0111 = 7
 
        // Bitwise XOR (^) – This operator is a binary operator, denoted by "^". It returns bit by bit XOR of input 
        //values, i.e, if corresponding bits are different, it gives 1, else it gives 0. 

        System.out.println("a^b = " + (a ^ b)); // 0101 ^ 0111=0010 = 2
 
        // Bitwise Complement (~) – This operator is a unary operator, denoted by "~". It returns the one’s complement
        // representation of the input value, i.e, with all bits inverted, which means it makes every 0 to 1, and every 1 to 0. 
        // ~0101=1010
        // will give 2's complement of 1010 = -6
        System.out.println("~a = " + ~a); // -6 
    
        // Left & Right shift will cover after
    }
}
