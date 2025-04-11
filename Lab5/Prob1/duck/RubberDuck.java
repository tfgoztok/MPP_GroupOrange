package Prob1.duck;

import Prob1.behavior.fly.CannotFly;
import Prob1.behavior.quack.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new CannotFly();
        quackBehavior = new Squeak();
    }
    @Override
    public void display() {
        System.out.println("i'm a rubber duck");
    }
}
