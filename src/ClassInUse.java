public class ClassInUse {
  public static void main(String[] args) {
    // Create instances of a class
    ClassExample triangleA = new ClassExample(15, 8, 15, 8, 17);
    ClassExample triangleB = new ClassExample(3, 2.598, 3, 3, 3);
    // Call instance method
    double areaA = triangleA.findArea();
    System.out.println(areaA);
    double areaB = triangleB.findArea();
    System.out.println(areaB);
    // Attributes (instance variables)
    System.out.println(triangleA.base);
    System.out.println(triangleB.base);
    // Static variable
    System.out.println(ClassExample.numberOfSides);
  }
}
