package Ex12_10;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class checkerBoard {
    public static void main(String [] args){
        JFrame frame = new JFrame("Exercise12_10");
        GridLayout gridLayout = new GridLayout(0, 8, 0, 0);
        frame.setLayout(gridLayout);

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if((j + i) % 2 == 0){
                   frame.add(new JButton("")).setBackground(Color.WHITE); 
                }
                else{
                   frame.add(new JButton("")).setBackground(Color.BLACK);  
                }
            }
        }
       
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
}
