
import javax.swing.*;
import java.awt.*;
import java.util.*;
public class newFrame { 
    public static void main (String[] args){
       
        
        JFrame frame1 = new JFrame("Game"); //names the frame and makes it
        gamePanel panel1 = new gamePanel(Color.PINK);
        panel1.setPreferredSize(new Dimension(500,500));
        
        
        
        
        frame1.add(panel1);
        frame1.pack();
        frame1.setVisible(true);
        
        
    }
   
}
