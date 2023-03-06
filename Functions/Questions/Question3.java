public class Question3 {

    public static void sumOfDigitsInAnInterger(int n){
        int myNum = n;
        int sum = 0;
        while(n>0){
            int lastdigit = n%10;
            sum = sum + lastdigit;
            n = n / 10;
        }
        System.out.println("Sum of Digits In an " + myNum + " is " + sum);
    }
    public static void main(String[] args) {
        sumOfDigitsInAnInterger(555555);
    }
}
