package h05;

import java.awt.*;
import java.applet.*;

public class h05o01 extends Applet {
        //declaratie.
        Color opvulkleur;
        Color lijnkleur;
        int breedte;
        int hoogte;

        public void init() {
            //initialisatie.
            opvulkleur = Color.MAGENTA;
            lijnkleur = Color.BLACK;
            breedte = 200;
            hoogte = 100;
        }

        public void paint(Graphics g) {
            //Lijn
            g.drawLine(100,50,300,50);
            g.drawString("Lijn",190,70);

            //Rechthoek
            g.drawRect(100, 100, breedte, hoogte);
            g.drawString("Rechthoek",175,220);

            //Afgeronde rechthoek
            g.drawRoundRect(100, 240, breedte, hoogte, 30, 30);
            g.drawString("Afgeronde rechthoek",140,360);

            //Gevulde ovaal
            g.setColor(opvulkleur);
            g.fillOval(315, 240, breedte, hoogte);
            g.setColor(lijnkleur);
            g.drawString("Gevulde ovaal",375,360);

            //Gevulde rechthoek met ovaal
            g.setColor(opvulkleur);
            g.fillRect(315, 100, breedte, hoogte);
            g.setColor(lijnkleur);
            g.drawOval(315, 100, breedte, hoogte);
            g.drawString("Gevulde rechthoek met ovaal",335,220);

            //Taartpunt met ovaal eromheen
            g.drawOval(530,100,breedte,hoogte);
            g.setColor(opvulkleur);
            g.fillArc(530,100,breedte,hoogte,0,45);
            g.setColor(lijnkleur);
            g.drawString("Taartpunt met ovaal eromheen", 545,220);

            //Cirkel
            g.drawArc(580,240,100,hoogte,0,360);
            g.drawString("Cirkel",615,360);

        }
    }