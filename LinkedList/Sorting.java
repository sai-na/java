//https://practice.geeksforgeeks.org/problems/absolute-list-sorting/1
import java.util.*;

public class Sorting {

  public static void main(String args[]) {
    Node node1 = new Node(10);
    Node node2 = new Node(20);
    node1.next = node2;
    Node node3 = new Node(-3);
    node2.next = node3;
    Node node4 = new Node(50);
    node3.next = node4;
    Node node5 = new Node(3);
    node4.next = node5;
    Node sorted = sortll(node1);
  }

  static Node sortll(Node head) {
    if (head == null) {
      return null;
    }

    boolean swapped;
    Node current;
    Node temp = null;

    do {
      swapped = false;
      current = head;

      while (current.next != temp) {
        if (current.data > current.next.data) {
          int tempData = current.data;
          current.data = current.next.data;
          current.next.data = tempData;
          swapped = true;
        }
        current = current.next;
      }
      temp = current;
    } while (swapped);

    System.out.println("Sorted List");
    while (head != null) {
      System.out.println(head.data);
      head = head.next;
    }
    return head;
  }
}
