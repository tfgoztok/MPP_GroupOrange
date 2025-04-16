package prob1.partB;
import java.util.function.Supplier;


class FunctionalRandom {
        public static void main(String[] args) {
                Supplier<Double> fr = () -> Math.random();
                System.out.println(fr.get());
        }   
}

