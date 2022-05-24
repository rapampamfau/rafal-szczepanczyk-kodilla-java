package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaDecoratorTestSuite {


    @Nested
    @DisplayName("Tests for basic pizza")
    class TestBasicPizza {
        @Test
        public void testBasicPizzaCost() {
            //Given
            PizzaOrder pizza = new BasicPizza();
            //When
            BigDecimal cost = pizza.getCost();
            //Then
            assertEquals(new BigDecimal(15), cost);
        }

        @Test
        public void testBasicPizzaDescription() {
            //Given
            PizzaOrder pizza = new BasicPizza();
            //When
            String desc = pizza.getDescription();
            //Then
            assertEquals("Pizza with tomato sauce and cheese", desc);

        }
    }

    @Nested
    @DisplayName("Tests for pizza with ingredients")
    class TestPizzaWithIngredients {
        @Test
        public void testPizzaWithIngredientsCost() {
            //Given
            PizzaOrder pizza = new BasicPizza();
            pizza = new ThinCrustDecorator(pizza);
            pizza = new DoubleCheeseDecorator(pizza);
            pizza = new SpicyDecorator(pizza);
            pizza = new HamDecorator(pizza);
            pizza = new MushroomsDecorator(pizza);
            //When
            BigDecimal cost = pizza.getCost();
            //Then
            assertEquals(new BigDecimal(28), cost);
        }

        @Test
        public void testPizzaWithIngredientsDescription() {
            //Given
            PizzaOrder pizza = new BasicPizza();
            pizza = new ThinCrustDecorator(pizza);
            pizza = new DoubleCheeseDecorator(pizza);
            pizza = new SpicyDecorator(pizza);
            pizza = new HamDecorator(pizza);
            pizza = new MushroomsDecorator(pizza);
            //When
            String desc = pizza.getDescription();
            //Then
            assertEquals("Pizza with tomato sauce and cheese on thin crust + extra cheese " +
                    "with spicy sauce + ham + mushrooms", desc);
        }
    }
}
