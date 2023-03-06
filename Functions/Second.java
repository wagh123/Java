import java.util.*;
public class Second {

    public static int calculateSum(int num1, int num2){// num1 and num2 are called a "parameters or formal parameters" write inside function defination
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = calculateSum(a,b);// a and b are called as "arguments or actual paramerters" write inside function call
        System.out.println(result);
    }
}
