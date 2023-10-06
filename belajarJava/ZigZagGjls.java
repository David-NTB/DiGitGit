public class ZigZagGjls {
    int a = 0;
    public static void main(String[] args) {
        System.out.println("Helloooww");        
 
        for(int i = 0; i < 1;){
            zigZag(40);
        }

    }
    private static void zigZag(int range){
        for(int i = 1; i < range; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            System.out.print("a");
            System.out.print("\n\n");
        }
        for(int i = 1; i < range; i++){
            for(int j = i; j <= range; j++){
                System.out.print(" ");
            }
            System.out.print("a");
            System.out.print("\n\n ");
        }
 
    }
}