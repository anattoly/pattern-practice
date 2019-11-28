package main.java.strategy;

import main.java.strategy.behavior.implementations.flying.FlyRocketPowered;
import main.java.strategy.ducks.Duck;
import main.java.strategy.ducks.MallardDuck;
import main.java.strategy.ducks.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
