import java.util.*;

class VowelsAndConsonants {

  public static void main(String args[]) {
    String userInput;
    int vowelCount = 0;

    String[] vowels = { "A", "I", "E", "o", "U", "a", "i", "e", "o", "u" };

    List<String> vowelsList = Arrays.asList(vowels);

    System.out.println("input char");
    Scanner sc = new Scanner(System.in);
    userInput = sc.nextLine();

    for (int i = 0; i < userInput.length(); i++) {
      if (vowelsList.contains(String.valueOf(userInput.charAt(i)))) {
        vowelCount++;
      }
    }

    int consonantCount = userInput.length() - vowelCount;

    System.out.println(
      "Vowels Count: " + vowelCount + " , Consonant Count: " + consonantCount
    );
  }
}
