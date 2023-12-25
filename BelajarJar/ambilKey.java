import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ambilKey {

    private JFrame frame;
    private JTextArea textArea;

    public ambilKey() {
        frame = new JFrame("KeyEvent Example");
        textArea = new JTextArea();
        textArea.addKeyListener(createKeyListener());
        frame.add(textArea);
        frame.setSize(1000, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private KeyListener createKeyListener() {
        return new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                textArea.append("Key Typed: " + keyChar + "\n");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                textArea.append("Key Pressed: " + KeyEvent.getKeyText(keyCode) + "\n");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                int keyCode = e.getKeyCode();
                textArea.append("Key Released: " + KeyEvent.getKeyText(keyCode) + "\n");
            }
        };
    }

    public static void main(String[] args) {
        new ambilKey();
    }
}
