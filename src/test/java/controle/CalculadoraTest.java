package controle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rocr
 */
public class CalculadoraTest {
    
    /**
     * Teste do método calcularRentabilidade da classe Calculadora.
     */
    @Test
    public void testCalcularRentabilidade() {
        System.out.println("calcularRentabilidade");
        Double valAplic = 100.0;
        Double selic = 4.25;
        Double periodo = 36.0*5;
        Calculadora instance = new Calculadora();
        Double expResult = 103.01761094104765;
        Double result = instance.calcularRentabilidade(valAplic, selic, periodo);
        assertEquals(expResult, result);
    }
    
}
