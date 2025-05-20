package com.example;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CatTest {

    @Test
    void testGetSound() {
        Cat cat = new Cat(new Feline());
        String sound = cat.getSound();
        assertEquals("Мяу", sound, "Кошка должна издавать звук 'Мяу'");
    }

    @Test
    void testCatCreator() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        assertNotNull(cat, "Кошка должна быть создана");
    }

    @Test
    void testGetFoodReturnsPredatorFood() throws Exception {
        Cat cat = new Cat(new Feline());
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, cat.getFood());
    }


}
