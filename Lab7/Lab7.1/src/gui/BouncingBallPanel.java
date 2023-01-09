package gui;

import javax.swing.*;
import java.awt.*;

public class BouncingBallPanel extends JPanel implements Runnable {
    private final int Diameter;
    private int x;
    private int y;
    private int deltax = 10;
    private int deltay = 10;

    public BouncingBallPanel() {
        setBackground(Color.pink);
        x = 0;
        y = 0;
        Diameter = 30;
        new Thread(this).start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(x, y, Diameter, Diameter);
    }

    public void update() {
        x += deltax;
        y += deltay;
        if (x < 0) { //out of frame
            x = 0;
            deltax = -deltax;
        }
        if (x + Diameter >= this.getWidth()) {
            x = this.getWidth() - Diameter;
            deltax = -deltax;
        }
        if (y < 0) { // out of frame
            y = 0;
            deltay = -deltay;
        }
        if (y + Diameter >= this.getHeight()) {
            y = this.getHeight() - Diameter;
            deltay = -deltay;
        }
    }

    @Override
    public void run() {
        while (true) {
            repaint();
            update();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {

            }
        }
    }
}
