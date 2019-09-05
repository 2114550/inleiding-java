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
        g.drawString(" en dergelijke op worden ontwikkeld.",50,90);
        g.drawString("2: Omdat Java wordt gecompileerd naar bytecode",50,105);
        g.drawString(" voor een virtuele machine, de JVM (Java Virtual Machine).",50,120);
        g.drawString("3: Bytecode is een soort machinetaal,",50,135);
        g.drawString("die het resultaat van compilatie van een programma is.",50,150);
        g.drawString("4: JVM bootst een computer na.", 50,165);
        g.drawString("5: Met de methode <drawRect>.",50,180);
        g.drawString("6: Met de methodes <drawRoundRec>,<drawOval>",50,195);
        g.drawString("en <drawArc>.",50,210);
        g.drawString("7: Omdat je met <paint()> in de Applet kunt tekenen.",50,225);
    }
}
