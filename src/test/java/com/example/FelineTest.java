package com.example;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FelineTest {

    @Test
    void testToEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();
        assertNotNull(food, "Список еды не должен быть null");
    }

    @Test
    void testGetFamily() {
        Feline feline = new Feline();
        String family = feline.getFamily();
        assertEquals("Кошачьи", family, "Семья должна быть 'Кошачьи'");
    }

}
