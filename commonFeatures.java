package Ex12_08;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class commonFeatures {
    public static void main(String [] args){
        JFrame frame = new JFrame("Exercise12_8");
        GridLayout gridLayout = new GridLayout(2, 2, 0, 0);
        frame.setLayout(gridLayout);
        
        frame.setBackground(Color.white);
        
        
        JLabel label1 = new JLabel("bluck");
        JLabel label2 = new JLabel("blue");
        JLabel label3 = new JLabel("cyan");
        JLabel label4 = new JLabel("green");
        JLabel label5 = new JLabel("magenta");
        JLabel label6 = new JLabel("orange");
        
        
        Color color = Color.BLACK;
        label1.setForeground(color);
        label2.setForeground(color.blue);
        label3.setForeground(color.cyan);
        label4.setForeground(color.green);
        label5.setForeground(color.magenta);
        label6.setForeground(color.orange);
        
        //لية الابيض مش باين
        label1.setBackground(Color.white);
        label2.setBackground(Color.white);
        label3.setBackground(Color.white);
        label4.setBackground(Color.white);
        label5.setBackground(Color.white);
        label6.setBackground(Color.white);

        
        Border border = new LineBorder(Color.yellow, 1); 
        label1.setBorder(border);
        label2.setBorder(border);
        label3.setBorder(border);
        label4.setBorder(border);
        label5.setBorder(border);
        label6.setBorder(border);
        
        
        Font font = new Font("TimesRoman", Font.BOLD, 20);
        label1.setFont(font);
        label2.setFont(font);
        label3.setFont(font);
        label4.setFont(font);
        label5.setFont(font);
        label6.setFont(font);
        
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(label6);
        
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        
        
        
        
        
    }
}
