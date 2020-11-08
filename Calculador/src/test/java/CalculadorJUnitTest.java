
import calculador.Operaciones;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculadorJUnitTest {
    Operaciones Calcular = new Operaciones();
    public CalculadorJUnitTest() {
    }

    @Test
    public void testsuma1() {
        assertEquals(10, Calcular.suma(6,4));
    }

    @Test
    public void testsuma2() {
        assertEquals(5, Calcular.suma(3,2));
    }

    @Test
    public void testresta1() {
        assertEquals(3, Calcular.resta(6,3));
    }

    @Test
    public void testresta2() {
        assertEquals(5, Calcular.resta(8,3));
    }
    
    @Test
    public void testmultiplicacion1() {
        assertEquals(8, Calcular.multiplicacion(2,4));
    }
    
    @Test
    public void testmultiplicacion2() {
        assertEquals(10, Calcular.multiplicacion(5,2));
    }
    
    @Test
    public void testdivision1() {
        assertEquals(6, Calcular.division(12,2));
    }
    
    @Test
    public void testdivision2() {
        assertEquals(12, Calcular.division(24,2));
    }
    
    @Test
    public void testexponente1() {
        assertEquals(16, Calcular.exponente(4,2));
    }
    
    @Test
    public void testexponente2() {
        assertEquals(4, Calcular.exponente(2,2));
    }
    
}