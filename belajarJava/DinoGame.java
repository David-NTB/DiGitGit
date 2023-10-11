import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class DinoGame extends JPanel implements ActionListener, KeyListener {
    private int dinoY = 200;
    private int dinoSpeedY = 0;
    private boolean isJumping = false;
    private int obstacleX = 600;
    private int groundY = 250;
    private Timer timer;
    private int score = 0;

    public DinoGame() {
        setPreferredSize(new Dimension(800, 300));
        setBackground(Color.WHITE);
        addKeyListener(this);
        setFocusable(true);

        timer = new Timer(20, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Gambar dino
        g.setColor(Color.BLACK);
        g.fillRect(100, dinoY, 30, 30);

        // Gambar penghalang
        g.setColor(Color.RED);
        g.fillRect(obstacleX, groundY - 20, 20, 20);

        // Tampilkan skor
        g.setColor(Color.BLACK);
        g.drawString("Skor: " + score, 10, 20);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Gerakan dino
        dinoY += dinoSpeedY;
        dinoSpeedY += 1;

        // Deteksi lompatan dino
        if (dinoY >= groundY) {
            dinoY = groundY;
            isJumping = false;
        }

        // Gerakan penghalang
        obstacleX -= 5;
        if (obstacleX < -20) {
            obstacleX = 800;
            score++;
        }

        // Deteksi tabrakan
        if (dinoY + 30 >= groundY && obstacleX <= 130 && obstacleX >= 100) {
            timer.stop();
            System.out.println("Game Over! Skor Anda: " + score);
        }

        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE && !isJumping) {
            isJumping = true;
            dinoSpeedY = -15;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Dino Chrome Game");
        DinoGame game = new DinoGame();
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
