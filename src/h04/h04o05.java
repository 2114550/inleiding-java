package h04;

import java.awt.*;
import java.applet.*;

public class h04o05 extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);

        //Ellips
        g.fillArc(50,50,100,100,0,360);
    }
}