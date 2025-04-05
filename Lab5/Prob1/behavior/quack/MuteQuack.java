package Prob1.behavior.quack;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("cannot quack, <<silenced>>");
    }
}
