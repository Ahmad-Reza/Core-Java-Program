package practical_part;

public class ArraysProgram {
     
    public static void main(String[] args) {
        // declares an Array of integers.
        int[] arr; 
          
        // allocating memory for 5 integers.
        arr = new int[5]; 
            
        // initialize the first elements of the array
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
            
        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at index " + i + " : "+ arr[i]);   
            
        // Java program to illustrate creating an array of objects
        Student[] std; // declaration
        std = new Student[5]; // allocating memory
  
        // initialization...
        std[0] = new Student(1, "Ahmad"); 
        std[1] = new Student(2, "vaibhav");
        std[2] = new Student(3, "shikar");
        std[3] = new Student(4, "dharmesh");
        std[4] = new Student(5, "mohit");
  
        // accessing the elements of the specified array
        for (int i = 0; i < std.length; i++)
            System.out.println("Element at " + i + " : " + std[i].roll_no +" "+ std[i].name);

        // 2-D arrays exam..
        int[][] array = { { 1, 2 }, { 3, 4 } }; //[row][column]
  
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(array[i][j] + " ");
            }

            System.out.println(); 
        }
        //o/p: 1 2
        //     3 4

        // Jagged Array: A jagged array is an array of arrays such that member arrays can be of different sizes,
        // i.e., we can create a 2-D array but with a variable number of columns in each row.
        int jaggArr[][] = new int[2][];
 
        // Making the above array Jagged
 
        // First row has 3 columns
        jaggArr[0] = new int[3];
 
        // Second row has 2 columns
        jaggArr[1] = new int[2];
 
        // Initializing array
        int count = 0;
        for (int i = 0; i < jaggArr.length; i++)
            for (int j = 0; j < jaggArr[i].length; j++)
            jaggArr[i][j] = count++;
 
        // Displaying the values of 2D Jagged array
        System.out.println("Contents of 2D Jagged Array");
        for (int i = 0; i < jaggArr.length; i++) {
            for (int j = 0; j < jaggArr[i].length; j++)
                System.out.print(jaggArr[i][j] + " ");
            System.out.println();
        }
        // o/p: Contents of 2D Jagged Array
        //      0 1 2 
        //      3 4 
    }
}

class Student {
    public int roll_no;
    public String name;
    Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }
}
