package gui;

import javax.swing.*;
import java.awt.*;

public class MarqueePanel extends JPanel implements Runnable {
    private final String str;
    private int x;
    private final int y;
    private int flag;

    public MarqueePanel(String s) {
        setBackground(Color.PINK);
        str = s;
        x = 0;
        y = 200;
        flag = 1;
        new Thread(this).start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        float f = 20.0f; // font size.
        g.setFont(g.getFont().deriveFont(f));
        g.drawString(str, x, y);
    }

    public void update() {
        x = x + 10 * flag;
        if (x > this.getWidth()) {
            x = 0;
        }
    }

    @Override
    public void run() {
        while (true) {
            repaint();
            update();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted " + e);
            }
        }
    }

}
