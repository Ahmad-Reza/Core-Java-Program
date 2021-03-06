package practical_part;

public class DecisionMaking {
    
    // Decision Making: eg, if, if-else, nested if, if-else-if, swith-case and jump(break, continue)

    public static void main(String[] args) {
        int i = 20;
  
        // nested if statement example...
        if (i == 10)
        {
            // First if statement
            if (i < 15)
                System.out.println("i is smaller than 15");
  
            // Nested - if statement Will only be executed if statement above it is true
            if (i < 12)
                System.out.println("i is smaller than 12 too");
            else
                System.out.println("i is greater than 15");
        }

        //if-else-if ladder example...
        if (i == 10)
            System.out.println("i is 10");
        else if (i == 15)
            System.out.println("i is 15");
        else if (i == 20)
            System.out.println("i is 20");
        else
            System.out.println("i is not present");


        // switch-case statement example...
        switch (i) {
            case 0:
                System.out.println("i is zero.");
                break; // terminate the loop
            case 1:
                System.out.println("i is one.");
                break;
            case 2:
                System.out.println("i is two.");
                break;
            default:
                System.out.println("i is greater than 2.");
        }

        // Break keyword: terminate the loop/method
        // Continue keyword: skip that point/num and continue the loop 
        for (int j = 0; j < 10; j++)
        {
            // If the number is even skip and continue
            if (j%2 == 0)
                continue;
  
            // If number is odd, print it
            System.out.print(j + " ");
        }

        // Using break as a Form of Goto: Java does not have a goto statement because it provides a way to branch in an 
        //arbitrary and unstructured manner. Java uses label. A Label is use to identifies a block of code.

        boolean t = true;
  
        // label first
        first:
        {
            // Illegal statement here as label second is not introduced yet break second;
            second:
            {
                third:
                {
                    // Before break
                    System.out.println("Before the break statement");
  
                    // break will take the control out of second label
                    if (t)
                        break second;
                    System.out.println("This won't execute.");
                }
                System.out.println("This won't execute.");
            }
  
            // First block
            System.out.println("This is after second block.");
        }
  
    }
}
