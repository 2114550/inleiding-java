package h04;

import java.awt.*;
import java.applet.*;

public class h04o03 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {

        //Flagstaff
        g.drawRect(40,40,10,240);
        g.setColor(Color.gray);
        g.fillRect(40,40,10,240);

        //Flag
        g.setColor(Color.red);
        g.fillRect(50,40,120,30);
        g.setColor(Color.white);
        g.fillRect(50,70,120,30);
        g.setColor(Color.blue);
        g.fillRect(50,100,120,30);
        g.setColor(Color.black);
        g.drawRect(50,40,120,90);
    }
}