import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int num1 = 1, num2 = 7, num3 = 5;
    double dub1 = 1.1, dub2 = 2.2, dub3 = 3.3;
    int sum = num1 + num2 + num2;
    double total = dub1 + dub2 + dub3;

    //TODO prompt the user to get input for all of the above int variables.
    System.out.println("Please enter the first whole number you would like to add.");
    num1 = keyboard.nextInt();

    System.out.println("Please enter the second whole number you would like to add.");
    num2 = keyboard.nextInt();

    System.out.println("Please enter the the third whole number you would like to add.");
    num3 = keyboard.nextInt();

    //TODO prompt the user to get input for all of the above double variables.
    System.out.println("Please enter the first decimal number you would like to add.");
    dub1 = keyboard.nextDouble();

    System.out.println("Please enter the second decimal number you would like to add.");
    dub2 = keyboard.nextDouble();

    System.out.println("Please enter the third decimal number you would like to add.");
    dub3 = keyboard.nextDouble();

    //TODO print the three ints and their sum.
    System.out.println("The sum of " +  num1 + " + " + num2 + " + " + num3 + " = " + sum);

    //TODO print the three doubles and their sum.
    System.out.println("The sum of " + dub1 + " + " + dub2 + " + " + dub3 + " = " + total);

  }
}
