package main.java.strategy.ducks;

import main.java.strategy.behavior.implementations.flying.FlyNoWay;
import main.java.strategy.behavior.implementations.quacking.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I’m a model duck");
    }
}
