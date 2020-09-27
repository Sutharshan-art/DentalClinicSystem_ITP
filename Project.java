/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author User
 */
public class Project extends JFrame{
    

        
    JLabel pic;
    Timer tm;
    int x= 0, y = 100;
    
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
        Font font = new Font("Tahoma",Font.BOLD+Font.PLAIN,90);
        g2.setFont(font);
        g2.setColor(Color.red);
        g2.drawString(" It is all about supplier system",x,y);
        
        try {
            Thread.sleep(200);
        } catch (Exception e) {
            x+=10;
            if(x > this.getWidth()){
            x = 0;
            }
            repaint();
        }
        
    }
    
    String[] list = {
   // "C:/Users/User/Desktop/New/Medicine/one.jpg",
     "C:/Users/ADMIN/Desktop/New - Copy/Medicine/two.jpg",
     "C:/Users/ADMIN/Desktop/New - Copy/Medicine/three.jpg",
    "C:/Users/ADMIN/Desktop/New - Copy/Medicine/five.jpg",
   "C:/Users/ADMIN/Desktop/New - Copy/Medicine/six.jpg",
     "C:/Users/ADMIN/Desktop/New - Copy/Medicine/seven.jpg",
   "C:/Users/ADMIN/Desktop/New - Copy/Medicine/eight.jpg",
    "C:/Users/ADMIN/Desktop/New - Copy/Medicine/nine.jpg",
    "C:/Users/ADMIN/Desktop/New - Copy/Medicine/ten.jpg",
   "C:/Users/ADMIN/Desktop/New - Copy/Medicine/eleven.jpg",
   "C:/Users/ADMIN/Desktop/New - Copy/Medicine/twelve.jpg",
    "C:/Users/ADMIN/Desktop/New - Copy/Medicine/thirteen.jpg",
     "C:/Users/ADMIN/Desktop/New - Copy/Medicine/fourteen.jpg",
     "C:/Users/ADMIN/Desktop/New - Copy/Medicine/fifteen.jpg",
     "C:/Users/ADMIN/Desktop/New - Copy/Medicine/sixteen.jpg",


    };
    
    public Project(){
 
        super("Java AlideShow");
        pic =new JLabel();
        pic.setBounds(40,300,950,400);
         setSize(1370,750);
       // setLocation(450,200);
        setResizable(false);
        setImageSize(13);
        
        tm =new Timer(2000,new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
        setImageSize(x);
        x += 1;
        if(x>= list.length)
                x = 0;
            
            }
        });
        
        add(pic);
        tm.start();
        setLayout(null);
        setSize(1400,700);
        getContentPane().setBackground(Color.decode("#2EFE9A"));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void setImageSize(int i){
    ImageIcon icon = new ImageIcon(list[i]);
    Image img = icon.getImage();
    Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon newImc = new ImageIcon(newImg);
    pic.setIcon(newImc);
    }
    public static void main(String [] args){
    new Project();
    JFrame jf = new JFrame("East");
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.setSize(700,200);
    jf.add(new Project());
    jf.setVisible(true);
    }
}
