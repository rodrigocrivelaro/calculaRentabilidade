/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rocr
 */
public class JFrameCalculadoraTest {
    
    /**
     * Teste do método main da classe JFrameCalculadora.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        JFrameCalculadora.main(args);
    }

    /**
     * Teste do método isValor da classe JFrameCalculadora.
     * passando caracteres como parâmetro
     */
    @org.junit.jupiter.api.Test
    public void testIsValorPassandoCaractere() {
        System.out.println("isValor");
        String valor = "rsdfsdf";
        JFrameCalculadora instance = new JFrameCalculadora();
        boolean expResult = false;
        boolean result = instance.isValor(valor);
        assertEquals(expResult, result);
    }
    
    /**
     * Teste do método isValor da classe JFrameCalculadora.
     * passando número inteiro como parâmetro
     */
    @org.junit.jupiter.api.Test
    public void testIsValorPassandoNumeroInteiro() {
        System.out.println("isValor");
        String valor = "365";
        JFrameCalculadora instance = new JFrameCalculadora();
        boolean expResult = true;
        boolean result = instance.isValor(valor);
        assertEquals(expResult, result);
    }
    
    /**
     * Teste do método isValor da classe JFrameCalculadora.
     * passando um Double como parâmetro
     */
    @org.junit.jupiter.api.Test
    public void testIsValorPassandoDouble() {
        System.out.println("isValor");
        String valor = "365.5";
        JFrameCalculadora instance = new JFrameCalculadora();
        boolean expResult = true;
        boolean result = instance.isValor(valor);
        assertEquals(expResult, result);
    }
    
    /**
     * Teste do método isValor da classe JFrameCalculadora.
     * passando número com vírgula como parâmetro
     */
    @org.junit.jupiter.api.Test
    public void testIsValorPassandoNumeroComVirgula() {
        System.out.println("isValor");
        String valor = "365,5";
        JFrameCalculadora instance = new JFrameCalculadora();
        boolean expResult = false;
        boolean result = instance.isValor(valor);
        assertEquals(expResult, result);
    }
    
}
