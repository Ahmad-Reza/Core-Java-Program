package practical_part;

import java.util.Scanner;

public class CommandLineArguments {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); 

        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        System.out.print("Enter your height: ");
        float height = scan.nextFloat();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    
    }
}
/**
o/p: Enter your name: Ahmad
     Enter your age:  22
     Enter your height: 6.5
     Name: Ahmad
     Age: 22
     Height: 6.5
 */