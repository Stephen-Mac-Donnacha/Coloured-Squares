import java.awt.*;
import javax.swing.*;
public class MyApplication extends JFrame{
    private static final Dimension WindowSize = new Dimension(600,600);
    public MyApplication() {
    //Create and set up the window.
        this.setTitle("NGT Assignment");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //Display the window, centred on the screen
        Dimension screensize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int x = screensize.width/2 - WindowSize.width/2;
        int y = screensize.height/2 - WindowSize.height/2;
        setBounds(x, y, WindowSize.width, WindowSize.height);
        setVisible(true);
        Graphics g = null;

    }

    public void paint(Graphics g){
      
        int x = 15;
        int y = 40;
        while(x < WindowSize.width && y < WindowSize.height){ // loop until we get to the end of the screen
            while(x < WindowSize.width){
                int red = (int)(Math.random() * 256);
                int blue = (int)(Math.random() * 256);
                int green = (int)(Math.random() * 256);
                Color color = new Color(red,green,blue); //create a new color object passing in the 3 randomly generated values
                g.setColor(color);
                g.fillRect(x,y,30,30);
                x += 50;
                if(x > WindowSize.width){ //if we get to the end start a new line
                     x = 10;
                     y += 40;
                }
            }
        }
    }
 

public static void main(String[] args){
    MyApplication m = new MyApplication();
}
}