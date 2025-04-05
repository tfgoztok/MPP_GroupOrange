package Prob1.main;

import Prob1.duck.*;

public class DuckApp {
    public static void main(String[] args) {
        Duck[] ducks = {
                new MallardDuck(), new DecoyDuck(), new RedheadDuck(), new RubberDuck()
        };

        for(Duck d: ducks){
            System.out.println("\n" + d.getClass().getSimpleName() + ":");
            d.display();
            d.performFly();
            d.performQuack();
            d.performSwim();
        }

    }
}
