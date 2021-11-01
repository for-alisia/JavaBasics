import java.util.Scanner;

public class Square {
  public static void main(String[] args) {
    System.out.println("Let's count a square!");
    Scanner input = new Scanner(System.in);

    double width = 0;
    double height = 0;

    while(width <= 0) {
      System.out.println("Provide a valid width:");
      width = input.nextDouble();
    }

    while(height <= 0) {
      System.out.println("Provide a valid height:");
      height = input.nextDouble();
    }

    double square = width * height;
    input.close();

    System.out.println("Square is " + square);

  }
}
