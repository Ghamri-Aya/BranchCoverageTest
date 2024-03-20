import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.Exo5Correction;


public class Exo5CorrectionTest {
    @Test
    public void ThrowsExceptionForInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> Exo5Correction.toRoman(0));
        assertThrows(IllegalArgumentException.class, () -> Exo5Correction.toRoman(-10));
        assertThrows(IllegalArgumentException.class, () -> Exo5Correction.toRoman(4000));
    }

    @Test
    public void TestWithValidInput() {
        assertEquals("I", Exo5Correction.toRoman(1));
        assertEquals("IV", Exo5Correction.toRoman(4));
        assertEquals("V", Exo5Correction.toRoman(5));
        assertEquals("IX", Exo5Correction.toRoman(9));
        assertEquals("X", Exo5Correction.toRoman(10));
        assertEquals("XL", Exo5Correction.toRoman(40));
        assertEquals("L", Exo5Correction.toRoman(50));
        assertEquals("XC", Exo5Correction.toRoman(90));
        assertEquals("C", Exo5Correction.toRoman(100));
        assertEquals("CD", Exo5Correction.toRoman(400));
        assertEquals("D", Exo5Correction.toRoman(500));
        assertEquals("CM", Exo5Correction.toRoman(900));
        assertEquals("M", Exo5Correction.toRoman(1000));
    }
}
