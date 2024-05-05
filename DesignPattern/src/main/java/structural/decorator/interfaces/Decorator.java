package structural.decorator.interfaces;

public abstract class Decorator implements BasePizza{

    BasePizza basePizza;

    public Decorator(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    public int getCost(){
        return this.basePizza.getCost();
    }
}
