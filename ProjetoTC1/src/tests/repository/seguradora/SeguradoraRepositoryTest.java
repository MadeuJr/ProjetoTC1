package tests.repository.seguradora;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SeguradoraRepositoryTest {
    
    
    @ParameterizedTest
    @Order(3)
    void testEdit() {

    }

    @Test
    @Order(2)
    void testFindAll() {

    }

    @ParameterizedTest
    @Order(4)  
    void testFindOne() {

    }

    @ParameterizedTest
    @Order(1)
    void testInsert() {

    }

    
    @ParameterizedTest
    @Order(5)
    void testRemove() {

    }
}
