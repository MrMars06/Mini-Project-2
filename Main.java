import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    // This adds the Scanner to the code
    Scanner scan = new Scanner(System.in);


    // The code below asks you what my name and age is using Scanner
    System.out.println("What's your first name?");
    String name = scan.next();

    System.out.println("What's your age?");
    int age = scan.nextInt();

    // The code below is the if else statement that appear after you enter your age with Scanner
    if(age == 9) {
      System.out.println("Congratulations! You are officially part of the nine year old army!");

    } else if(age > 9) {
        System.out.println("Congratulations! Wow, you are automatically part of the 19 year old army!");
    }

    // This for Loop will activate if you say that you're a 9 year old with Scanner
    if(age == 9) {
      for(int i = 0; i < 3; i++) {
        System.out.println("Tired I am, defend the nation with the 9 yr olds, you will.");
      }
    }
  }
}