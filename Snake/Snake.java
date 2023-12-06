public class Snake {
     
    public static void main(String[] args) {
        Arena arn = new Arena();
        
        arn.printArena();

    }

    void delay() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void clear() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Rattle {
    Arena canvas = new Arena();

    Rattle() {
        canvas.arena[14][14] = " @";
    }

    void head(){
        
    }
}

class Arena {
    String[][] arena = new String[25][25];

    Arena(){
        for(int y = 0; y < 25; y++) {
            for(int x = 0; x < 25; x++) {
                if((y==0) || (y==24)) {
                    this.arena[y][x] = "==";
                } else if((x==0) || (x==24)) {
                    this.arena[y][x] = "||";
                } else {
                    this.arena[y][x] = "  ";
                }
            }
        }
    }
    
    void printArena() {
        for(int y = 0; y < 25; y++) {
            for(int x = 0; x < 25; x++) {
                System.out.print(this.arena[y][x]);
            }
            System.out.println();
        }
    }
}