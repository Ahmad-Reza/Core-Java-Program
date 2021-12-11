package practical_part;

/**
 * Encapsulation: Encapsulation is defined as the wrapping up of data under a single unit. 
 * It is the mechanism that binds together code and the data it manipulates. Another way to think about encapsulation is, 
 * it is a protective shield that prevents the data from being accessed by the code outside this shield. 
 * 
 * Technically in encapsulation, the variables or data of a class is hidden from any other class and can be accessed 
 * only through any member function of its own class in which it is declared.
 * the data in a class is hidden from other classes using the data hiding concept which is achieved by making the 
 * members or methods of a class private, and the class is exposed to the end-user or the world without providing any 
 * details behind implementation using the abstraction concept, so it is also known as a combination of data-hiding and abstraction. 
 * Encapsulation can be achieved by Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables
 *
 * 
 * 
 */
public class EncapsulationProgram {
    // these can only be accessed by public methods of class
    private String userName;
    private int userRoll;
    private int userAge;
 
    // get method for age to access private variable userAge    
    public int getAge() { return userAge; }
 
    // get method for name to access private variable userName
    public String getName() { return userName; }
 
    // access private variable userRoll
    public int getRoll() { return userRoll; }
 
    // access private variable userage    
    public void setAge(int newAge) { userAge = newAge; }
 
    // set method for name access private variable userName
    public void setName(String newName) {
        userName = newName;
    }
 
    // set method for roll to access private variable userRoll
    public void setRoll(int newRoll) { userRoll = newRoll; }

    public static void main(String[] args) {
        EncapsulationProgram obj = new EncapsulationProgram();
 
        // setting values of the variables
        obj.setName("Ahmad");
        obj.setAge(19);
        obj.setRoll(51);
 
        // Displaying values of the variables
        System.out.println("name: " + obj.getName()); // Ahmad
        System.out.println("age: " + obj.getAge()); // 19
        System.out.println("roll: " + obj.getRoll()); // 51
 
        // Direct access of userRoll is not possible
        // due to encapsulation
        // System.out.println("roll: " + obj.userName);
        
    }
}

//Advantages of Encapsulation:  
//Data Hiding: The user will have no idea about the inner implementation of the class. 
// It will not be visible to the user how the class is storing values in the variables. 
// The user will only know that we are passing the values to a setter method and variables are getting initialized with that value.

//Increased Flexibility: We can make the variables of the class read-only or write-only depending on our requirement. 
// If we wish to make the variables read-only then we have to omit the setter methods like setName(), setAge(), etc. 
// or if we wish to make the variables as write-only then we have to omit the get methods like getName(), getAge(), etc.

//Reusability: Encapsulation also improves the re-usability and is easy to change with new requirements.
//Testing code is easy: Encapsulated code is easy to test for unit testing.
