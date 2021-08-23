public class Variables{
    // static variable
    static int num1 = 10; 

    // instance variable
    int num2 = 100;  

    void count(){
    // local variable
       int num3 = 1000; 
    
       System.out.println(num1);
       System.out.println(num2);
       System.out.println(num3);
    }

    public static void main(String[] args){
        Variables obj = new Variables();
        obj.count();
    }
}

// output: 0 0 100