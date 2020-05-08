import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class gamePanel extends JPanel
{
       
       private JButton button1,button2;
     
       private int x,y;
       
        private Rectangle bob; 
        private ArrayList<Rectangle> room = new ArrayList<Rectangle>();
    
    
        public gamePanel(Color c){ //no gods no kings no layout only ME
            
            this.setBackground(c);   
            bob = new Rectangle(100,300,20,20,10);   
            
           button1 = new JButton("Click dammit");
           button1.setBounds(20, 200, 70, 70);  //start x coord, end x coord, start y coord, end y coord
        
           button2 = new JButton("hello");
           button2.setBounds(200,200,70,70);
        
           isFocusable();
           setFocusable(true);
           addKeyListener(new MyKeyListener());
        }
        
        public void paintComponent(Graphics g){
         super.paintComponent(g);   
          setFocusable(true);  
           add(button1); 
           add(button2);
            bob.draw(g);
            try{
              Thread.sleep(10);//pauses computer to get milliseconds
            }
            
           catch(Exception e){
                
                
            }
            
            this.repaint(); 
        }
        
     public class MyKeyListener extends KeyAdapter{
       public void keyPressed(KeyEvent e)
           {   //System.out.println(e.getKeyCode()); 
         
             if(e.getKeyCode() == 40){
             //System.out.println("yeet");
             bob.moveDown(gamePanel.this);
             
            } 
            if(e.getKeyCode() == 38){
             //System.out.println("yeet2");
             bob.moveUp(gamePanel.this);
             
            } 
            if(e.getKeyCode() == 37){
             //System.out.println("yeet3");
             bob.moveLeft(gamePanel.this);
             
            } 
              if(e.getKeyCode() == 39){
                ///System.out.println("yeet4");
                bob.moveRight(gamePanel.this);
             
               } 
               //87 up. 65 left, 68 right
         
        }
        
            
            
        }
}
