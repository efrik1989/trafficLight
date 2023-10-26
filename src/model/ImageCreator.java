package model;

import java.awt.*;

public class ImageCreator extends Canvas {

    @Override
    public void paint(Graphics g) {
        /**
        setBackground(Color.WHITE);
        Oval oval = new Oval();
        oval.setConf(100, 100, 50, 50, Color.RED);
        oval.paint(g);
        */


        setBackground(Color.WHITE);
        g.setColor(Color.DARK_GRAY);
        g.fillRoundRect(115,115,90, 225, 15, 15);
        g.fillArc(120,100, 80, 20, 0, 180);
        g.fillPolygon(new int[] {110, 110, 70}, new int[] {130, 170, 130}, 3);
        g.fillPolygon(new int[] {110, 110, 70}, new int[] {200, 240, 200}, 3);
        g.fillPolygon(new int[] {110, 110, 70}, new int[] {270, 310, 270}, 3);
        g.fillPolygon(new int[] {210, 210, 250}, new int[] {130, 170, 130}, 3);
        g.fillPolygon(new int[] {210, 210, 250}, new int[] {200, 240, 200}, 3);
        g.fillPolygon(new int[] {210, 210, 250}, new int[] {270, 310, 270}, 3);

        g.fillRoundRect(135,345, 50, 50, 15, 15);

        g.setColor(Color.WHITE);
        g.fillOval(128,120,64, 64);
        g.fillOval(128,190,64, 64);
        g.fillOval(128,260,64, 64);

        g.setColor(Color.DARK_GRAY);
        g.fillOval(128,128,64, 64);
        g.fillOval(128,198,64, 64);
        g.fillOval(128,268,64, 64);

        g.setColor(Color.RED);
        g.fillOval(131,131,58, 58);
        g.setColor(Color.YELLOW);
        g.fillOval(131,201,58, 58);
        g.setColor(Color.GREEN);
        g.fillOval(131,271,58, 58);
    }

}
