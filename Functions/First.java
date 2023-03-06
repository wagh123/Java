import java.util.*;

public class First {
        public static int printHelloWorld(){
            System.out.println("Hello World");
             System.out.println("Hello World");
             System.out.println("Hello World");
             return 3;// how many times this function returns the hello world
        }
        public static void calculateSum(int a, int b){
            int sum = a + b;
            System.out.println("The Sum is : "+sum);

        }
    public static void main(String[] args) {
        printHelloWorld();
        Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
        calculateSum(a,b);
    }
}
