public class StringFunctions {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
        if(s1 == s2){
            System.err.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        //this comparison give error
        if(s1 == s3){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        //we use equals function in String to compare two strings
        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
}
