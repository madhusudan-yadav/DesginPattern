package structural.decorator.interfaces;

public interface BasePizza {

    String name = "Base Pizza";

    default String getName(){
        return name;
    }

    int getCost();
}
