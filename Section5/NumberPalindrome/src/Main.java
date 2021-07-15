public class Main {
    public static void main(String[] args) {

        //Valid tests
        NumberPalindrome.isPalindrome(11);
        NumberPalindrome.isPalindrome(-1221);
        NumberPalindrome.isPalindrome(707);

        //Invalid tests
        NumberPalindrome.isPalindrome(11212);
        NumberPalindrome.isPalindrome(0);
    }
}
