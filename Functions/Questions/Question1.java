public class Question1 {

    public static int averageOfThreeNum(int a, int b, int c){
        int avg = (a + b + c)/3;
        return avg;
    }

    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int avg = averageOfThreeNum(67, 89, 70);
        System.out.println("The Average of three numbers = " + avg);
        System.out.println(isEven(21));
    }    
}
