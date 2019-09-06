package h04;

import java.awt.*;
import java.applet.*;

public class h04po extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        //Lijn
        g.drawString("Lijn",70,45);
        g.drawLine(20,30,140,30);

        //Rechthoek
        g.drawString("Rechthoek",50,155);
        g.drawRect(20,60,120,80);

        //Rechthoek met ovaal
        g.drawString("Rechthoek met ovaal",180,155);
        g.setColor(Color.magenta);
        g.fillRect(177,60,120,80);
        g.setColor(Color.black);
        g.drawOval(177,60,120,80);

        //Taartpunt met ovaal eromheen
        g.drawString("Taartpunt met ovaal eromheen",330,155);
        g.drawOval(350,55,120,80);
        g.setColor(Color.magenta);
        g.fillArc(350,55,120,80,0,45);
        g.setColor(Color.black);

        //Afgeronde rechthoek
        g.drawString("Afgeronde rechthoek",25,260);
        g.drawRoundRect(20,165,120,80,20,20);

        //Gevulde ovaal
        g.drawString("Gevulde ovaal",200,260);
        g.setColor(Color.magenta);
        g.fillOval(177,165,120,80);
        g.setColor(Color.black);

        //Cirkel
        g.drawString("Cirkel",395,260);
        g.drawArc(372,165,80,80,0,360);
    }
}
