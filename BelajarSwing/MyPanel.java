package BelajarSwing;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPanel {
    
    // JPanel = a GUI component that functions as a container to hold other components

    MyPanel() {
        // ImageIcon icon = new ImageIcon("Logo.png");

        JLabel label = new JLabel();
        label.setText("It's Me..!!");
        // label.setIcon(icon);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.RIGHT);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 90, 90);
        redPanel.setLayout(new BorderLayout());
        
        JPanel orangePanel = new JPanel();
        orangePanel.setBackground(Color.orange);
        orangePanel.setBounds(0, 90, 90, 90);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.yellow);
        yellowPanel.setBounds(0, 180, 90, 90);
        

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(420, 420);
        frame.setVisible(true);
        redPanel.add(label);
        frame.add(redPanel);
        frame.add(orangePanel);
        frame.add(yellowPanel);
    }
}
