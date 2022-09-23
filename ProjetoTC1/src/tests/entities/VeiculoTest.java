package tests.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import entities.Placa;
import entities.Seguradora;
import entities.Veiculo;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class VeiculoTest {

    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");

    static Placa p1 = new Placa("BKN", 1968, "São Carlos", "SP");
    static Seguradora s1;
    static Veiculo v1;

    @BeforeAll
    public static void iniciaInstancia() throws ParseException {
        s1 = new Seguradora(92691995000100L, "Peace Love Padaria", simpleDateFormat.parse("12/05/2020"), new ArrayList<String>(Arrays.asList("ester-damota84@albap.com.br")), new ArrayList<Long>(Arrays.asList(4827390520L)));
        v1 = new Veiculo(p1, "Terrestre", "Hyundai", "HB20", 2020, 4, 5, new ArrayList<String>(Arrays.asList("Gasolina", "Alcool")), "Azul", new ArrayList<String>(Arrays.asList("Ar condicionado", "Porta-luvas")), s1 );
    }

    @Test
    @Order(1)
    @DisplayName ("Teste de Adição de acessório")
    void testAddAcessorioVeiculo() {
        v1.addAcessorioVeiculo("Banco de couro");
        ArrayList<String> arrayTeste = new ArrayList<String>(v1.getAcessoriosVeiculo());
        Assertions.assertEquals("Banco de couro", arrayTeste.get(arrayTeste.size() - 1));
    }

    @Test
    @Order(2)
    @DisplayName ("Teste de Adição de combustivel")
    void testAddCombustiveisVeiculo() {
        v1.addCombustiveisVeiculo("ARLA32");
        ArrayList<String> arrayTeste = new ArrayList<String>(v1.getCombustiveisVeiculo());
        Assertions.assertEquals("ARLA32", arrayTeste.get(arrayTeste.size() - 1));

    }

    @Test
    @Order(3)
    @DisplayName ("Teste de Getting acessórios")
    void testGetAcessoriosVeiculo() {
        ArrayList<String> arrayTeste = new ArrayList<String>(v1.getAcessoriosVeiculo());
        Assertions.assertEquals(arrayTeste, v1.getAcessoriosVeiculo());
    }

    @Test
    @Order(4)
    @DisplayName ("Teste Getting Ano")
    void testGetAnoVeiculo() {
        Assertions.assertEquals(2020, v1.getAnoVeiculo());
    }

    @Test
    @Order(6)
    @DisplayName ("Teste Getting Array Combustiveis")
    void testGetCombustiveisVeiculo() {
        ArrayList<String> arrayTeste = new ArrayList<String>(v1.getCombustiveisVeiculo());
        Assertions.assertEquals(arrayTeste, v1.getCombustiveisVeiculo());
    }

    @Test
    @Order(5)
    @DisplayName ("Teste Getting Cor")
    void testGetCorVeiculo() {
        Assertions.assertEquals("Azul", v1.getCorVeiculo());
    }

    @Test
    @Order(8)
    @DisplayName ("Teste Getting Marca")
    void testGetMarcaVeiculo() {
        Assertions.assertEquals("Hyundai", v1.getMarcaVeiculo());
    }

    @Test
    @Order(7)
    @DisplayName ("Teste Getting Modelo")
    void testGetModeloVeiculo() {
        Assertions.assertEquals("HB20", v1.getModeloVeiculo());
    }

    @Test
    @Order(10)
    @DisplayName ("Teste Getting Lugares")
    void testGetNumLugaresVeiculos() {
        Assertions.assertEquals(5, v1.getNumLugaresVeiculos());
    }

    @Test
    @Order(9)
    @DisplayName ("Teste Getting PK")
    // Verifica se a Placa é a PK do Veículo
    void testGetPK() {
        Assertions.assertEquals(p1, v1.getPK());
    }

    @Test
    @Order(11)
    @DisplayName ("Teste Getting placa")
    void testGetPlaca() {
        Assertions.assertEquals(p1, v1.getPlaca());
    }

    @Test
    @Order(12)
    @DisplayName ("Teste Getting Portas")
    void testGetPortasVeiculo() {
        Assertions.assertEquals(4, v1.getPortasVeiculo());
    }

    @Test
    @Order(13)
    @DisplayName ("Teste Getting Seguradora")
    void testGetSeguradora() {
        Assertions.assertEquals(s1, v1.getSeguradora());
    }

    @Test
    @Order(14)
    @DisplayName ("Teste Getting tipo")
    void testGetTipoVeiculo() {
        Assertions.assertEquals("Terrestre", v1.getTipoVeiculo());
    }

    @Test
    @Order(15)
    @DisplayName ("Teste Setting Acessórios")
    void testSetAcessoriosVeiculo() {
        ArrayList<String> arrayTeste = new ArrayList<String>(Arrays.asList("Banco de Couro", "Teto Solar"));
        v1.setAcessoriosVeiculo(arrayTeste);
        Assertions.assertEquals(arrayTeste, v1.getAcessoriosVeiculo());
    }

    @Test
    @Order(16)
    @DisplayName ("Teste Setting Ano")
    void testSetAnoVeiculo() {
        v1.setAnoVeiculo(2000);
        Assertions.assertEquals(2000, v1.getAnoVeiculo());
    }

    @Test
    @Order(18)
    @DisplayName ("Teste Setting Combustiveis")
    void testSetCombustiveisVeiculo() {
        ArrayList<String> arrayTeste = new ArrayList<String>(Arrays.asList("Gás", "Etanol"));
        v1.setCombustiveisVeiculo(arrayTeste);
        Assertions.assertEquals(arrayTeste, v1.getCombustiveisVeiculo());
    }

    @Test
    @Order(17)
    @DisplayName ("Teste Setting Cor")
    void testSetCorVeiculo() {
        v1.setCorVeiculo("Rosa");
        Assertions.assertEquals("Rosa", v1.getCorVeiculo());
    }

    @Test
    @Order(20)
    @DisplayName ("Teste Setting Marca")
    void testSetMarcaVeiculo() {
        v1.setMarcaVeiculo("Toyota");
        Assertions.assertEquals("Toyota", v1.getMarcaVeiculo());
    }

    @Test
    @Order(19)
    @DisplayName ("Teste Setting Modelo")
    void testSetModeloVeiculo() {
        v1.setModeloVeiculo("Golf");
        Assertions.assertEquals("Golf", v1.getModeloVeiculo());
    }

    @Test
    @Order(21)
    @DisplayName ("Teste Setting Lugares")
    void testSetNumLugaresVeiculos() {
        v1.setNumLugaresVeiculos(10);
    }

    @Test
    @Order(22)
    @DisplayName ("Teste Setting Placa")
    void testSetPlaca() {
        Placa placaTeste = new Placa("TRE", 1234, "Sertão", "PI");
        v1.setPlaca(placaTeste);
        Assertions.assertEquals(placaTeste, v1.getPlaca());
    }

    @Test
    @Order(23)
    @DisplayName ("Teste Setting Portas")
    void testSetPortasVeiculo() {
        v1.setPortasVeiculo(5);
        Assertions.assertEquals(5, v1.getPortasVeiculo());
    }

    @Test
    @Order(24)
    @DisplayName ("Teste Setting Seguradora")
    void testSetSeguradora() throws ParseException {
        Seguradora segTeste = new Seguradora(77198497000129L, "Arroz com Ovo", simpleDateFormat.parse("22/03/2010"), new ArrayList<String>(Arrays.asList("claricesophiafigueiredo@afsn.com.br", "sabrinalizpinto@bodyfast.com.br")), new ArrayList<Long>(Arrays.asList(6726585573L)));
        v1.setSeguradora(segTeste);
        Assertions.assertEquals(segTeste, v1.getSeguradora());
    }

    @Test
    @Order(25)
    @DisplayName ("Teste Setting Tipo")
    void testSetTipoVeiculo() {
        v1.setTipoVeiculo("Aéreo");
        Assertions.assertEquals("Aéreo", v1.getTipoVeiculo());
    }
}
