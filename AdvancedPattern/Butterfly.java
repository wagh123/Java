public class Butterfly {
    public static void butterfly_Pattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int s = 1; s <= 2*(n-i); s++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();

            
        }
         for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int s = 1; s <= 2*(n-i); s++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();

            
        }
        
    }
    public static void main(String[] args) {
        butterfly_Pattern(4);
    }
}
