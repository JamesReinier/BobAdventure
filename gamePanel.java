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
            bob = new Rectangle(200,250,20,20,10);   
            room.add(new Rectangle(100,100, 300, 20, 0));//this makes the top part of room
            room.add(new Rectangle(100,100,20, 300, 0)); //makes left wall
            room.add(new Rectangle(100, 380,300,20,0));//makes floor
            room.add(new Rectangle(380,100,20,300,0));//right wall
            
            room.add(new Rectangle( 330  ,120, 40, 60, 0));
            room.add(new Rectangle(140,125,50,30,0));
            isFocusable();
           setFocusable(true);
           addKeyListener(new MyKeyListener());
        }
        
        public void paintComponent(Graphics g){
         super.paintComponent(g);   
          setFocusable(true);  
          
            bob.draw(g);
            for(int i = 0; i < room.size(); i++){
                
             Rectangle temp = room.get(i);   
                temp.draw(g);
            }
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
