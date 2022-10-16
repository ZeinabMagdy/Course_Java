package Ex12_07;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class ticTacToeBoard {
    public static void main(String [] args){
        JFrame frame = new JFrame("Exercise12_7");
        GridLayout gridLayout = new GridLayout(3, 2, 0, 0);
        frame.setLayout(gridLayout);
        Border border = new LineBorder(Color.YELLOW, 1); 
        
        JLabel label1 = new JLabel(new ImageIcon("image_2/" + (int)(Math.random() * 3) + ".png"));
        JLabel label2 = new JLabel(new ImageIcon("image_2/" + (int)(Math.random() * 3) + ".png"));
        JLabel label3 = new JLabel(new ImageIcon("image_2/" + (int)(Math.random() * 3) + ".png"));
        JLabel label4 = new JLabel(new ImageIcon("image_2/" + (int)(Math.random() * 3) + ".png"));
        JLabel label5 = new JLabel(new ImageIcon("image_2/" + (int)(Math.random() * 3) + ".png"));
        JLabel label6 = new JLabel(new ImageIcon("image_2/" + (int)(Math.random() * 3) + ".png"));
        JLabel label7 = new JLabel(new ImageIcon("image_2/" + (int)(Math.random() * 3) + ".png"));
        JLabel label8 = new JLabel(new ImageIcon("image_2/" + (int)(Math.random() * 3) + ".png"));
        JLabel label9 = new JLabel(new ImageIcon("image_2/" + (int)(Math.random() * 3) + ".png"));
           
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(label6);
        frame.add(label7);
        frame.add(label8);
        frame.add(label9);
        
        
        
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    } 
}
