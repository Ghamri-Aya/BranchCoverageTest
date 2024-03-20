import org.example.Exo2;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo2Test {
    @Test
    public void LengthOfTheTwoStringAreInequal() {
        assertFalse(Exo2.isAnagram("azerty", "az"));
    }

    @Test
    public void SameLetterqAndDifferentFrequency() {
        assertFalse(Exo2.isAnagram("aabbcc", "aabbc"));
    }

    @Test
    public void IsAnagramReturnsTrue() {
        assertTrue(Exo2.isAnagram("", ""));
        assertTrue(Exo2.isAnagram("listen", "silent"));
        assertTrue(Exo2.isAnagram("LISTEN", "silent"));
        assertTrue(Exo2.isAnagram("LISTEN", "SILENT"));
        assertTrue(Exo2.isAnagram("LIS TEN", "S ILE NT"));
    }

    @Test
    public void IsAnagramReturnsFalse() {
        assertFalse(Exo2.isAnagram("azerty", "querty"));
    }

    @Test
    public void ThrowExceptionIfOneOfTheStringsIsNullOrBoth() {
        assertThrows(NullPointerException.class, () -> Exo2.isAnagram(null, ""));
        assertThrows(NullPointerException.class, () -> Exo2.isAnagram("", null));
    }

    @Test
    public void ThrowExceptionIfBothAreNull() {
        assertThrows(NullPointerException.class, () -> Exo2.isAnagram(null, null));
    }
}

