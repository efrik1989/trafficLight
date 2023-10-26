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
        g.fillRoundRect(115,115,80, 225, 15, 15);
        g.fillArc(120,100, 70, 20, 0, 180);
        g.fillPolygon(new int[] {110, 110, 70}, new int[] {130, 170, 130}, 3);
        g.fillPolygon(new int[] {110, 110, 70}, new int[] {200, 240, 200}, 3);
        g.fillPolygon(new int[] {110, 110, 70}, new int[] {270, 310, 270}, 3);
        g.fillPolygon(new int[] {200, 200, 240}, new int[] {130, 170, 130}, 3);
        g.fillPolygon(new int[] {200, 200, 240}, new int[] {200, 240, 200}, 3);
        g.fillPolygon(new int[] {200, 200, 240}, new int[] {270, 310, 270}, 3);

        g.fillRoundRect(135,345, 40, 50, 15, 15);

        g.setColor(Color.RED);
        g.fillOval(130,130,50, 60);
        g.setColor(Color.YELLOW);
        g.fillOval(130,200,50, 60);
        g.setColor(Color.GREEN);
        g.fillOval(130,270,50, 60);
    }

}
