//import java.util.ArrayList;
//
//public class primenum {
//        public static ArrayList<Integer> findPrimes(int n) {
//            ArrayList<Integer> primes = new ArrayList<>();
//            for (int i = 2; i <= n; i++) {
//                boolean isPrime = true;
//                for (int j = 2; j < i; j++) {
//                    if (i % j == 0) {
//                        isPrime = false;
//                        break;
//                    }
//                }
//                if (isPrime) {
//                    primes.add(i);
//                }
//            }
//            return primes;
//        }
//
//        public static void main(String[] args) {
//            int n = 10;
//            System.out.println(findPrimes(n));
//        }
//    }
//
//
