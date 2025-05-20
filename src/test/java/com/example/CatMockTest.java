package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
@RunWith(MockitoJUnitRunner.class)
public class CatMockTest {
    @Mock
    private Feline mockFeline;

    @InjectMocks
    private Cat cat;

    @Test
    public void testGetFoodReturnsNonNull() throws Exception {
        when(mockFeline.eatMeat()).thenReturn(Arrays.asList("Мясо", "Рыба"));
        List<String> food = cat.getFood();
        assertNotNull(food);
    }

    @Test
    public void testGetFoodReturnsCorrectSize() throws Exception {
        when(mockFeline.eatMeat()).thenReturn(Arrays.asList("Мясо", "Рыба"));
        List<String> food = cat.getFood();
        assertEquals(2, food.size());
    }

    @Test
    public void testGetFoodContainsExpectedItems() throws Exception {
        when(mockFeline.eatMeat()).thenReturn(Arrays.asList("Мясо", "Рыба"));
        List<String> food = cat.getFood();
        assertTrue(food.contains("Мясо"));
        assertTrue(food.contains("Рыба"));
    }

}
