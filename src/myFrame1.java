import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class myFrame1 extends JFrame {
    public myFrame1() {
        Toolkit tk=Toolkit.getDefaultToolkit();
        Dimension d=tk.getScreenSize();
        int sHeight=d.height;
        int sWidth=d.width;
        setSize(sWidth/2,sHeight/2);
        setLocation(sWidth/4,sHeight/4);
    }

    public static void main(String[] a) {
        JFrame frame = new myFrame1();
        frame.setVisible(true);
    }
}