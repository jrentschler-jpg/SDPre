public class Objective8Lab3 {
  public static void main(String[] args) {
    int counter = 0;

    while(counter <= 19) {
      counter = counter + 1;
      System.out.println(counter);

      for(int i=0; i<=19; i++){

        if(i%2==1) {
          System.out.println(i + " is odd ");

        }
      }
      for(int i=0; i<19; i++) {
        if(i%2==0) {
          System.out.println(i + " is even ");
        }
      }
    }
  }
}
