package structural.decorator.implementation.pizzas;

import structural.decorator.interfaces.BasePizza;

public class Margherita implements BasePizza {
    @Override
    public String getName() {
        return "Margherita";
    }

    @Override
    public int getCost() {
        return 100;
    }
}
