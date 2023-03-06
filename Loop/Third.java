import java.util.*;
public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        int count = 1;
        int sum = 0;
        while(count <= num){
            sum = sum + count;
            count++;
        }
        System.out.println("The sum of first n natural numbers = " + sum);
    }
}
