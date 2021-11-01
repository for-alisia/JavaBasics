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
    boolean isReset = true;
    // Strring concatination
    String fullName = firstName + " " + lastName;

    // Show info about the student
    System.out.println("Student " + fullName + " (" + studentAge + " years old)");
    System.out.println("Student (" + firstInitial + lastInitial +") GPA: " + studentGPA);

    // Get some input from user
    // use the special Scanner type (needs to be imported)
    Scanner input = new Scanner(System.in);
    // While loop
    while(isReset) {
      System.out.println("Reset GPA? Print no to exit without reset");
      String userReset = input.next();

      // Check the user's answer (not case sensitive with toLowerCase)
      if (userReset.toLowerCase().equals("no")) {
        isReset = false;
      } else {
        System.out.println("Please update student GPA:");
        // Save the answer to a variable
        studentGPA = input.nextDouble();
      }
    }

    // Conditional statement
    if (studentGPA <= 3.5) {
      // In Java we have block scoping (like in JS with let and const)
      String blockScopedVar = "This var is available only inside if statement";
      System.out.println(blockScopedVar);
      hasGoodMarks = false;
    }

    // Show updated info to a user
    System.out.println("Updated GPA: " + studentGPA);
    System.out.println(fullName + " has good marks: " + hasGoodMarks);
   
    // close stream
    input.close();
    System.out.println("Thank you for updating data");
    
  }
}
