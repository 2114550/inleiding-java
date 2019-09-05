package h04;

import java.awt.*;
import java.applet.*;

public class h04o07 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        //Side
        g.drawRoundRect(100,100,200,200,90,90);

        //Number
        g.fillArc(130,130,50,50,0,360);
        g.fillArc(220,130,50,50,0,360);
        g.fillArc(130,220,50,50,0,360);
        g.fillArc(220,220,50,50,0,360);
    }
}