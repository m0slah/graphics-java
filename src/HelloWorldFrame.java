import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class HelloWorldFrame extends JFrame {
    public HelloWorldFrame(){
        setTitle("Hello World");
        setSize(300,200);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        Container contentPane=getContentPane();
    contentPane.add(new HelloWorldPanel());
    }
}