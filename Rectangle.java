
import javax.swing.*;
import java.awt.*;
public class Rectangle {
    
   private int x,y,hit,wid, spd;   
    private Color c;
    
    public Rectangle(int x, int y, int height, int width, int spd){
     this.x = x;
     this.y = y;
     this.hit = height;
     this.wid = width;   
     this.spd =  spd;
     
    }
    
    public Rectangle(){
     x = 10;   
     y = 10;   
     hit = 10;   
     wid = 10;  
     spd = 10;
    }
    
    public void draw(Graphics woo){
     woo.setColor(c);   
      woo.drawRect(x,y,hit,wid);  
        
    }
    
    
    public double getHeight(){
       return(hit);
        
        
      }
    public double getWidth(){
     return(wid);   
    }
    
    public void moveUp(gamePanel e){
      y -= spd;  
       if(y < 0 + hit){
         y =+ 10;  
        }
        
    }
    
     public void moveDown(gamePanel e){
      y += spd;  
      if(y > e.getHeight() - hit){
         y -= 10; 
        }
        
    }
    
     public void moveRight(gamePanel e){
      x += spd;  
      if(x > e.getWidth() - wid){  
        x -= 10;
          
      }
    }
    
     public void moveLeft(gamePanel e){
      x -= spd;  
      if(x < 0){
      x += 10;    
          
          
      }
        
    }
    
}
   