package Prob1.duck;

import Prob1.behavior.fly.FlyWithWings;
import Prob1.behavior.quack.Quack;

public class RedheadDuck extends Duck{
    public RedheadDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("i'm a red head duck");
    }

}
