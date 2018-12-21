import java.util.Scanner;

public class Objective3Lab5 {
  public static void main(String [] args){
    double firstNumber, secondNumber, total;

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a number: ");
    firstNumber = input.nextDouble();
    System.out.println("Please enter another number: ");
    secondNumber = input.nextDouble();
    total = firstNumber + secondNumber;
    System.out.println("The sum of " + firstNumber + " + " + secondNumber + " = " + total);
  }
}
