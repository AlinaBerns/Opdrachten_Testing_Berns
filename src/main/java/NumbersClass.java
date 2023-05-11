import java.util.Arrays;
import java.util.OptionalInt;

public class NumbersClass {

    public NumbersClass() {
    }

    public Result checkOfNummerPositiefOfNegaties (int integer) {

        if (integer > 0) {
            return Result.POSITIVE;
        } else if (integer < 0) {
            return Result.NEGATIVE;
        } else {
            return Result.ZERO;
        }
    }

    public Result checkOfNumberIsOddOrEven (int i){
        if ((i%2) == 0) {
            return Result.EVEN;
        } else {
            return Result.ODD;
        }
    }
    //Schrijf een method die het kleinste getal vind in een array
    public OptionalInt minInArray (int [] array) {
        return Arrays.stream(array).min();
    }
}
