public class Palindrome {

    private String string;

    public boolean isPalindrome(String string) {
        if(string == null || string.isEmpty() || string.isBlank()) {
            return false;
        }
        String newString = new StringBuilder(string.trim()).reverse().toString();
        return newString.equals(string);
    }
}
