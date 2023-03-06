import java.util.*;
public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number = ");
        int line = sc.nextInt();
        for(int i=1; i <=line; i++){
            for(int j=line; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// My solution
