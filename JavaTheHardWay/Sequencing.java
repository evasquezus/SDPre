import java.util.Scanner;

public class Sequencing{
  public static void main( String[] args){

    Scanner keyboard = new Scanner(System.in);
    double price, salesTax, total;

    System.out.print("How much is the purchase price? " );
    price = keyboard.nextDouble();

    salesTax = price * 0.0825;
    total = price + salesTax;



      System.out.print("Item price: \t" +  price );
      System.out.print("Sales tax: \t+ " + salesTax );
      System.out.print("Total cost: \t" + total );
  }
}
