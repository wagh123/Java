import java.util.*;
public class Question1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the range = ");
        int n = sc.nextInt();
        int even =0 ;
        int odd =0;
        for(int i = 1; i<=n; i++){
            System.out.print("enter the number = ");
            int num = sc.nextInt();
            if(num % 2==0){
                even = even + num;
            }else{
                odd = odd + num;
            }
        }
        System.out.println("Sum of EVEN numbers = " +even);
        System.out.println("Sum of ODD numbers = " +odd);
    }
}
