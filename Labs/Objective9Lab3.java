import java.util.Scanner;
public class Objective9Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while(true){
      selection = scanner.nextInt();
      System.out.println("Hello Human");

      selection = scanner.nextInt();
      System.out.println("Apples, Bananas, Coconuts");

      selection = scanner.nextInt();
      System.out.println("Goodbye");


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
