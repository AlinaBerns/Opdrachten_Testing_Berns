import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.OptionalInt;

import static org.junit.jupiter.api.Assertions.*;

class NumbersClassTest {
    private NumbersClass numbersClass;

    @BeforeEach
    void setup() {
        numbersClass = new NumbersClass();
    }

    @Test
    void shouldReturnEqualsWhenNumberIsPositive() {
        Result result = Result.POSITIVE;
        assertEquals(result, numbersClass.checkOfNummerPositiefOfNegaties(5));
    }

    @Test
    void shouldReturnEqualsWhenNumberIsNegative() {
        Result result = Result.NEGATIVE;
        assertEquals(result, numbersClass.checkOfNummerPositiefOfNegaties(-14));
    }

    @Test
    void shouldReturnEqualsWhenNumberIsZero() {
        Result result = Result.ZERO;
        assertEquals(result, numbersClass.checkOfNummerPositiefOfNegaties(0));
    }

    @ParameterizedTest(name = "num1={0}, num2={1}, num3={2}")
    @ValueSource(ints = {8, 4, 2})
    void shouldReturnEqualsWhenNumberIsEven(int integer) {
        Result result = Result.EVEN;
        assertEquals(result, numbersClass.checkOfNumberIsOddOrEven(integer));
    }

    @ParameterizedTest(name = "num1={0}, num2={1}, num3={2}")
    @ValueSource(ints = {9, 3, 1})
    void shouldReturnEqualsWhenNumberIsOdd(int integer) {
        Result result = Result.ODD;
        assertEquals(result, numbersClass.checkOfNumberIsOddOrEven(integer));
    }

    @Test
    void shouldReturnEqualsWhenMinOfArraysAreTheSame() {

        OptionalInt result = numbersClass.minInArray(new int[]{1, 3, 5});
        int[] integers = new int[]{5, 4, 1};
        OptionalInt actual = Arrays.stream(integers).min();

        assertEquals(result, actual);
    }

    @Test
    void shouldReturnEqualsWhenMinOfArrayIsZero() {

        OptionalInt optionalInt = OptionalInt.of(0);
        OptionalInt result = numbersClass.minInArray(new int[]{0, 3, 5});

        assertEquals(result, optionalInt);
    }

    @Test
    void shouldReturnTrueWhenMinOfArrayIsNegative() {

        int value = 0;
        boolean b = false;

        OptionalInt result = numbersClass.minInArray(new int[]{-1, 3, 5});
        if (result.isPresent()) {
            value = result.getAsInt();
        }
        if (value < 0) {
            b = true;
        }
        assertTrue(b, "Number is POSITIVE");
    }

    @Test
    void shouldReturnTrueWhenMinOfArrayIsPositive() {

        int value = 0;
        boolean b = false;

        OptionalInt result = numbersClass.minInArray(new int[]{1, 3, 5});
        if (result.isPresent()) {
            value = result.getAsInt();
        }
        if (value > 0) {
            b = true;
        }
            assertTrue(b, "Number is NEGATIVE");
    }
}


