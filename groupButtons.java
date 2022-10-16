package Ex12_04;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class groupButtons {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercise12_1");
        FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT, 3, 0);
        frame.setLayout(flowLayout);
        jpanel eze = new jpanel();
        frame.add(eze.JP3);
        frame.setSize(600, 100);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
class jpanel extends JPanel{
    JPanel JP3;
    jpanel(){
        FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT, 3, 0);
        
        JButton Jb1 = new JButton("Button1");
        JButton Jb2 = new JButton("Button2");
        JButton Jb3 = new JButton("Button3");
        JButton Jb4 = new JButton("Button4");
        JButton Jb5 = new JButton("Button5");
        JButton Jb6 = new JButton("Button6");
        
        JPanel JP = new JPanel(flowLayout);
        JPanel JP2 = new JPanel(flowLayout);
        
        JP.add(Jb1);
        JP.add(Jb2);
        JP.add(Jb3);
        JP2.add(Jb4);
        JP2.add(Jb5);
        JP2.add(Jb6);
        
        JP3 = new JPanel(flowLayout);
        JP3.add(JP);
        JP3.add(JP2);
    }
}