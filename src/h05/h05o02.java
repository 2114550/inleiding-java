package h05;

import java.awt.*;
import java.applet.*;

public class h05o02 extends Applet {
    //declaratie.
    int Valerie;
    int Jeroen;
    int Hans;
    int hoogstexas;

    public void init() {
        setBackground(Color.white);
        //initialisatie.
        setSize(300,300);
        Valerie = 45;
        Jeroen = 80;
        Hans = 60;
        hoogstexas = 300;
    }

    public void paint(Graphics g) {

        //Graph
        g.drawLine(100,100,100,300);
        g.drawLine(100,300,350,300);
        g.drawLine(100,260,105,260);
        g.drawLine(100,240,105,240);
        g.drawLine(100,220,105,220);
        g.drawLine(100,200,105,200);
        g.drawLine(100,180,105,180);
        g.drawLine(100,160,105,160);
        g.drawLine(100,140,105,140);

        //Texts
        g.drawString("Gewicht in KG",10,300);
        g.drawString("Valerie",120,320);
        g.drawString("Jeroen",200,320);
        g.drawString("Hans",280,320);

        //Weights
        g.drawString("40",80,265);
        g.drawString("60",80,245);
        g.drawString("80",80,225);
        g.drawString("100",75,205);
        g.drawString("120",75,185);
        g.drawString("140",75,165);
        g.drawString("160",75,145);

        //Graph-Blocks
        g.setColor(Color.red);
        g.fillRect(125,hoogstexas - Valerie,40,Valerie);
        g.setColor(Color.blue);
        g.fillRect(205,hoogstexas - Jeroen,40,Jeroen);
        g.setColor(Color.green);
        g.fillRect(280,hoogstexas - Hans,40,Hans);
    }
}