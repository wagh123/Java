import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number = ");
        int num = sc.nextInt();
        int sum = 1;
        for(int i=1; i<=num; i++){
            sum = sum + i;
        }
        System.out.println("The factorial of the number num is = " +sum);
    }
}
