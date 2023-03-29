import java.util.*;
public class Strings {
    // printing letter in the string
    public static void printString(String str){
        for(int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i) + " ");
        }
        System.err.println();
    }
    public static void main(String[] args) {
        char arr[] = {'a','b','c','d'};
        //String Declaration Methods
        String str = "abcd";
        String str2 = new String("abc");
        Scanner sc = new Scanner(System.in);
        String name;
        // name = sc.next(); //only take single word as input
        name= sc.nextLine();// take entire line as input
        System.out.println(name);
        System.out.println(name.length());

        //Concatenation
        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName + " " +lastName;
        System.err.println(fullName);
        System.out.println(fullName.charAt(2));

        printString(fullName);
    }
}
