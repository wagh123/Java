public class Palindrome{
    public static boolean isPalindrome(String s){
        for(int i = 0; i < s.length()/2; i++){
            int n = s.length();
            if(s.charAt(i) != s.charAt(n-i-1)){
                     return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }
}