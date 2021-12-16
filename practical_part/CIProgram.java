package practical_part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import practical_part.Student.CustomerSortingComparator;

/**
 * Sort collection by more than one field: 
 * What if we have a requirement to sort ArrayList objects in accordance with more than one field like firstly, 
 * sort according to the student name and secondly, sort according to student age.
 * 
 */

class Student {
 
    // Attributes of student
    String Name;
    int Age;
 
    public Student(String Name, Integer Age) {
        this.Name = Name;
        this.Age = Age;
    }
 
    // Getter setter methods
    public String getName() { return Name; }
 
    public void setName(String Name) { this.Name = Name; }
 
    public Integer getAge() { return Age; }
 
    public void setAge(Integer Age) { this.Age = Age; }
 
    // Overriding toString() method
    @Override 
    public String toString() {
        return "Customer{" + "Name=" + Name + ", Age=" + Age + '}';
    }
 
    // Helper class implementing Comparator interface
    static class CustomerSortingComparator implements Comparator<Student> {
        // To compare customers
        @Override
        public int compare(Student customer1, Student customer2) {
            // Comparing customers
            int NameCompare = customer1.getName().compareTo(customer2.getName());
            int AgeCompare = customer1.getAge().compareTo(customer2.getAge());
 
            // 2nd level comparison
            return (NameCompare == 0) ? AgeCompare : NameCompare;
        }
    }
}
public class CIProgram {
    public static void main(String[] args) {
        // Create an empty ArrayList to store Student
        List<Student> al = new ArrayList<>();
 
        // Create customer objects using constructor initialization
        Student obj1 = new Student("Ajay", 27);
        Student obj2 = new Student("Sneha", 23);
        Student obj3 = new Student("Simran", 37);
        Student obj4 = new Student("Ajay", 22);
        Student obj5 = new Student("Ajay", 29);
        Student obj6 = new Student("Sneha", 22);
 
        // Adding customer objects to ArrayList
        // using add() method
        al.add(obj1);
        al.add(obj2);
        al.add(obj3);
        al.add(obj4);
        al.add(obj5);
        al.add(obj6);
 
        // Iterating using Iterator before Sorting ArrayList
        Iterator<Student> custIterator = al.iterator();
 
        // Display message
        System.out.println("Before Sorting:\n");
 
        // Holds true till there is single element remaining in List
        while (custIterator.hasNext()) {
            // Iterating using next() method
            System.out.println(custIterator.next());
        }
 
        // Sorting using sort method of Collections class
        Collections.sort(al, new CustomerSortingComparator());
 
        // Display message only
        System.out.println("\n\nAfter Sorting:\n");
 
        // Iterating using enhanced for-loop after Sorting ArrayList
        for (Student customer : al) {
            System.out.println(customer);
        }
    }
}
