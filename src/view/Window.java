package view;
import model.ImageCreator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Window extends JFrame{

    public Window(String title) throws HeadlessException {
        super();
    }

    public void create() {
        setLocation(200,300);
        setSize(600,600);
        setVisible(true);
        addWindowListener(new WindowListener() {

            public void windowActivated  (WindowEvent event) {}
            public void windowClosed     (WindowEvent event) {}
            public void windowDeactivated(WindowEvent event) {}
            public void windowDeiconified(WindowEvent event) {}
            public void windowIconified  (WindowEvent event) {}
            public void windowOpened     (WindowEvent event) {}
            // Метод обработки события "Закрытие окна"
            public void windowClosing (WindowEvent event) {
                event.getWindow().setVisible(false);
                System.exit(0);};
        });
    }
}


