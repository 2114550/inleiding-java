package h02;
import java.awt.*;
import java.applet.*;

public class h02o02 extends Applet {

    public void init() {
        setBackground(Color.white);
    }
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Wahid", 100, 60 );
        g.setColor(Color.red);
        g.drawString("Mamedov", 100, 70);
    }

}
