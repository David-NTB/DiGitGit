import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Random extends JFrame implements KeyListener {
    private JTextField textField;

    public Random() {
        textField = new JTextField();
        textField.addKeyListener(this);

        add(textField);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Random();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Implementasi ini dipanggil ketika tombol ditekan dan dilepas.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Implementasi ini dipanggil ketika tombol ditekan.
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("Tombol panah kiri ditekan");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Implementasi ini dipanggil ketika tombol dilepas setelah ditekan.
    }
}
