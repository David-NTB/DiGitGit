public class Random {
    public static void main(String[] args) {
        
    }
    
    void cls(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.err.println("Error");
        }
    }
}

class move{
    int a;

    int right(){
        for(int i = 1; i > 0; i++){
            a= 1;
        }
        return a;
    }
}
