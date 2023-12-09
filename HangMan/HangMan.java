package HangMan;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HangMan {
    Random random = new Random();
    Scanner input = new Scanner(System.in);
    int length;
    char[] check;
    char[] secret;
    char[] guess;
    int correct;
    int count = 0;

    public static void main(String[] args) {
        HangMan play = new HangMan();

        play.menu();
        play.check = new char[play.length];
        play.guess = new char[play.length];
        play.secret = new char[play.length];

        play.setWord();
        do {
            play.input();
            play.check();
        } while (true);
    }

    private void menu(){
HangMan set = new HangMan();
        System.out.println("==============================");
        System.out.println("  >> PLAY HANGMAN CLASSIC <<  ");
        System.out.println("==============================");
        System.out.println("\nSelect difficulty : ");
        System.out.println("1. Easy (3 Word)");
        System.out.println("2. Medium (5 Word)");
        System.out.println("3. Hard (7 Word)");
        System.out.println("4. Very Hard (9 Word)");
        System.out.println("5. Impossible (15 Word)");
        System.out.println("\n==============================");
        System.out.print("\nYour choice : ");
        int ch = input.nextInt();
        System.out.println("\n==============================");
        input.nextLine();

        length = 3 + ((ch-1)*2);
        if (ch == 5) length = 15;
    }

    private void isWin() {
        if (correct == length) {
            System.out.println("* SELAMAT ANDA BERHASIL *");
            System.out.println("  Jumlah menebak : " + count + "\n");
            System.exit(0);
        } else {
            count++;
        }
    }

    private void check() {
        correct = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (guess[i] == secret[i] && guess[i] == secret[j]) {
                    check[i] = 'O';
                    correct++;
                    break;
                } else if (guess[i] == secret[j]) {
                    check[i] = 'M';
                    break;
                } else {
                    check[i] = 'X';
                }
            }
        }
        System.out.println(Arrays.toString(check) + "\n");
        isWin();
    }

    private void input() {
        System.out.print("Input : ");
        String guessInput = input.nextLine();
        if (guessInput.length() == length) {
            for (int i = 0; i < length; i++) {
                guess[i] = guessInput.charAt(i);
            }
        } else {
            System.out.println("Input salah");
        }
    }

    private void setWord() {
        for (int i = 0; i < length; i++) {
            int x = random.nextInt(26);
            secret[i] = generateWord()[x];
        }
    }

    private static char[] generateWord() {
        char[] word = new char[26];
        char currentLetter = 'A';

        for (int i = 0; i < 26; i++) {
            word[i] = currentLetter++;
        }

        return word;
    }
}
