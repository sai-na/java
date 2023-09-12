//String  Reverse a string using Stack

import java.util.*;

class ReverseWithStack {

  public static void main(String args[]) {
    String userInput;

    List<String> stringList = new ArrayList<String>();

    System.out.println("input char");
    Scanner sc = new Scanner(System.in);
    userInput = sc.nextLine();

    // Creating a Stack
    Stack<String> stackName = new Stack<String>();
    String reverseString = new String("");

    for (int i = 0; i < userInput.length(); i++) {
      stackName.push(String.valueOf(userInput.charAt(i)));
    }

    while (!stackName.empty()) {
      reverseString += stackName.pop();
    }
    System.out.println(reverseString);
  }
}
