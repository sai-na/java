//Move Last Element to Front of a Linked List
import java.util.*;

public class MoveLastToFirst {

  public static void main(String args[]) {
    LinkedList<String> al = new LinkedList<String>();
    al.add("1");
    al.add("2");
    al.add("3");
    al.add("4");

    // Iterator<String> itr=al.iterator();
    // while(itr.hasNext()){
    //   System.out.println(itr.next());
    //  }

    System.out.println(al);
    String lastElement = al.pollLast();
    al.add(0, lastElement);
    System.out.println(al);
    //    Iterator<String> itr2=al.iterator();
    //   while(itr2.hasNext()){
    //  System.out.println(itr2.next());
    // }

  }
}
