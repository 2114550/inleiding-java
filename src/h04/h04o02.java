package h04;

import java.awt.*;
import java.applet.*;

public class h04o02 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);

        //House body
        g.drawRect(100,250,200,200);

        //House roof
        g.drawLine(100,250,300,250);
        g.drawLine(100,250,200,100);
        g.drawLine(300,250,200,100);

        //House door
        g.drawRect(130,350,50,100);

        //House window
        g.drawRect(225,350,50,50);
    }
}