package structural.decorator.implementation.toppings;

import structural.decorator.interfaces.BasePizza;
import structural.decorator.interfaces.Decorator;

public class Mushrooms extends Decorator {
    public Mushrooms(BasePizza basePizza) {
        super(basePizza);
    }

    public int getCost(){
        return super.getCost() + 15;
    }
}
