import java.util.*;
public class Third{

    public static int multiply(int a, int b){
        int product = a * b;
        return product;
    }

    public static int factorial(int n){
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }


    public static int binomialCoefficient(int n, int r){// formula n! / r! * (n-r)!
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int fact = factorial(n-r);

        int result = n_fact / (r_fact * fact);
        return result;
    }

    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int  i =2; i<=n-1; i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static boolean method2IsPrime(int n){
        // boolean isPrime = true;
        if(n==2){
            return true;
        }
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
                break;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int mul = multiply(a, b);
        System.out.println(mul);
        mul = multiply(20, 10);
        System.out.println(mul);
        int fact = factorial(4);
        System.out.println(fact);
        System.out.println(binomialCoefficient(5, 2));
        System.out.println(isPrime(3));
        System.out.println(method2IsPrime(5));

    }
}