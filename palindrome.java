import java.util.Scanner;

public class palindrome {
    public static boolean isPalindrome(String input) {
        String reverse = "";
        for (int i = 0; i < input.length(); i++) {
            char output = input.charAt(i);
            reverse = output + reverse;
        }
        return input.equals(reverse);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.next();
        System.out.println(isPalindrome(input));
    }
}
