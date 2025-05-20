package com.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LionTest {

    @Test
    void testConstructorWithMale() throws Exception {
        Lion lion = new Lion("Самец");
        assertTrue(lion.doesHaveMane(), "Самец должен иметь гриву");
    }

    @Test
    void testConstructorWithFemale() throws Exception {
        Lion lion = new Lion("Самка");
        assertFalse(lion.doesHaveMane(),"Самка не должна иметь гриву");
    }

    @Test
    void testConstructorInvalidSex() {
        Executable executable = () -> new Lion("Неправильный пол");
        Exception exception = assertThrows(Exception.class, executable);
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

    @Test
    void testGetKitten() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец");
        int kitten = lion.getKittens(feline);
        assertEquals(1, kitten, "Количество котят должно быть 1");
    }

    @Test
    void testGetFood() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец");
        List<String> food = lion.getFood(feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, lion.getFood(feline));
    }

    @Test
    void testGetFoodWithNullFeline() throws Exception {
        Lion lion = new Lion("Самец");
        Executable executable = () -> lion.getFood(null);
        Exception exception = assertThrows(Exception.class, executable);
        assertEquals("Cannot invoke \"com.example.Feline.getFood(String)\" because \"feline\" is null", exception.getMessage());
    }
}
