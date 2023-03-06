import java.util.*;
public class Second {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        int count = 1;
        while(count<=num){
            System.out.println(count);
            count++;
        }

    }
}
