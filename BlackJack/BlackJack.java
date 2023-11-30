import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BlackJack {
    
    public static void main(String[] args) {
        System.out.println();
    }
}

class Card {
    String[] name = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    String[] type = {"Heart", "Diamond", "Clover", "Spade"};

    void randomCard() {
        Random rand = new Random();
        int card = rand.nextInt(13);
        int type = rand.nextInt(4);
        
    }

}

class Deck {
    int totalValue;
    ArrayList<String> enemyDeck = new ArrayList<String>();
    ArrayList<String> playerDeck = new ArrayList<String>();

    void enemyDeck(){
        
    }

    void playerDeck(){
        
    }

    void hit(ArrayList<String> Deck) {
        Deck.add()
    }

}

class Game {
    void showOff() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enemy deck : ");

        System.out.println("Your Deck : ");

        System.out.println("1. Hit");
        System.out.println("2. Stand");
        System.out.print("Pilihan : ");
        int ch = input.nextInt();

        if(ch == 1) {
            
        } else if (ch == 2) {

        } else {
            System.out.println("Pilihan tidak ada");
        }
    }
}