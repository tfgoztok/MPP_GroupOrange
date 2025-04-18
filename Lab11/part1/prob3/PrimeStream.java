package Lab11.part1.prob3;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class PrimeStream {
    // A final variable Stream<Integer> that contains all prime numbers
    private final Stream<Integer> primes = Stream.iterate(2, PrimeStream::nextPrime);
    
    // A supplier that can be used to create a new stream of primes whenever needed
    private final Supplier<Stream<Integer>> primeSupplier = () -> Stream.iterate(2, PrimeStream::nextPrime);

    private static int nextPrime(int n) {
        // Start from n+1 for the search
        int candidate = n + 1;
        
        // Keep checking until we find the next prime
        while (!isPrime(candidate)) {
            candidate++;
        }
        
        return candidate;
    }
    

    private static boolean isPrime(int num) {
        // 1 or less is not prime
        if (num <= 1) {
            return false;
        }
        
        // 2 and 3 are prime
        if (num == 2 || num == 3) {
            return true;
        }
        
        // Check if divisible by 2 or 3
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        
        // Check all possible divisors from 5 to sqrt(num)
        // We increment by 6 because all primes > 3 are of form 6k±1
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        
        return true;
    }

    public void printFirstNPrimes(int n) {
        // Create a new stream of primes each time this method is called
        primeSupplier.get()
                    .limit(n)
                    .forEach(System.out::println);
    }
    
    public static void main(String[] args) {
        PrimeStream ps = new PrimeStream(); //PrimeStream is enclosing class
        ps.printFirstNPrimes(10);
        System.out.println("====");
        ps.printFirstNPrimes(5);
    }
} 