package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import entities.Placa;



@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PlacaTest {
    
    static Placa p1;
     
    @BeforeAll
    public static void iniciaInstancia() {
        p1 = new Placa("TXY", 2087, "Araraquara", "DF");
    }

    @Test
    @DisplayName("Teste Getting AsKey")
    @Order(1)
    void testGetAsKey() {
        // Testa o toString como retorno
        Assertions.assertEquals(p1.toString(), p1.getAsKey());
    }

    @Test
    @DisplayName("Teste Getting Cidade")
    @Order(2)
    void testGetCidade() {
        Assertions.assertEquals("Araraquara", p1.getCidade());
    }

    @Test
    @DisplayName("Teste Getting Estado")
    @Order(3)
    void testGetEstado() {
        Assertions.assertEquals("DF", p1.getEstado());
    }

    @Test
    @DisplayName("Teste Getting Letras")
    @Order(4)
    void testGetLetras() {
        Assertions.assertEquals("TXY", p1.getLetras());
    }

    @Test
    @DisplayName("Teste Getting Numeros")
    @Order(5)
    void testGetNumeros() {
        Assertions.assertEquals(2087, p1.getNumeros());
    }

    @Test
    @DisplayName("Teste Setting Cidade")
    @Order(6)
    void testSetCidade() {
        p1.setCidade("Rio Claro");
        Assertions.assertEquals("Rio Claro", p1.getCidade());
    }

    @Test
    @DisplayName("Teste Setting Estado")
    @Order(7)
    void testSetEstado() {
        p1.setEstado("SP");
        Assertions.assertEquals("SP", p1.getEstado());
    }

    @Test
    @DisplayName("Teste Setting Letras")
    @Order(8)
    void testSetLetras() {
        p1.setLetras("OQS");
        Assertions.assertEquals("OQS", p1.getLetras());
    }

    @Test
    @DisplayName("Teste Setting Numeros")
    @Order(9)
    void testSetNumeros() {
        p1.setNumeros(8974);
        Assertions.assertEquals(8974, p1.getNumeros());
    }
}
