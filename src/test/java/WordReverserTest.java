import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class WordReverserTest {
    WordReverser wordReverser;

    @BeforeEach

    void setup () {
        wordReverser = new WordReverser();
    }

    //Schrijf dan in de WordReverserTest testklasse de nodige code om een “Parametrized Test” te maken waar je de
    //method gaat testen.
    @ParameterizedTest(name = "Created String = {0}")
    @CsvSource(value = {"Hello"})
    void shouldReturnEqualsWhenStringIsNormal(String string) {

        String result = wordReverser.wordToReverse("olleH");
        assertEquals(result, string);

    }
    @ParameterizedTest(name = "Created String = {0}")
    @CsvSource(value = {"Hello"})
    void shouldReturnEqualsWhenStringWasReversed(String string) {

        String result = wordReverser.wordToReverse("Hello");
        assertNotEquals(result, string);
    }
}