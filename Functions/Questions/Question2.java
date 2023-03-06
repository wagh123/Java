import javax.swing.plaf.multi.MultiButtonUI;

public class Question2 {

    public static void reverseNum(int n){
        int myNum = n;
        int rev =0;
        while(n>0){
            int lastdigit = n%10;
            rev = (rev*10) + lastdigit;

            n = n/10;

        }
        System.out.println(rev);
        if(rev == myNum){
            System.out.println("The number " + myNum + " is palindrome");
        }else{
            System.out.println("The number " + myNum + " is not palindrome");
        }
    }
    public static void main(String[] args) {
        reverseNum(2020202);
    }    
}
