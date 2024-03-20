import org.example.Exo1Correction;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo1CorrectionTest {

    @Test
    public void TestWithAPalindromString() {
        assertTrue(Exo1Correction.isPalindrome(""));
        assertTrue(Exo1Correction.isPalindrome("a"));
        assertTrue(Exo1Correction.isPalindrome("aya"));
        assertTrue(Exo1Correction.isPalindrome("AYA"));
        assertTrue(Exo1Correction.isPalindrome("A YA AYA A YA"));
        assertTrue(Exo1Correction.isPalindrome("a ya aya a ya"));
    }

    @Test
    public void TestWithANoPalindromString() {
        assertFalse(Exo1Correction.isPalindrome("hello"));
        assertFalse(Exo1Correction.isPalindrome("HELLO"));
        assertFalse(Exo1Correction.isPalindrome("hello world"));
        assertFalse(Exo1Correction.isPalindrome("HELLO WORLD"));
    }

    @Test
    public void TestWithANullString() {
        assertThrows(NullPointerException.class, () -> Exo1Correction.isPalindrome(null));
    }
}

