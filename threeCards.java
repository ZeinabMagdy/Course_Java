package Ex12_09;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class threeCards {
    public static void main(String [] args){
        JFrame frame = new JFrame("Ex12_9");
        GridLayout gridLayout = new GridLayout(1, 1, 5, 5);
        frame.setLayout(gridLayout);
        Border border = new LineBorder(Color.BLACK, 2);
        
        ImageIcon im1 = new ImageIcon("image_2/" + (int)(Math.random() * 52 + 1) + ".gif");
        ImageIcon im2 = new ImageIcon("image_2/" + (int)(Math.random() * 52 + 1) + ".gif");
        ImageIcon im3 = new ImageIcon("image_2/" + (int)(Math.random() * 52 + 1) + ".gif");
        
        JLabel label1 = new JLabel(im1);
        JLabel label2 = new JLabel(im2);
        JLabel label3 = new JLabel(im3);
        
        label1.setBorder(border);
        label2.setBorder(border);
        label3.setBorder(border);
        
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        
        
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    
    }
}
