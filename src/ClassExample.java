public class ClassExample {
  // static variable
  static int numberOfSides = 3;
  // Attributes (instance variables)
  double base;
  double height;
  double sideOne;
  double sideTwo;
  double sideThree;
  // Constructor
  public ClassExample(double base, double height, double sideOne, double sideTwo, double sideThree) {
    this.base = base;
    this.height = height;
    this.sideOne = sideOne;
    this.sideTwo = sideTwo;
    this.sideThree = sideThree;                   
  }
  // Instance method (can be called on onstance, and not n class itself)
  public double findArea() {
    return (this.base * this.height) / 2;
  }

}
