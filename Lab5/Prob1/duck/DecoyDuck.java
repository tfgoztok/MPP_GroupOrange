package Prob1.duck;

import Prob1.behavior.fly.CannotFly;
import Prob1.behavior.quack.MuteQuack;

public class DecoyDuck extends Duck{
    public DecoyDuck(){
        flyBehavior = new CannotFly();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("i'm a decoy duck");
    }
}
