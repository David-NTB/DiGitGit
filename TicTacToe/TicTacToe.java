import java.util.Scanner;

public class TicTacToe {
    char[][] arena = {
            { ' ', ' ', ' ' },
            { ' ', ' ', ' ' },
            { ' ', ' ', ' ' },
    };

    char turn = 'X';

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

    void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    void play() {
        cls();
        while (!gameOver()) {
            arena();
            changeTurn();
            game(this.turn);
            cls();
        }
        arena();
    }

    void arena() {
        System.out.println("=================");
        System.out.println("|| " + arena[0][0] + " || " + arena[0][1] + " || " + arena[0][2] + " ||");
        System.out.println("=================");
        System.out.println("|| " + arena[1][0] + " || " + arena[1][1] + " || " + arena[1][2] + " ||");
        System.out.println("=================");
        System.out.println("|| " + arena[2][0] + " || " + arena[2][1] + " || " + arena[2][2] + " ||");
        System.out.println("=================");
    }

    void changeTurn() {
        this.turn = (this.turn == 'X') ? 'O' : 'X';
        System.out.println();

    }

    void game(char turn) {
        Scanner input = new Scanner(System.in);

        boolean next = false;
        do {
            System.out.print("Masukkan baris : ");
            int row = input.nextInt();

            System.out.print("Masukkan kolom : ");
            int col = input.nextInt();

            if (arena[col][row] != ' ') {
                System.out.println("\nBagian sudah terisi\nSilahkan masukkan lagi\n");
                next = true;
            } else {
                arena[col][row] = turn;
                next = false;
            }
        } while (next);

    }

    boolean gameOver() {
        if (isMenang()) {
            System.out.println(turn + " Menang");
            return true;
        } else if (isPenuh()) {
            System.out.println("Game seri");
            return true;
        } else
            return false;
    }

    boolean isMenang() { // untuk mengecek kondisi menang
        for (int i = 0; i < 3; i++) {
            // mengecek baris dan kolom
            if ((arena[i][0] == turn) && (arena[i][1] == turn) && (arena[i][2] == turn))
                return true;
            if ((arena[0][i] == turn) && (arena[1][i] == turn) && (arena[2][i] == turn))
                return true;
        }
        // mengecek diagonal
        if ((arena[0][0] == turn) && (arena[1][1] == turn) && (arena[2][2] == turn))
            return true;
        if ((arena[0][2] == turn) && (arena[1][1] == turn) && (arena[2][0] == turn))
            return true;
        return false;

    }

    boolean isPenuh() { // untuk mengecek kotak penuh
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                if (arena[y][x] == ' ')
                    return false;
            }
        }
        return true;
    }
}