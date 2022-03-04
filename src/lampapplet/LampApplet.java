/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lampapplet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author ahmed
 */
public class LampApplet extends Applet implements Runnable {

    Color[] c = {Color.YELLOW, Color.GREEN, Color.RED};
    int indx = 0;
    Thread th;

    @Override
    public void init() {

        th = new Thread(this);
        th.start();
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(c[indx]);
        g.fillOval(500, 20, 500, 70);
        g.fillOval(650, 150, 200, 300);
        g.fillOval(475, 200, 100, 150);
        g.fillOval(925, 200, 100, 150);
        g.setColor(Color.BLACK);
        g.drawOval(500, 20, 500, 70);
        g.drawLine(500, 55, 350, 400);
        g.drawLine(1000, 55, 1150, 400);        
        g.setColor(Color.BLACK);
        g.drawOval(650, 150, 200, 300);
        g.drawOval(475, 200, 100, 150);
        g.drawOval(925, 200, 100, 150);
        g.drawArc(350, 275, 800, 250, 0, -180);
        g.drawLine(725, 525, 625, 800);
        g.drawLine(775, 525, 875, 800);
        g.drawRect(500, 800, 500, 100);
    }

    @Override
    public void run() {
        while (true) {
            if (indx == 2) {
                indx = 0;
            } else {
                indx++;
            }
            repaint();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {

            }
        }
    }
}
