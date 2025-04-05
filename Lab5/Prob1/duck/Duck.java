package Prob1.duck;

import Prob1.behavior.fly.FlyBehavior;
import Prob1.behavior.quack.QuackBehavior;

public abstract class Duck {
    // Each Duck has a reference to a behavior interface to use Strategy Design Pattern
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    
    public Duck() {
        // Constructor is empty - behaviors set by subclasses
    }
    
    // Delegate to the behavior class
    public void performFly() {flyBehavior.fly();}
    
    // Delegate to the behavior class
    public void performQuack() {quackBehavior.quack();}
    
    // Allow for dynamic behavior changes at runtime, as an example :)
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
    
    // Common duck method, everyone can swim!
    public void performSwim() {
        System.out.println("swimming is easy");
    }
    
    // This method must be implemented by all subclasses
    public abstract void display();
}
