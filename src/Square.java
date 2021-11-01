import java.util.Scanner;

public class Square {
  public static void main(String[] args) {
    System.out.println("Let's count a square!");
    Scanner input = new Scanner(System.in);

    double width = 0;
    double height = 0;

    // In the loop set new width while it's not valid
    while(width <= 0) {
      System.out.println("Provide a valid (more then zero) width:");
      width = input.nextDouble();
    }
    // In the loop set new height while it's not valid
    while(height <= 0) {
      System.out.println("Provide a valid (more then zero) height:");
      height = input.nextDouble();
    }

    double square = width * height;
    input.close();

    System.out.println("Square is " + square);

  }
}
