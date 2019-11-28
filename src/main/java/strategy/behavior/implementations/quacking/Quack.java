package main.java.strategy.behavior.implementations.quacking;

import main.java.strategy.behavior.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I'm say quack-quack");
    }
}
