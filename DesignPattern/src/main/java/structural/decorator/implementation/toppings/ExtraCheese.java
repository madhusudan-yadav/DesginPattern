package structural.decorator.implementation.toppings;

import structural.decorator.interfaces.BasePizza;
import structural.decorator.interfaces.Decorator;

public class ExtraCheese extends Decorator {
    public ExtraCheese(BasePizza basePizza) {
        super(basePizza);
    }

    public int getCost(){
        return super.getCost() + 10;
    }
}
