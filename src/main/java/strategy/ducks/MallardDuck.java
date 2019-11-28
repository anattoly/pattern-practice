package main.java.strategy.ducks;

import main.java.strategy.behavior.implementations.flying.FlyWithWings;
import main.java.strategy.behavior.implementations.quacking.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I’m a real Mallard duck");
    }
}
