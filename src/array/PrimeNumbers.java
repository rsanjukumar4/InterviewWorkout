package array;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args) {
        PrimeNumbers primeNumbers = new PrimeNumbers();
//        System.out.println(primeNumbers.collectPrimeNumbers(100));
        System.out.println(isPrime(29));
    }

    private List<Integer> collectPrimeNumbers(int limit) {
        return sieveOfEratosthenes(limit);
    }

    private List<Integer> sieveOfEratosthenes(int limit) {
        List<Integer> primeNumberList = new ArrayList<>();
        int[] prime = new int[limit+1];
        for(int i = 2; i*i <= limit; i++) {
            if(prime[i] == 0) {
                for (int j = i*i; j<= limit; j+= i) {
                    prime[j] = 1;
                }
            }
        }

        for(int i = 2; i<= limit; i++) {
            if(prime[i] == 0) {
                primeNumberList.add(i);
            }
        }
        return primeNumberList;
    }

    public static boolean isPrime(int num){
        if ( num > 2 && num%2 == 0 ) {
            System.out.println(num + " is not prime");
            return false;
        }
        int top = (int)Math.sqrt(num) + 1;
        for(int i = 3; i < top; i+=2){
            if(num % i == 0){
                System.out.println(num + " is not prime");
                return false;
            }
        }
        System.out.println(num + " is prime");
        return true;
    }

}
