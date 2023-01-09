import gui.BouncingBallPanel;
import gui.MarqueePanel;
import gui.MyPanel;

import javax.swing.*;

public class MainClass {
    public static void main(String[] args) {
        JFrame mainFrame =new JFrame("Task1");
        //MyPanel panel=new MyPanel();
        //MarqueePanel panel=new MarqueePanel("hello");
        //JPanel panel=new BouncingBallPanel();
        JPanel panel=new BouncingBallPanel();
        mainFrame.setContentPane(panel);
        mainFrame.setSize(500,400);
        mainFrame.setVisible(true);
    }
}
