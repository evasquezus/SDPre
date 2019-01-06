import java.util.Scanner;

public class Objective7Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while(true){

      int userChoice;

      printMenu();
      userChoice= scanner.nextInt();

      if(userChoice == 1) {
          System.out.println("Hello World ");
          }
      else if(userChoice == 2) {
          System.out.println("Apple, Banana, Coconut ");
          }
      else if(userChoice == 3) {
          System.out.println("Goodbye ");
          break;
      }
      else {
          System.out.println(" try a number from 1-3 ");
      }
    }

    scanner.close();

  }

  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}
