public package semester1.Latihan4;

import java.util.Random;
import java.util.Scanner;

class BlackJack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Card play = new Card();

        play.newCard();
        play.newCard();
        play.newCard();
        play.newCard();
        play.newCard();

    }
    
    public void Menu(){

    }
    
}

class Card{
    
    int value;
    String[] type = {"Diamond", "Clover", "Spade", "Heart"};
    String[] name = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "king", "Ace"};
    
    private int typeRandomizer(){
        Random random = new Random();
        return random.nextInt(3);
    }

    private int cardRandomizer(){
        Random random = new Random();
        return random.nextInt(12);
    }    

    public void newCard(){
        card(); type();
        System.out.println("value : " + this.value + "\n");
    }
    
    private void type(){
        switch (typeRandomizer()) {
            case 0:
                System.out.print(type[typeRandomizer()] + "\n");
                break;
        
            case 1:
                System.out.print(type[typeRandomizer()] + "\n");
                break;
        
            case 2:
                System.out.print(type[typeRandomizer()] + "\n");
                break;
        
            case 3:
                System.out.print(type[typeRandomizer()] + "\n");
                break;
        
            default:
                break;
        }
    }

    private void card(){
        switch (cardRandomizer()) {
            case 0:
                System.out.print(name[0] + " ");
                this.value = 2;
                break;
        
            case 1:
                System.out.print(name[1] + " ");
                this.value = 3;
                break;
        
            case 2:
                System.out.print(name[2] + " ");
                this.value = 4;
                break;
        
            case 3:
                System.out.print(name[3] + " ");
                this.value = 5;
                break;
        
            case 4:
                System.out.print(name[4] + " ");
                this.value = 6;
                break;
        
            case 5:
                System.out.print(name[5] + " ");
                this.value = 7;
                break;
        
            case 6:
                System.out.print(name[6] + " ");
                this.value = 8;
                break;
        
            case 7:
                System.out.print(name[7] + " ");
                this.value = 9;
                break;
        
            case 8:
                System.out.print(name[8] + " ");
                this.value = 10;
                break;
        
            case 9:
                System.out.print(name[9] + " ");
                this.value = 10;
                break;
        
            case 10:
                System.out.print(name[10] + " ");
                this.value = 10;
                break;
        
            case 11:
                System.out.print(name[11] + " ");
                this.value = 10;
                break;
        
            case 12:
                System.out.print(name[12] + " ");
                this.value = 1;
                break;
        
            default:
                System.err.print("Error at cardRandomizer()");
                break;
        }
    }
}


 BlackJack {
    
}
