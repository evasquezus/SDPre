import java.util.Scanner;

public class Objective5Lab1 {
  public static void main(String[] args) {
    Scanner date = new Scanner(System.in);
    int month;


    System.out.println( "Please enter a month 1-12");
    month = date.nextInt();

    switch (month) {
      case 1:
        System.out.println("January");
        break;
      case 2:
        System.out.println("February");
        break;
      case 3:
        System.out.println("March");
        break;
      case 4:
        System.out.println("April");
        break;
      case 5:
        System.out.println("May");
        break;
      case 6:
        System.out.println("June");
        break;
      default:
        System.out.println("That is not a valid month");
        break;
    }
  }
}
