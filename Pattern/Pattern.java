public class Pattern {

    public static void Inverted_half_Pyramid_with_numbers(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floydsTriangle(int n){
        int counter = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void triangle0_1(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if((i+j) % 2 == 0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        Inverted_half_Pyramid_with_numbers(5);
        floydsTriangle(5);
        triangle0_1(5);
    }
}
