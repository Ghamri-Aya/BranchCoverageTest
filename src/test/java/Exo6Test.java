import org.example.Exo6;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Exo6Test
{

    @Test
    public void ThrowsExceptionIfTheInputIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> Exo6.fizzBuzz(0));
        assertThrows(IllegalArgumentException.class, () -> Exo6.fizzBuzz(-1));
    }

    @Test
    public void MultipleOf15ReturnsFizzBuzz() {
        assertEquals("FizzBuzz", Exo6.fizzBuzz(15));
        assertEquals("FizzBuzz", Exo6.fizzBuzz(30));
        assertEquals("FizzBuzz", Exo6.fizzBuzz(45));
    }

    @Test
    public void MultipleOf3ReturnsFizz() {
        assertEquals("Fizz", Exo6.fizzBuzz(3));
        assertEquals("Fizz", Exo6.fizzBuzz(6));
        assertEquals("Fizz", Exo6.fizzBuzz(9));
    }

    @Test
    public void MultipleOf5ReturnsBuzz() {
        assertEquals("Buzz", Exo6.fizzBuzz(5));
        assertEquals("Buzz", Exo6.fizzBuzz(10));
        assertEquals("Buzz", Exo6.fizzBuzz(20));
    }

    @Test
    public void OtherNumbersReturnsNumberAsString() {
        assertEquals("1", Exo6.fizzBuzz(1));
        assertEquals("2", Exo6.fizzBuzz(2));
        assertEquals("4", Exo6.fizzBuzz(4));
    }

}
