package h04;

import java.awt.*;
import java.applet.*;

public class h04o06 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        //Form
        g.setColor(Color.gray);
        g.fillRoundRect(100,120,100,200,60,60);

        //Lights
        g.setColor(Color.red);
        g.fillArc(130,140,40,40,0,360);
        g.setColor(Color.orange);
        g.fillArc(130,200,40,40,0,360);
        g.setColor(Color.green);
        g.fillArc(130,260,40,40,0,360);
    }
}