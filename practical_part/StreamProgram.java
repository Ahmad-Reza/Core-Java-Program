package practical_part;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Introduced in Java 8, the Stream API is used to process collections of objects. 
 * A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.
 * 
 * A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.
 * Streams don't change the original data structure, they only provide the result as per the pipelined methods.
 * Each intermediate operation is lazily executed and returns a stream as a result, hence various intermediate operations can be pipelined. 
 * Terminal operations mark the end of the stream and return the result.
 * 
 * 
 * map: The map method is used to returns a stream consisting of the results of applying the given function 
 * to the elements of this stream.
 *       eg: List number = Arrays.asList(2,3,4,5);
 *          List square = number.stream().map(x->x*x).collect(Collectors.toList());
 * 
 * filter: The filter method is used to select elements as per the Predicate passed as argument.
 *      eg: List names = Arrays.asList("Reflection","Collection","Stream");
 *          List result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
 *          
 * sorted: The sorted method is used to sort the stream.
 *       eg: List names = Arrays.asList("Reflection","Collection","Stream");
 *          List result = names.stream().sorted().collect(Collectors.toList());
 *
 * 
 * Terminal Operations:
 * collect: The collect method is used to return the result of the intermediate operations performed on the stream.
 *        eg: List number = Arrays.asList(2,3,4,5,3);
 *            Set square = number.stream().map(x->x*x).collect(Collectors.toSet());
 * 
 * forEach: The forEach method is used to iterate through every element of the stream.
 *        eg: List number = Arrays.asList(2,3,4,5);
 *            number.stream().map(x->x*x).forEach(y->System.out.println(y));
 * 
 * reduce: The reduce method is used to reduce the elements of a stream to a single value.
 * The reduce method takes a BinaryOperator as a parameter.
 *      eg: List number = Arrays.asList(2,3,4,5);
 *          int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
 * Here ans variable is assigned 0 as the initial value and i is added to it
 */

public class StreamProgram {

    public static void main(String[] args) {
        // create a list of integers
        List<Integer> number = Arrays.asList(2,3,4,5);
    
        // demonstration of map method
        List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println(square); //o/p: [4, 9, 16, 25]
    
        // create a list of String
        List<String> names = Arrays.asList("Reflection","Collection","Stream");
    
        // demonstration of filter method
        List<String> result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
        System.out.println(result); //o/p: [Stream]
    
        // demonstration of sorted method
        List<String> show = names.stream().sorted().collect(Collectors.toList());
        System.out.println(show); // o/p: [Collection, Reflection, Stream]
    
        // create a list of integers
        List<Integer> numbers = Arrays.asList(2,3,4,5,2);
    
        // collect method returns a set
        Set<Integer> squareSet = numbers.stream().map(x->x*x).collect(Collectors.toSet());
        System.out.println(squareSet); //o/p: [16, 4, 9, 25]
    
        // demonstration of forEach method
        number.stream().map(x->x*x).forEach(y->System.out.print(y + " ")); //o/p: 4 9 16 25
    
        System.out.println();

        // demonstration of reduce method
        int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
        System.out.println(even); //o/p: 6
        
    }   
}

