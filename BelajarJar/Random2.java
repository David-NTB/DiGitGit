import javax.swing.*;
import java.awt.*;

public class Random2 extends JFrame {
    private JTextArea textArea;

    public Random2() {
        setTitle("Terminal Panel Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat panel utama
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Membuat JTextArea untuk menampilkan teks
        textArea = new JTextArea();
        textArea.setEditable(false);  // Membuatnya tidak dapat diedit
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Menambahkan JTextArea ke panel utama
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // Menambahkan panel utama ke frame
        add(mainPanel);

        // Menambahkan beberapa teks ke JTextArea (opsional)
        textArea.append("Welcome to the Java Terminal!\n");
        textArea.append("Type your commands here.\n");

        // Konfigurasi frame
        setSize(400, 300);
        setLocationRelativeTo(null); // Memusatkan frame di tengah layar
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Random2 example = new Random2();
            example.setVisible(true);
        });
    }
}
