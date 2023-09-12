import java.util.*;

class Palindrome {

  public static void main(String args[]) {
    String s = "";
    Scanner sc = new Scanner(System.in);
    System.out.println("input string");
    s = sc.nextLine();

    if (isPalindrome(s) == 1) {
      System.out.println("is Palindrome");
    } else {
      System.out.println("is not Palindrome");
    }
  }

  static int isPalindrome(String S) {
    char ch;
    String strcpy = new String("");
    for (int i = 0; i < S.length(); i++) {
      ch = S.charAt(i);
      strcpy = ch + strcpy;
    }
    if (strcpy.equals(S)) {
      return 1;
    } else {
      return 0;
    }
  }
}
