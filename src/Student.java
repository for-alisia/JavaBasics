public class Student {
  String firstName;
  String lastName;
  int yearStart;
  int yearEnd;
  double GPA;
  String speciality;

  public Student(String firstName, String lastName, int yearStart, String speciality) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.yearStart = yearStart;
    this.speciality = speciality;

    if (speciality.equals("Programming")) {
      this.yearEnd = this.yearStart + 6;
    } else {
      this.yearEnd = this.yearStart + 5;
    }
  }

  public String getFullName() {
    return this.firstName + " " + this.lastName;
  }

  public void setGPA(double GPA) {
    this.GPA = GPA;
    if (GPA <= 2.5) {
      this.yearEnd = this.yearEnd + 1;
      System.out.println(this.getFullName() + ": the year of graduating was increased to " + this.yearEnd);
    }
    System.out.println(this.getFullName() + ": GPA was updated to " + this.GPA);
  }
}
