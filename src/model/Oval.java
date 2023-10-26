package model;

import java.awt.*;

public class Oval extends Canvas {
    Color color;
    int x;
    int y;
    int width;
    int height;

    public void setConf(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public void paint(Graphics g) {
        g.drawOval(this.x,this.y,this.width,this.height);
        g.setColor(this.color);
    }

}
