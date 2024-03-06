import javax.swing.*;
import java.awt.*;

class HelloWorldPanel extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("Hello World", 75, 100);}
}
