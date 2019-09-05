package h04;
import java.awt.*;
import java.applet.*;

public class h04o01 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(100,250,300,250);
        g.drawLine(100,250,200,100);
        g.drawLine(300,250,200,100);
    }
}
