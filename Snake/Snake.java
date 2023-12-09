import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

public class Snake extends JFrame implements ActionListener, KeyListener {
    private ArrayList<Point> snake;
    private Point food;
    private int direction;
    private boolean isGameOver;

    private Timer timer;

    public Snake() {
        setTitle("Snake Game");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        snake = new ArrayList<>();
        snake.add(new Point(5, 5));
        direction = KeyEvent.VK_RIGHT; // Default direction
        isGameOver = false;

        spawnFood();

        timer = new Timer(100, this);
        timer.start();

        addKeyListener(this);
        setFocusable(true);
        setVisible(true);
    }

    private void spawnFood() {
        Random random = new Random();
        int x = random.nextInt(20);
        int y = random.nextInt(20);
        food = new Point(x, y);

        while (snake.contains(food)) {
            x = random.nextInt(20);
            y = random.nextInt(20);
            food = new Point(x, y);
        }
    }

    private void move() {
        Point head = snake.get(0);
        Point newHead;

        switch (direction) {
            case KeyEvent.VK_UP:
                newHead = new Point(head.x, head.y - 1);
                break;
            case KeyEvent.VK_DOWN:
                newHead = new Point(head.x, head.y + 1);
                break;
            case KeyEvent.VK_LEFT:
                newHead = new Point(head.x - 1, head.y);
                break;
            case KeyEvent.VK_RIGHT:
                newHead = new Point(head.x + 1, head.y);
                break;
            default:
                newHead = head;
        }

        if (newHead.equals(food)) {
            snake.add(0, food);
            spawnFood();
        } else {
            snake.add(0, newHead);
            snake.remove(snake.size() - 1);
        }

        checkCollision();
        repaint();
    }

    private void checkCollision() {
        Point head = snake.get(0);

        if (head.x < 0 || head.x >= 20 || head.y < 0 || head.y >= 20 || snake.subList(1, snake.size()).contains(head)) {
            isGameOver = true;
            timer.stop();
            JOptionPane.showMessageDialog(this, "Game Over!", "Game Over", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (!isGameOver) {
            move();
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.clearRect(0, 0, getWidth(), getHeight());

        for (Point point : snake) {
            g.setColor(Color.GREEN);
            g.fillRect(point.x * 20, point.y * 20, 20, 20);
        }

        g.setColor(Color.RED);
        g.fillRect(food.x * 20, food.y * 20, 20, 20);
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if ((key == KeyEvent.VK_UP && direction != KeyEvent.VK_DOWN) ||
            (key == KeyEvent.VK_DOWN && direction != KeyEvent.VK_UP) ||
            (key == KeyEvent.VK_LEFT && direction != KeyEvent.VK_RIGHT) ||
            (key == KeyEvent.VK_RIGHT && direction != KeyEvent.VK_LEFT)) {
            direction = key;
        }
    }

    public void keyTyped(KeyEvent e) {}

    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        new Snake();
    }
}
