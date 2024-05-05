package structural.decorator.implementation.pizzas;

import structural.decorator.interfaces.BasePizza;

public class Farmhouse implements BasePizza {
    @Override
    public String getName() {
        return "Farmhouse";
    }

    @Override
    public int getCost() {
        return 200;
    }
}
