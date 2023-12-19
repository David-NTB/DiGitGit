package BelajarSwing;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

    // JFrame = a GUI window to add components to

    MyFrame(){

        this.setTitle("Ini JFrame"); // sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of aplication
        this.setResizable(false); // prevent frame from being resized
        this.setSize(420, 420); // set x-dimension and y-dimension of frame
        this.setVisible(true); // make frame visible

        ImageIcon image = new ImageIcon("Logo.png"); // create an image icon
        this.setIconImage(image.getImage()); // change icon of frame
        this.getContentPane().setBackground(new Color(250,150,50)); //change color of background
    
    }
}
