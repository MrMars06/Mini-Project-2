import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("What's your first name?");
    String name = scan.next();

    System.out.println("What's your age?");
    int age = scan.nextInt();

    if(age == 9) {
      System.out.println("Congratulations! You are officially part of the nine year old army!");

    } else if(age > 9) {
        System.out.println("Wow, you are automatically part of the 19 year old army! Congratulations!");
    }
  }
}