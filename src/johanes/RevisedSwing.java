/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johanes;

/**
 *
 * @author acer
 */
import javax.swing.JFrame;
public class RevisedSwing {
 public static void main(String[] args) {
    // Create a frame
    JFrame frame = new JFrame("Revised Simplest Swing");
 // Set the default close behavior to exit the application
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 // Set the x, y, width and height properties in one go
 frame.setBounds(50, 50, 200, 200);
 // Display the frame
 frame.setVisible(true);
 }
}