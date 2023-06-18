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
import javax.swing.JButton;
import java.awt.Container;
public class AddingComponentToJframe {
 public static void main(String[] args) {
 JFrame frame = new JFrame("Adding Component to JFrame");
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 Container contentPane = frame.getContentPane();
 // Add a close button
 JButton closeButton = new JButton("Close");
 contentPane.add(closeButton);
 // set the size of the frame 300 x 200
 frame.setBounds(50, 50, 300, 200);
 frame.setVisible(true);
 }
}
