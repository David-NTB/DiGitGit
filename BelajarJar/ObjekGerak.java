import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ObjekGerak extends JFrame implements KeyListener {
    private int x = 200; // Koordinat X objek
    private int y = 200; // Koordinat Y objek
    private int objekLebar = 50; // Lebar objek
    private int objekTinggi = 50; // Tinggi objek

    public ObjekGerak() {
        setTitle("Objek yang Bisa Digerakkan");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        addKeyListener(this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(x, y, objekLebar, objekTinggi);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ObjekGerak());
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Tidak digunakan dalam contoh ini
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_LEFT) {
            x -= 5; // Geser ke kiri
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            x += 5; // Geser ke kanan
        } else if (keyCode == KeyEvent.VK_UP) {
            y -= 5; // Geser ke atas
        } else if (keyCode == KeyEvent.VK_DOWN) {
            y += 5; // Geser ke bawah
        }
        repaint(); // Memanggil paint() untuk menggambar ulang objek
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Tidak digunakan dalam contoh ini
    }
}
