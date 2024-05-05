package structural.decorator;

import structural.decorator.implementation.pizzas.Margherita;
import structural.decorator.implementation.pizzas.VegDelite;
import structural.decorator.implementation.toppings.ExtraCheese;
import structural.decorator.implementation.toppings.Mushrooms;
import structural.decorator.interfaces.BasePizza;
import structural.decorator.interfaces.Decorator;

public class MyMain {

    public static void main(String[] args) {
        BasePizza basePizzaMargherita = new Margherita();
        Decorator decoratorExtraCheese = new ExtraCheese(basePizzaMargherita);

        System.out.println(decoratorExtraCheese.getCost());

        BasePizza basePizzaVegDelite = new VegDelite();
        Decorator decoratorMushroom = new Mushrooms(basePizzaVegDelite);
        Decorator decoratorExtraCheese2 = new ExtraCheese(decoratorMushroom);
        System.out.println(decoratorExtraCheese2.getCost());
    }
}
