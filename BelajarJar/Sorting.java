import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Sorting {
    JFrame frame = new JFrame();
    
    ArrayList<Integer> array = new ArrayList<>();
    Random random = new Random();
    int arraySize = 200;
    int barHeight;
    int frameX = 1020;
    int frameY = 550;

    public static void main(String[] args) throws InterruptedException {
        Sorting arr = new Sorting();
        arr.createFrame();

        arr.AscArray();
        arr.DscArray();

    }

    public void createFrame() {
        frame.setTitle("Sorting test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(frameX, frameY);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void generateBar() throws InterruptedException {
        Thread.sleep(5);
        frame.getContentPane().removeAll();

        for (int i = 0; i < array.size(); i++) {
            barHeight = array.get(i);

            JLabel label = new JLabel();
            label.setBounds(0+(5*i), frameY-barHeight-45, 5, barHeight);
            label.setBackground(Color.WHITE);
            label.setOpaque(true);
            
            frame.add(label);
        }
        frame.repaint();
    }

    public void AscArray() throws InterruptedException {
        System.out.println("Ascending Array");
        array.removeAll(array);
        generateArray();
        showArray();
        sortArrayAsc();
        showArray();
        System.out.println();
    }

    public void DscArray() throws InterruptedException {
        System.out.println("Descending Array");
        array.removeAll(array);
        generateArray();
        showArray();
        sortArrayDsc();
        showArray();
        System.out.println();
    }

    public void showArray() {
        System.out.print("Array : ");
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
        System.out.println();
    }

    public void sortArrayAsc() throws InterruptedException {
        for (int i = 0; i < array.size() - 1; i++) {
            for (int j = array.size() -1; j > 0; j--) {
                if (array.get(j) < array.get(j - 1)) {
                    int temp = array.get(j);
                    array.set(j, array.get(j - 1));
                    array.set(j - 1, temp);
                }
                generateBar();
            }
        }
    }

    public void sortArrayDsc() throws InterruptedException {
        for (int i = 0; i < array.size(); i++) {
            for (int j = array.size() - 1; j > 0; j--) {
                if (array.get(j) > array.get(j - 1)) {
                    int temp = array.get(j);
                    array.set(j, array.get(j - 1));
                    array.set(j - 1, temp);
                }
                generateBar();
            }
        }
    }

    public void generateArray() {
        for (int i = 1; i <= arraySize; i++) {
            array.add(random.nextInt(500));
        }
    }

}