package h04;

import java.awt.*;
import java.applet.*;

public class h04o04 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);

        //Graph
        g.drawLine(100,100,100,300);
        g.drawLine(100,300,350,300);
        g.drawLine(100,260,105,260);
        g.drawLine(100,220,105,220);
        g.drawLine(100,180,105,180);
        g.drawLine(100,140,105,140);

        //Texts
        g.drawString("Gewicht in KG",10,300);
        g.drawString("Valerie",120,320);
        g.drawString("Jeroen",200,320);
        g.drawString("Hans",280,320);
        g.drawString("40",80,265);
        g.drawString("60",80,225);
        g.drawString("80",80,185);
        g.drawString("100",75,145);

        //Graph-Blocks
        g.setColor(Color.red);
        g.fillRect(125,260,40,40);
        g.setColor(Color.blue);
        g.fillRect(205,140,40,160);
        g.setColor(Color.green);
        g.fillRect(280,180,40,120);
    }
}
