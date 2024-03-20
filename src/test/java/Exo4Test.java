import org.example.Exo4;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo4Test {

    @Test
    public void AEqualZero() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> Exo4.solve(0, 2, 3));
        assertEquals("a must not be zero", exception.getMessage());
    }

    @Test
    public void eltaLessThanZero() {
        double[] roots = Exo4.solve(1, 2, 3);
        assertNull(roots);
    }

    @Test
    public void DeltaEqualsZero() {
        double[] roots = Exo4.solve(1, -2, 1);
        assertNotNull(roots);
        assertEquals(1, roots.length);
        assertEquals(1.0, roots[0]);
    }

    @Test
    public void ResolveQuadraticEquationWithRealRoots() {
        double[] roots = Exo4.solve(1, -3, 2);
        assertNotNull(roots);
        assertEquals(2, roots.length);
        assertEquals(2.0, roots[0]);
        assertEquals(1.0, roots[1]);
    }
}

