package com.example;

import net.bytebuddy.implementation.MethodAccessorFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Test
    public void checkCorrectCatSound() {
        //Arrange
        String expectedSound = "Мяу";
        Cat cat = new Cat();

        //Act
        String actualSound = cat.getSound();

        //Assert
        assertEquals(expectedSound,actualSound);
    }

   @Mock
   private Feline feline;

   @Test
   public void checkGetFood() throws Exception {
        Cat cat = new Cat(feline);
       Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
       List<String> actual = cat.getFood();
       List<String> expected = List.of("Животные", "Птицы", "Рыба");
       assertEquals(expected, actual);
   }

   // }
}