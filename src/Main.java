import java.util.Scanner;

// Main class definition
public class Main {
  // main methid should be in each class
  public static void main(String[] args) {
    // Output a string to a user
    System.out.println("Student info");

    // Define variables
    // int, double, char and boolean - primitive types
    // String - reference type (capitalized letter!)
    int studentAge = 18;
    double studentGPA = 4.5;
    boolean hasGoodMarks = true;
    String firstName = "Elena";
    String lastName = "Doe";
    char firstInitial = firstName.charAt(0);
    char lastInitial = lastName.charAt(0);
    // Strring concatination
    String fullName = firstName + " " + lastName;

    // Show info about the student
    System.out.println("Student " + fullName + " (" + studentAge + " years old)");
    System.out.println("Student (" + firstInitial + lastInitial +") GPA: " + studentGPA);

    // Get some input from user
    // use the special Scanner type (needs to be imported)
    Scanner input = new Scanner(System.in);
    System.out.println("Please update student GPA:");
    // Save the answer to a variable
    studentGPA = input.nextDouble();
    // Close a stream
    input.close();

    // Conditional statement
    if (studentGPA <= 3.5) {
      hasGoodMarks = false;
    }

    // Show updated info to a user
    System.out.println("Updated GPA: " + studentGPA);
    System.out.println(fullName + " has good marks: " + hasGoodMarks);

    
  }
}
