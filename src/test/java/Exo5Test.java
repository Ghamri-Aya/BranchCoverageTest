import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.Exo5;


public class Exo5Test {
    @Test
    public void ThrowsExceptionForInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> Exo5.toRoman(0));
        assertThrows(IllegalArgumentException.class, () -> Exo5.toRoman(-10));
        assertThrows(IllegalArgumentException.class, () -> Exo5.toRoman(4000));
    }

    @Test
    public void TestWithValidInput() {
        assertEquals("I", Exo5.toRoman(1));
        assertEquals("IV", Exo5.toRoman(4));
        assertEquals("V", Exo5.toRoman(5));
        assertEquals("IX", Exo5.toRoman(9));
        assertEquals("X", Exo5.toRoman(10));
        assertEquals("XL", Exo5.toRoman(40));
        assertEquals("L", Exo5.toRoman(50));
        assertEquals("XC", Exo5.toRoman(90));
        assertEquals("C", Exo5.toRoman(100));
        assertEquals("CD", Exo5.toRoman(400));
        assertEquals("D", Exo5.toRoman(500));
        assertEquals("CM", Exo5.toRoman(900));
        assertEquals("M", Exo5.toRoman(1000));
    }
}
