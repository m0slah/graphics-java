import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class myFrame1 extends JFrame{
    public myFrame1(){
        setTitle("My First Frame");
                setSize(400,500);
    }

    public static void main(String[] a) {
        JFrame frame = new myFrame1();
        frame.show();
    }
}