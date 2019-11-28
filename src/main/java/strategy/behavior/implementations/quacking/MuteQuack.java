package main.java.strategy.behavior.implementations.quacking;

import main.java.strategy.behavior.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
