import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    Palindrome palindrome;

    @BeforeEach
    void setPalindrome() {
        palindrome = new Palindrome();
    }

    @ParameterizedTest
    @ValueSource(strings = {"Hello"})
    void shouldReturnFalseIfStringIsNull (String string) {
        boolean b = string == null;
        assertFalse(b);
    }

}