package h04;
import java.awt.*;
import java.applet.*;

public class h04oVragen extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.drawString("De Vragen",50,60);
        g.drawString("1: Een platform is een basis waar softwares",50,75);
        g.drawString(" en dergelijke op worden ontwikkeld",50,90);
        g.drawString("2: ",50,105);
    }
}
