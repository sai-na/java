//Remove all duplicates from a given string
//https://practice.geeksforgeeks.org/problems/remove-all-duplicates-from-a-given-string4321/1

import java.util.*;

class RemoveAllDuplicatesFromAGivenString {

  public static void main(String args[]) {
    String userInput;

    List<String> stringList = new ArrayList<String>();

    System.out.println("input char");
    Scanner sc = new Scanner(System.in);
    userInput = sc.nextLine();

    for (int i = 0; i < userInput.length(); i++) {
      if (!stringList.contains(String.valueOf(userInput.charAt(i)))) {
        stringList.add(String.valueOf(userInput.charAt(i)));
      }
    }

    for (String str : stringList) {
      System.out.print(str);
    }
  }
}
