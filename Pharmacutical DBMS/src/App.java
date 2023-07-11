import java.awt.FlowLayout;  
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel;  


public class App{  

    public static JFrame CreateFrame(String s){
            JFrame frame = new JFrame(s); 
            return frame;
        }
    
     
        
    public static void main(String[] args){
        JFrame f1 = CreateFrame("Pharmacy DBMS");
    }
}  
