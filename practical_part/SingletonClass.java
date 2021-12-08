package practical_part;

/**
 * Singleton classes: As the name implies, a class is said to be singleton if it limits the number of objects of that class to one. 
 * We can’t have more than a single object for such classes. 
 * Singleton classes are employed extensively in concepts like Networking and Database Connectivity.
 * 
 * The constructor of singleton class would be private so there must be another way to get the instance of that class. 
 * This problem is resolved using a class member instance and a factory method to return the class member.
 * 
 */
public class SingletonClass {
    static SingletonClass instance = null;
    public int x = 10;
    
    // private constructor can't be accessed outside the class
    private SingletonClass() {  }
   
    // Factory method to provide the users with instances
    static public SingletonClass getInstance()
    {
        if (instance == null)        
             instance = new SingletonClass();
   
        return instance;
    } 

    public static void main(String[] args) {
        SingletonClass a = SingletonClass.getInstance();
        SingletonClass b = SingletonClass.getInstance();

        a.x = a.x + 10;

        System.out.println("Value of a.x = " + a.x); // 20
        System.out.println("Value of b.x = " + b.x); // 20
    }
}
