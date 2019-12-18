package main.java.factory;

import main.java.factory.pizzas.style.newYork.NYPizzaFactory;
import main.java.factory.store.standart.PizzaStore;

public class PizzaDrive {
    public static void main(String[] args) {
        NYPizzaFactory nyPizzaFactory = new NYPizzaFactory();
        PizzaStore nyStore = new PizzaStore(nyPizzaFactory);
        nyStore.orderPizza("cheese");
    }
}
