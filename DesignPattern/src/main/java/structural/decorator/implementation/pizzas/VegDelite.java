package structural.decorator.implementation.pizzas;

import structural.decorator.interfaces.BasePizza;

public class VegDelite implements BasePizza {
    @Override
    public String getName() {
        return "Veg Delite";
    }

    @Override
    public int getCost() {
        return 120;
    }
}
