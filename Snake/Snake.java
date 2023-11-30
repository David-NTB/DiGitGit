public class Snake {
    static Canvas neo = new Canvas();
    public static void main(String[] args) {
        showCanvas();
    }

    static void showCanvas() {
        for (int y = 0; y < neo.canvas.length; y++) {
            for (int x = 0; x < neo.canvas.length; x++) {
                System.out.print(neo.canvas[y][x]);
            }
            System.out.println();
        }
    }
}

class Canvas {
    String[][] canvas = new String[25][25];

    Canvas() {
        for (int y = 0; y < canvas.length; y++) {
            for (int x = 0; x < canvas.length; x++) {
                canvas[y][x] = "  ";
            }
        }
        border();
        rattle();
    }

    void border() {
        for (int y = 0; y < canvas.length; y++) {
            for (int x = 0; x < canvas.length; x++) {
                if ((y == 0))
                    canvas[0][x] = " #";
                else if ((x == 0))
                    canvas[y][0] = " #";
                else if ((y == canvas.length - 1))
                    canvas[canvas.length - 1][x] = " #";
                else if ((x == canvas.length - 1))
                    canvas[y][canvas.length - 1] = " #";
            }
        }
    }

    void rattle() {
        int x = 10;
        int y = 10;

        
        canvas[y][x] = " @";


    }
}
