package String;

// Longest Prefix Suffix
//https://practice.geeksforgeeks.org/problems/longest-prefix-suffix2527/1

import java.util.*;

class LongestPrefixSuffix {

  public static void main(String args[]) {
    String userInput;
    String inputPrefixSub;
    String inputPostfixSub;
    String longStr = "";

    System.out.println("input char");
    Scanner sc = new Scanner(System.in);
    userInput = sc.nextLine();

    for (int i = 0; i < userInput.length(); i++) {
      inputPrefixSub = userInput.substring(0, i);
      int postfixIndex = userInput.length() - i;
      inputPostfixSub = userInput.substring(postfixIndex, userInput.length());

      if (inputPrefixSub.equals(inputPostfixSub)) {
        longStr = inputPrefixSub;
      }
    }

    if (longStr.length() != 0) {
      System.out.println("Longest Prefix Suffix:" + longStr);
    } else {
      System.out.println("Longest Prefix Suffix: not available ");
    }
  }
}
