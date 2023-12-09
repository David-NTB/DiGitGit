import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class SnakeGame extends JFrame implements ActionListener, KeyListener {
    private static final int GRID_SIZE = 20;
    private static final int TILE_SIZE = 20;

    private int[][] grid;
    private int snakeLength;
    private int[] snakeX, snakeY;
    private int foodX, foodY;
    private boolean isGameOver;

    private Timer timer;

    public SnakeGame() {
        grid = new int[GRID_SIZE][GRID_SIZE];
        snakeLength = 1;
        snakeX = new int[GRID_SIZE * GRID_SIZE];
        snakeY = new int[GRID_SIZE * GRID_SIZE];
        snakeX[0] = GRID_SIZE / 2;
        snakeY[0] = GRID_SIZE / 2;
        spawnFood();

        isGameOver = false;

        timer = new Timer(150, this);
        timer.start();

        setTitle("Snake Game");
        setSize(GRID_SIZE * TILE_SIZE, GRID_SIZE * TILE_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        addKeyListener(this);
        setVisible(true);
    }

    public void spawnFood() {
        Random random = new Random();
        foodX = random.nextInt(GRID_SIZE);
        foodY = random.nextInt(GRID_SIZE);

        while (grid[foodY][foodX] != 0) {
            foodX = random.nextInt(GRID_SIZE);
            foodY = random.nextInt(GRID_SIZE);
        }
    }

    public void checkCollision() {
        if (snakeX[0] < 0 || snakeX[0] >= GRID_SIZE || snakeY[0] < 0 || snakeY[0] >= GRID_SIZE) {
            isGameOver = true;
        }

        for (int i = 1; i < snakeLength; i++) {
            if (snakeX[i] == snakeX[0] && snakeY[i] == snakeY[0]) {
                isGameOver = true;
            }
        }

        if (snakeX[0] == foodX && snakeY[0] == foodY) {
            snakeLength++;
            spawnFood();
        }
    }

    public void move() {
        for (int i = snakeLength - 1; i > 0; i--) {
            snakeX[i] = snakeX[i - 1];
            snakeY[i] = snakeY[i - 1];
        }

        switch (grid[snakeY[0]][snakeX[0]]) {
            case 1:
                snakeX[0]++;
                break;
            case 2:
                snakeX[0]--;
                break;
            case 3:
                snakeY[0]++;
                break;
            case 4:
                snakeY[0]--;
                break;
        }
    }

    public void updateGrid() {
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                grid[i][j] = 0;
            }
        }

        for (int i = 0; i < snakeLength; i++) {
            grid[snakeY[i]][snakeX[i]] = 1;
        }

        grid[foodY][foodX] = 2;
    }

    public void actionPerformed(ActionEvent e) {
        if (!isGameOver) {
            move();
            checkCollision();
            updateGrid();
            repaint();
        } else {
            timer.stop();
            JOptionPane.showMessageDialog(this, "Game Over! Your score: " + (snakeLength - 1), "Game Over", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.clearRect(0, 0, getWidth(), getHeight());

        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                if (grid[i][j] == 1) {
                    g.setColor(Color.GREEN);
                    g.fillRect(j * TILE_SIZE, i * TILE_SIZE, TILE_SIZE, TILE_SIZE);
                } else if (grid[i][j] == 2) {
                    g.setColor(Color.RED);
                    g.fillOval(j * TILE_SIZE, i * TILE_SIZE, TILE_SIZE, TILE_SIZE);
                }
            }
        }
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_RIGHT && grid[snakeY[0]][snakeX[0] + 1] != 1) {
            grid[snakeY[0]][snakeX[0]] = 1;
            grid[snakeY[0]][snakeX[0] + 1] = 3;
        } else if (key == KeyEvent.VK_LEFT && grid[snakeY[0]][snakeX[0] - 1] != 1) {
            grid[snakeY[0]][snakeX[0]] = 1;
            grid[snakeY[0]][snakeX[0] - 1] = 4;
        } else if (key == KeyEvent.VK_UP && grid[snakeY[0] - 1][snakeX[0]] != 1) {
            grid[snakeY[0]][snakeX[0]] = 1;
            grid[snakeY[0] - 1][snakeX[0]] = 2;
        } else if (key == KeyEvent.VK_DOWN && grid[snakeY[0] + 1][snakeX[0]] != 1) {
            grid[snakeY[0]][snakeX[0]] = 1;
            grid[snakeY[0] + 1][snakeX[0]] = 1;
        }
    }

    public void keyTyped(KeyEvent e) {}

    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        new SnakeGame();
    }
}
