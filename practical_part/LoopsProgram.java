package practical_part;

public class LoopsProgram {
    //Loops: for, while, do-while and for-each 

    public static void main(String[] args) {
        // Writing a for loop to print Hello World 5 times
        for (int i = 1; i <= 5; i++)
            System.out.print("Hello World" + ",");
            
        System.out.println("\n");        

        // initialization expression
        int i = 1;
  
        // While loop example:
        while (i < 6) {
            System.out.print("Hello World" + ",");
            i++; // update expression
        }
        System.out.println("\n"); 

        // do-while loop example:
        do {   
            System.out.print("Hello World" + ",");
            i++;
         } while (i < 6); // test expression

         System.out.println("\n"); 
         
         // for-each loop example:
         int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
         for(int num : numbers) {
            System.out.print(num + " "); // o/p: 1 2 3 4 5 6 7 8 9
         }
    }
}
