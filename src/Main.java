import model.ImageCreator;
import model.Oval;
import view.Window;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Window window = new Window("Traffic Light");
        ImageCreator displayGraphics = new ImageCreator();
        window.add(displayGraphics);
        /**
        Oval oval = new Oval();
        oval.setConf(100, 100, 50, 50, Color.RED);
        window.add(oval);
        Oval oval1 = new Oval();
        oval1.setConf(100, 175, 50, 50, Color.YELLOW);
        window.add(oval1);
         */
        window.create();


    }
}
