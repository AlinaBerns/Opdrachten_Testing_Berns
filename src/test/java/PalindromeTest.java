import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    Palindrome palindrome;

    @BeforeEach
    void setPalindrome() {
        palindrome = new Palindrome();
    }

    @Test
    void shouldReturnTrueIfPalindrome () {
        String s = "RaR";
        boolean b = palindrome.isPalindrome(s);
        assertTrue(b);
    }

    @Test
    void shouldReturnFalseIfStringIsNull() {
        boolean b = palindrome.isPalindrome(null);
        assertFalse(b);
    }

    @Test
    void shouldReturnFalseIfWorldIsEmpty() {
        boolean b = palindrome.isPalindrome("    ");
        assertFalse(b);
    }


    @Test
    void shouldReturnFalseIfPalindromeIsUntrimmed() {
        String string = "   hello   ";
        boolean b = palindrome.isPalindrome(string);
        assertFalse(b);

    }
    @ParameterizedTest()
    @CsvSource({"LiL", "Lil"})
    void shouldReturnTrueIfWordIsCaseSensitive(String string) {
        boolean b = palindrome.isPalindrome(string);

        assertTrue(b);
    }
}