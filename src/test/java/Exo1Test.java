import org.example.Exo1;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo1Test {

    @Test
    public void TestWithAPalindromString() {
        assertTrue(Exo1.isPalindrome(""));
        assertTrue(Exo1.isPalindrome("a"));
        assertTrue(Exo1.isPalindrome("aya"));
        assertTrue(Exo1.isPalindrome("AYA"));
        assertTrue(Exo1.isPalindrome("A YA AYA A YA"));
        assertTrue(Exo1.isPalindrome("A ya aya a ya"));
    }

    @Test
    public void TestWithANoPalindromString() {
        assertFalse(Exo1.isPalindrome("hello"));
        assertFalse(Exo1.isPalindrome("HELLO"));
        assertFalse(Exo1.isPalindrome("hello world"));
        assertFalse(Exo1.isPalindrome("HELLO WORLD"));
    }

    @Test
    public void TestWithANullString() {
        assertThrows(NullPointerException.class, () -> Exo1.isPalindrome(null));
    }
}

