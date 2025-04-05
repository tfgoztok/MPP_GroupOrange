package Prob1.duck;

import Prob1.behavior.fly.FlyWithWings;
import Prob1.behavior.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("i'm a real Mallard duck");
    }
}
