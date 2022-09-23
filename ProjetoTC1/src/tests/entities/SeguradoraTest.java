package tests.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import entities.Seguradora;

public class SeguradoraTest {

    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
    static Seguradora s1;


    @BeforeAll
    public static void inicializaObjetos() throws ParseException{
        s1 = new Seguradora(92691995000100L, "Peace Love Padaria", simpleDateFormat.parse("12/05/2020"), new ArrayList<String>(Arrays.asList("ester-damota84@albap.com.br")), new ArrayList<Long>(Arrays.asList(4827390520L)));
    }

    @Test
    @DisplayName ("Teste de Adição de E-mail")
    void testAddEmailSeguradora() throws ParseException {
        s1.addEmailSeguradora("fabio.mario.jesus@jammer.com.br");
        ArrayList<String> arrayTeste = new ArrayList<String>(s1.getEmailContato());
        Assertions.assertEquals("fabio.mario.jesus@jammer.com.br", arrayTeste.get(1));

    }

    @Test
    @DisplayName ("Teste de Adição de Telefone")
    void testAddTelefoneSeguradora() {
        s1.addTelefoneSeguradora(82986431632L);
        ArrayList<Long> arrayTeste = new ArrayList<Long>(s1.getTelefonesContato());
        Assertions.assertEquals(82986431632L, arrayTeste.get(1));

    }

    @Test
    void testGetCNPJ() {

    }

    @Test
    void testGetDataInicio() {

    }

    @Test
    void testGetEmailContato() {

    }

    @Test
    void testGetPK() {

    }

    @Test
    void testGetRazaoSocial() {

    }

    @Test
    void testGetTelefonesContato() {

    }

    @Test
    void testSetCNPJ() {

    }

    @Test
    void testSetDataInicio() {

    }

    @Test
    void testSetRazaoSocial() {

    }

    @Test
    void testToString() {

    }
}
