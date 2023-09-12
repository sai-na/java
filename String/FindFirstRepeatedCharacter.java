package String;

// Find first repeated character

import java.util.Scanner;

public class FindFirstRepeatedCharacter {

  public static void main(String[] args) throws Exception {
    String userInput;
    boolean flag = false;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a String");
    userInput = scanner.nextLine();
    String uniqueString = "";

    for (int i = 0; i < userInput.length(); i++) {
      if (uniqueString.indexOf(userInput.charAt(i)) == -1) {
        uniqueString += userInput.charAt(i);
        continue;
      } else {
        System.out.println(userInput.charAt(i));
        flag = true;
        break;
      }
    }

    if (!flag) {
      System.out.println("NO repeated characters");
    }
  }
}
