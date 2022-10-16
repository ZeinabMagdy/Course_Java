package Ex12_05;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class labels {
    public static void main(String [] args){
        JFrame frame = new JFrame("Ex12_5");
        GridLayout gridLayout = new GridLayout(4, 1, 0, 0);
        frame.setLayout(gridLayout);
        Border border = new LineBorder(Color.black, 1); 
    
        JLabel label1 = new JLabel("Deparement of Computer Science");
        JLabel label2 = new JLabel("School of Computing");
        JLabel label3 = new JLabel("Armstrong Altanic State University");
        JLabel label4 = new JLabel("Tei:(912) 921-6440");
        
        
        label1.setBorder(border);
        label2.setBorder(border);
        label3.setBorder(border);
        label4.setBorder(border);
        
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        
        
        frame.setSize(225, 150);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    
    }
              
}
