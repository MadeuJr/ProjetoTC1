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

import entities.Seguradora;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SeguradoraTest {

    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
    static Seguradora s1;


    @BeforeAll
    public static void inicializaObjetos() throws ParseException{
        s1 = new Seguradora(92691995000100L, "Peace Love Padaria", simpleDateFormat.parse("12/05/2020"), new ArrayList<String>(Arrays.asList("ester-damota84@albap.com.br")), new ArrayList<Long>(Arrays.asList(4827390520L)));
    }

    @Test
    @Order(8)
    @DisplayName ("Teste de Adição de E-mail")
    void testAddEmailSeguradora() throws ParseException {
        s1.addEmailSeguradora("fabio.mario.jesus@jammer.com.br");
        ArrayList<String> arrayTeste = new ArrayList<String>(s1.getEmailContato());
        Assertions.assertEquals("fabio.mario.jesus@jammer.com.br", arrayTeste.get(1));

    }

    @Test
    @Order(2)
    @DisplayName ("Teste de Adição de Telefone")
    void testAddTelefoneSeguradora() {
        s1.addTelefoneSeguradora(82986431632L);
        ArrayList<Long> arrayTeste = new ArrayList<Long>(s1.getTelefonesContato());
        Assertions.assertEquals(82986431632L, arrayTeste.get(1));

    }

    @Test
    @Order(5)
    @DisplayName ("Teste Getting CNPJ")
    void testGetCNPJ() {
        Assertions.assertEquals(92691995000100L, s1.getCNPJ());
    }

    @Test
    @Order(3)
    @DisplayName ("Teste Getting Data inicio")
    void testGetDataInicio() throws ParseException {
        Assertions.assertEquals(simpleDateFormat.parse("12/05/2020"), s1.getDataInicio());        
    }

    @Test
    @Order(4)
    @DisplayName ("Teste Getting array E-mail")
    void testGetEmailContato() {
        ArrayList<String> arrayTeste = new ArrayList<String>(Arrays.asList("ester-damota84@albap.com.br"));
        Assertions.assertEquals(arrayTeste, s1.getEmailContato());
    }

    @Test
    @Order(7)
    @DisplayName ("Teste Getting PK")
    // Teste para ver se a PK é o CNPJ
    void testGetPK() {
        Assertions.assertEquals(92691995000100L, s1.getPK());
    }

    @Test
    @Order(1)
    @DisplayName ("Teste Getting Razão Social")
    void testGetRazaoSocial() {
        Assertions.assertEquals("Peace Love Padaria", s1.getRazaoSocial());
    }

    @Test
    @Order(9)
    @DisplayName ("Teste Getting Array Telfones")
    void testGetTelefonesContato() {
        ArrayList<Long> arrayTeste = new ArrayList<Long>(s1.getTelefonesContato());
        Assertions.assertEquals(arrayTeste, s1.getTelefonesContato());
    }

    @Test
    @Order(10)
    @DisplayName ("Teste Setting CNPJ")
    void testSetCNPJ() {
        s1.setCNPJ(39390569000146L);
        Assertions.assertEquals(39390569000146L, s1.getCNPJ());
    }

    @Test
    @Order(11)
    @DisplayName ("Teste Setting Data de Inicio")
    void testSetDataInicio() throws ParseException {
        s1.setDataInicio("20/02/2013");
        Assertions.assertEquals(simpleDateFormat.parse("20/02/2013"), s1.getDataInicio());

    }

    @Test
    @Order(12)
    @DisplayName ("Teste Setting Razão Social")
    void testSetRazaoSocial() {
        s1.setRazaoSocial("Bananinha Seguros");
        Assertions.assertEquals("Bananinha Seguros", s1.getRazaoSocial());
    }
}
