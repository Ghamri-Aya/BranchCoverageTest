import org.example.Exo3;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo3Test {
    @Test
    public void ThrowExceptionIfNullArray() {
        int[] array = null;
        NullPointerException exception = assertThrows(NullPointerException.class, () -> Exo3.binarySearch(array, 10));
        assertEquals("Array must not be null", exception.getMessage());
    }

    @Test
    public void ElementPresentInTheRightSide() {
        int[] array = {10, 20, 30, 40, 50};
        assertEquals(0, Exo3.binarySearch(array, 10));
    }

    @Test
    public void ElementPresentAtMiddlePosition() {
        int[] array = {10, 20, 30, 40, 50};
        assertEquals(2, Exo3.binarySearch(array, 30));
    }

    @Test
    public void ElementPresentInTheLeftSide() {
        int[] array = {10, 20, 30, 40, 50};
        assertEquals(4, Exo3.binarySearch(array, 50));
    }

    @Test
    public void ElementNotPresent() {
        int[] array = {10, 20, 30, 40, 50};
        assertEquals(-1, Exo3.binarySearch(array, 25));
    }

    @Test
    public void EmptyArray() {
        int[] array = {};
        assertEquals(-1, Exo3.binarySearch(array, 10));
    }




}

