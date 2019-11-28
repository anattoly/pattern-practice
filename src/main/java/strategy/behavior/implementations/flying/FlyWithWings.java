package main.java.strategy.behavior.implementations.flying;

import main.java.strategy.behavior.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior
{
    @Override
    public void fly() {
        System.out.println("I'm flying with wings");
    }
}
