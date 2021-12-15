package Apples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ApplesTest {
    @Test
    void test_of_apples() {
        Apples apples = new Apples();
        assertEquals("apple", apples.getApple());
    }
    @Test
    void test_of_another_apples(){
        Apples apples2 = new Apples();
        assertEquals("apple", apples2.getApples());
    }


}