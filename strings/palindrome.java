import java.util.Scanner;

class StringPalindrome {

    public void palindrome() {
        String original, reverse = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string you want to check");
        original = s.next();
        int length = original.length();

        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);

        if (original.equals(reverse)) {
            System.out.println("The string is palindrome");
        } else System.out.println("The string is not palindrome");
    }


    public static void main(String[] args) {
        StringDemo obj = new StringDemo();
        obj.palindrome();
    }
}