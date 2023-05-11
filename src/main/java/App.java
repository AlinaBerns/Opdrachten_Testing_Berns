public class App {
    public static void main(String[] args) {
        NumbersClass numbersClass = new NumbersClass();
        System.out.println(numbersClass.minInArray(new int[]{5,3,1}));

        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome("Hello my name is Alina"));
    }
}
