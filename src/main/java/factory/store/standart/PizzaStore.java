package main.java.factory.store.standart;

import main.java.factory.pizzas.style.standart.Pizza;
import main.java.factory.pizzas.style.standart.PizzaFactory;

public class PizzaStore {
    Pizza pizza;
    private PizzaFactory pizzaFactory;

    public PizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = pizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
