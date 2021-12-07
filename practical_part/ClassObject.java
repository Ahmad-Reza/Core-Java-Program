package practical_part;

public class ClassObject {
    // Instance Variables
    String name;
    String breed;
    int age;
    String color;
 
    // Constructor Declaration of Class
    public ClassObject(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }
 
    // method 1
    public String getName() {
        return name;
    }
 
    // method 2
    public String getBreed() {
        return breed;
    }
 
    // method 3
    public int getAge() {
        return age;
    }
 
    // method 4
    public String getColor() {
        return color;
    }
 
    @Override
    public String toString() {
        return("Name "+ this.getName() + ".\nbreed,age and color are " + this.getBreed()+"," + this.getAge()+ ","+ this.getColor());
    }
    public static void main(String[] args) {
    
        /**
        * Initializing an object: 
        * The new operator instantiates a class by allocating memory for a new object and returning a reference to that memory.
        * The new operator also invokes the class constructor. 
        */

        ClassObject tuffy = new ClassObject("Jacline","papillon", 5, "white");
        System.out.println(tuffy.toString());
        
    }
}
