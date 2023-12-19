package BelajarSwing;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MyLabel {
    
    // JLabel = a GUI display area for a String text, an image, or both

    MyLabel () {
        ImageIcon image = new ImageIcon("Logo.png");
        Border border = BorderFactory.createLineBorder(Color.GREEN, 2);
     
        JLabel label = new JLabel(); // create a label
        label.setText("Hello World..!"); // set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of ImageIcon
        label.setVerticalTextPosition(JLabel.BOTTOM); // set text TOP, CENTER, BOTTOM of ImageIcon
        label.setForeground(new Color(250,150,50)); // set font color of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // set font of text
        label.setIconTextGap(-75); // set gap of text to image
        label.setBackground(Color.BLACK); // set background color
        label.setOpaque(true); // display background color
        label.setBorder(border);
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon+text within label
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
        // label.setBounds(0, 0, 255, 255); // set x,y position within frame as well as dimensions

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(420, 420);
        // frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}
