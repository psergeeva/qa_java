package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class FelineTest {

    private final int a;
    private final int expected;

   public FelineTest(int a, int expected) {
       this.a = a;
     this.expected = expected;
    }


    @Parameterized.Parameters
    public static Collection<Object[]> getKittens(int kittensCount) {
        return Arrays.asList(new Object[][] {
                {1, 1},
                {2, 2},
       });
            }


   @Test
  public void checkGetKittens() {
     Feline feline = new Feline();
      assertEquals(expected, a);
   }

    @Test
    public void eatMeat() throws Exception {
        Feline feline = new Feline();

        List<String> actual = feline.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");

        assertEquals(expected,actual);

    }

    @Test
    public void checkFamily() {
        Feline feline = new Feline();
        String expectedResult = "Кошачьи";
        assertEquals(expectedResult,feline.getFamily());

    }

    @Test
    public void getKittens() {
        Feline feline = new Feline();
        int expected = 1;
        assertEquals(expected, feline.getKittens());
    }





}