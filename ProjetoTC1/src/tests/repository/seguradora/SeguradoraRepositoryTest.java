package tests.repository.seguradora;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import entities.Seguradora;
import repository.seguradora.SeguradoraRepository;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SeguradoraRepositoryTest {
    
    static SeguradoraRepository repository;
    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");

    @BeforeAll
    public static void iniciaRep() {
        repository = new SeguradoraRepository();
    }


    @Test
    @Order(3)
    void testEdit() throws ParseException {
        Seguradora s1 = new Seguradora(92691995000100L, "Peace Love Padaria", simpleDateFormat.parse("12/05/2020"), new ArrayList<String>(Arrays.asList("ester-damota84@albap.com.br")), new ArrayList<Long>(Arrays.asList(4827390520L)));
        repository.insert(s1);

        s1 = new Seguradora(92691995000100L, "No Way Bike", simpleDateFormat.parse("18/08/2013"), new ArrayList<String>(Arrays.asList("leticia_aparicio@greenschool.com.br")), new ArrayList<Long>(Arrays.asList(85994992654L)));
        
        Assertions.assertFalse(repository.edit(s1));   
    }

    @Test
    @Order(2)
    void testFindAll() {
        ArrayList<Seguradora> arrayTemp = new ArrayList<Seguradora>(repository.findAll());
        Assertions.assertNotEquals(0, arrayTemp.size());;
    }

    @ParameterizedTest
    @Order(4)  
    @ArgumentsSource(ObjectsSeguradora.class)
    void testFindOne(Seguradora seg) {
        Assertions.assertNotNull(repository.findOne(seg.getCNPJ()));
    }

    @ParameterizedTest
    @ArgumentsSource(ObjectsSeguradora.class)
    @Order(1)
    void testInsert(Seguradora seg) {
        Assertions.assertTrue(repository.insert(seg));
    }

    
    @ParameterizedTest
    @Order(5)
    @ArgumentsSource(ObjectsSeguradora.class)
    void testRemove(Seguradora seg) {
        ArrayList<Seguradora> debugRep = repository.getData();
        Assertions.assertTrue(repository.remove(seg.getPK()));
    }
}
