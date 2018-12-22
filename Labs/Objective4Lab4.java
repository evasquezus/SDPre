import java.util.Scanner;

public class Objective4Lab4{
  public static void main( String[] args){
    Scanner number = new Scanner(System.in);
    int num;

    System.out.println( "Please enter a number: ");
    num = number.nextInt();

    if(num % 2== 0 ){
      System.out.println( "The number is even");
    }
    else{
      System.out.println( "The number is odd");
    }

    }
  }
