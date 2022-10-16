
package Ex12_02;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class testBorderLayout {
    public static void main(String []args){
        JFrame frame = new JFrame("Exercise12_2");
        BorderLayout borderLayout = new BorderLayout(0, 0);
        frame.setLayout(borderLayout);
        JPanel jp1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JPanel jp2 = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        
        JButton Jb1 = new JButton("Button1");
        JButton Jb2 = new JButton("Button2");
        JButton Jb3 = new JButton("Button3");
        JButton Jb4 = new JButton("Button4");
        JButton Jb5 = new JButton("Button5");
        JButton Jb6 = new JButton("Button6");
        
        jp1.add(Jb1);
        jp1.add(Jb2);
        jp1.add(Jb3);
        jp2.add(Jb4);
        jp2.add(Jb5);
        jp2.add(Jb6);
        
        
        
        frame.add(jp1, BorderLayout.SOUTH);
        
        frame.add(jp2, BorderLayout.CENTER);
        frame.setSize(600, 100);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}