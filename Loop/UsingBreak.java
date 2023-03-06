import java.time.chrono.MinguoChronology;
import java.util.*;
public class UsingBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("enter the number = ");
            int num = sc.nextInt();
            if(num%10==0){
                break;
            }
            System.out.println(num);
        }while(true);
        System.out.println("You have entered the multiple of 10");
    }
}
