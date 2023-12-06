import javax.swing.*;
import java.awt.event.ActionEvent;

public class Random {
    public static void main(String[] args) {
        JFrame frame = new JFrame("KeyBinding Example");
        JPanel panel = new JPanel();

        Action left = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("LEFT");
                // Tambahkan logika atau tindakan yang diinginkan di sini
            }
        };

        Action right = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("RIGHT");
                // Tambahkan logika atau tindakan yang diinginkan di sini
            }
        };

        Action up = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("UP");
                // Tambahkan logika atau tindakan yang diinginkan di sini
            }
        };

        Action down = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("DOWN");
                // Tambahkan logika atau tindakan yang diinginkan di sini
            }
        };

        panel.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
        panel.getActionMap().put("leftAction", left);

        panel.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
        panel.getActionMap().put("rightAction", right);

        panel.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");
        panel.getActionMap().put("upAction", up);

        panel.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
        panel.getActionMap().put("downAction", down);

        frame.getContentPane().add(panel);
        // frame.setSize(300, 200);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
