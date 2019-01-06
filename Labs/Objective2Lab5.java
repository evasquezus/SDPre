public class Objective2Lab5{
  public static void main(String[] args){
    double side1, side2, hypotenuse;

    side1 = 20;
    side2 = 80;

    hypotenuse = Math.sqrt(side1*side1 + side2*side2);

    System.out.println("The hypotenuse of a triangle with sides 20.0 and 80.0 is " + hypotenuse);
  }
}
