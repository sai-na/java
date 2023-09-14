public class BinaryToDecimal {
    public static void main(String[] args) {
        String binaryNumber = "101011"; // Example binary number

        // Convert binary to decimal
        int decimalNumber = Integer.parseInt(binaryNumber, 2);

        System.out.println("Binary: " + binaryNumber);
        System.out.println("Decimal: " + decimalNumber);
    }
}


class Solution {
    public int getDecimalValue(ListNode head) {
        String binaryString ="" ;
        ListNode temp = head ;
         while (temp != null) {
            binaryString += String.valueOf(temp.val);
            temp = temp.next;
        }
        return Integer.parseInt(binaryString, 2);
    }
    }

