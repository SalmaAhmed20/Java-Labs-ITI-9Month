package gui;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class MyPanel extends JPanel implements Runnable {
    public MyPanel()
    {
        setBackground(Color.PINK);
        new Thread(this).start();
    }
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        float f = 20.0f; // font size.
        g.setFont(g.getFont().deriveFont(f));
        g.drawString(new Date().toString(),100,150);
    }

    @Override
    public void run() {
        while (true)
        {

            try {
                this.repaint();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error");
            }
        }


    }
}
