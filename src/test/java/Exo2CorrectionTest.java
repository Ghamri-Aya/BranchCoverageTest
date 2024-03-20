import org.example.Exo2;
import org.example.Exo2Correction;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo2CorrectionTest {

    @Test
    public void LengthOfTheTwoStringAreInequal() {
        assertFalse(Exo2Correction.isAnagram("azerty", "az"));
    }

    @Test
    public void SameLetterqAndDifferentFrequency() {
        assertFalse(Exo2Correction.isAnagram("aabbcc", "aabbc"));
    }

    @Test
    public void IsAnagramReturnsTrue() {
        assertTrue(Exo2Correction.isAnagram("", ""));
        assertTrue(Exo2Correction.isAnagram("listen", "silent"));
        assertTrue(Exo2Correction.isAnagram("LISTEN", "silent"));
        assertTrue(Exo2Correction.isAnagram("LISTEN", "SILENT"));
        assertTrue(Exo2Correction.isAnagram("LIS TEN", "S ILE NT"));
    }

    @Test
    public void IsAnagramReturnsFalse() {
        assertFalse(Exo2Correction.isAnagram("azerty", "querty"));
    }


    @Test
    public void ThrowExceptionIfOneOfTheStringsIsNull() {
        assertThrows(NullPointerException.class, () -> Exo2Correction.isAnagram(null, ""));
        assertThrows(NullPointerException.class, () -> Exo2Correction.isAnagram("", null));
        assertThrows(NullPointerException.class, () -> Exo2Correction.isAnagram(null, null));
    }

    @Test
    public void ThrowExceptionIfBothAreNull() {
        assertThrows(NullPointerException.class, () -> Exo2Correction.isAnagram(null, null));
    }
}

