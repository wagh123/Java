import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();

        boolean isPrime = true;

        for(int i = 2; i<=num-1; i++){
            if(num%i==0){ // n is a multiple of i (i not equal to 1 or n )
                isPrime = false;
            }
        }
        
        if(isPrime == true){
            System.out.println("the number is a Prime number");
        }else{
            System.out.println("the number is not a prime number");
        }
    }
}
