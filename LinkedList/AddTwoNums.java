import java.util.*;

public class AddTwoNums {

  public static void main(String args[]) {
    Node node1 = new Node(1);
    Node node2 = new Node(2);
    node1.next = node2;
    node2.next = null;

    Node node3 = new Node(4);
    Node node4 = new Node(5);
    node3.next = node4;
    node4.next = null;

    Node firstll = node1;
    Node secondll = node3;
    printLink(firstll);
    printLink(secondll);

    Node sumll = addNodes(firstll, secondll);
  }

  static Node addNodes(Node first, Node second) {
    String firstNode = "";
    String secondNode = "";

    Node temp1 = first;
    Node temp2 = second;

    while (temp1.next != null) {
      firstNode += String.valueOf(temp1.data);
      temp1 = temp1.next;
      if (temp1.next == null) {
        firstNode += String.valueOf(temp1.data);
      }
    }

    while (temp2.next != null) {
      secondNode += String.valueOf(temp2.data);
      temp2 = temp2.next;
      if (temp2.next == null) {
        secondNode += String.valueOf(temp2.data);
      }
    }

    int firstInt = Integer.parseInt(firstNode);
    int secondInt = Integer.parseInt(secondNode);
    int sum = firstInt + secondInt;

    System.out.println(sum);

    String sumString = String.valueOf(sum);

    Node head = null;

    for (int i = sumString.length() - 1; i >= 0; i--) {
      int digit = Character.getNumericValue(sumString.charAt(i));
      Node newNode = new Node(digit);
      newNode.next = head;
      head = newNode;
    }

    printLink(head);

    return temp2;
  }

  static String reverseString(String original) {
    char[] reverseArray = new char[original.length()];
    for (int i = 0; i < original.length(); i++) {
      reverseArray[i] = original.charAt(original.length() - 1 - i);
    }
    String reverseStr = new String(reverseArray);
    return reverseStr;
  }

  static void printLink(Node head) {
    Node temp = head;

    while (temp.next != null) {
      System.out.println(temp.data);
      temp = temp.next;
      if (temp.next == null) {
        System.out.println(temp.data);
      }
    }
  }
}
