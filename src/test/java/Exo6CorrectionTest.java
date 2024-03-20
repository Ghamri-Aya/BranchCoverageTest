import org.example.Exo6Correction;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Exo6CorrectionTest
{

    @Test
    public void ThrowsExceptionIfTheInputIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> Exo6Correction.fizzBuzz(0));
        assertThrows(IllegalArgumentException.class, () -> Exo6Correction.fizzBuzz(-1));
    }

    @Test
    public void MultipleOf15ReturnsFizzBuzz() {
        assertEquals("FizzBuzz", Exo6Correction.fizzBuzz(15));
        assertEquals("FizzBuzz", Exo6Correction.fizzBuzz(30));
        assertEquals("FizzBuzz", Exo6Correction.fizzBuzz(45));
    }

    @Test
    public void MultipleOf3ReturnsFizz() {
        assertEquals("Fizz", Exo6Correction.fizzBuzz(3));
        assertEquals("Fizz", Exo6Correction.fizzBuzz(6));
        assertEquals("Fizz", Exo6Correction.fizzBuzz(9));
    }

    @Test
    public void MultipleOf5ReturnsBuzz() {
        assertEquals("Buzz", Exo6Correction.fizzBuzz(5));
        assertEquals("Buzz", Exo6Correction.fizzBuzz(10));
        assertEquals("Buzz", Exo6Correction.fizzBuzz(20));
    }

    @Test
    public void OtherNumbersReturnsNumberAsString() {
        assertEquals("1", Exo6Correction.fizzBuzz(1));
        assertEquals("2", Exo6Correction.fizzBuzz(2));
        assertEquals("4", Exo6Correction.fizzBuzz(4));
    }

}
