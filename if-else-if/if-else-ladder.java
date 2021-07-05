import java.util.Scanner;

class Main {
  public void grade() {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your marks....");
    int input = s.nextInt();
        if (input < 25) {
            System.out.println("You are a failure");
        } else if (input > 25 && input < 45) {
            System.out.println("You are of the E Class");
        } else if (input > 45 && input < 50) {
            System.out.println("You are of the D class");
        } else if (input > 50 && input < 60) {
            System.out.println("You are of the C Class");
        } else if (input > 60 && input < 80) {
            System.out.println("You are of the B Class");
        } else if (input > 80 && input <= 100) {
            System.out.println("You are of the A class");
        } else {
            System.out.println("No class");
        }
  }
  
  public static void main(String[] args) {
    Main Obj = new Main();
    Obj.grade();
  }
}