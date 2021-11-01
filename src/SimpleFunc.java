import java.util.Scanner;

public class SimpleFunc {
  public static double calculateMealPrice(double listedMealPrice, double tips, double tax) {
    double tipPrice = listedMealPrice * tips;
    double taxPrice = listedMealPrice * tax;
    double totalPrice = listedMealPrice + tipPrice + taxPrice;
    return totalPrice;
  }

  public static void announceDeveloperTeaTime(Scanner input) {
    System.out.println("Waiting for developer tea time...");
    System.out.println("Type a random word to start");
    input.next();
    System.out.println("Let's have tea!!!");
  }

  public static void workAsDeveloper() {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to your new job!");
    System.out.println("Write a code");
    announceDeveloperTeaTime(input);
    System.out.println("Debug your code");
    System.out.println("Write tests for your code");
    announceDeveloperTeaTime(input);
    System.out.println("Good job for today!");
  }

  public static void payForMeal() {
    Scanner input = new Scanner(System.in);
    System.out.println("Provide a cost of the meal:");
    double mealCost = input.nextDouble();
    System.out.println("Provide how much tips do you want to pay (percentage):");
    double tips = input.nextDouble() / 100;
    System.out.println("Provide a tax rate (percentage):");
    double tax = input.nextDouble() / 100;
    double total = calculateMealPrice(mealCost, tips, tax);
    System.out.println("Total cost is " + total);
    int person = 0;
  
    while (person <= 0) {
      System.out.println("For how many person do you want to split a bill? (provide a positive number)");
      person = input.nextInt();
    }

    System.out.println("Each person needs to pay " + total / person);
    input.close();
  }
  public static void main(String[] args) {
    workAsDeveloper();
    payForMeal();
  }
}
