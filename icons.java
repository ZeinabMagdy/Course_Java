package Ex12_06;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class icons {
    public static void main(String [] args){
        JFrame frame = new JFrame("Exercise12_6");
        GridLayout gridLayout = new GridLayout(2, 2, 0, 0);
        frame.setLayout(gridLayout);
        Border border = new LineBorder(Color.YELLOW, 1); 
        
        ImageIcon im1 = new ImageIcon("image_2/بطبوطة.png");
        ImageIcon im2 = new ImageIcon("image_2/بطبوطة2.png");
        ImageIcon im3 = new ImageIcon("image_2/بطبوطة3.png");
        ImageIcon im4 = new ImageIcon("image_2/بطبوطة4.png");
        JLabel label1 = new JLabel(im1);
        JLabel label2 = new JLabel(im2);
        JLabel label3 = new JLabel(im3);
        JLabel label4 = new JLabel(im4);
        label1.setBorder(border);
        label2.setBorder(border);
        label3.setBorder(border);
        label4.setBorder(border);
        
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        
        frame.setSize(250, 250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
