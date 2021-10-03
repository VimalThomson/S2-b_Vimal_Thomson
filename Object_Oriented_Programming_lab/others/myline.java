import java.awt.*;
import java.applet.*;
public class myline extends Applet
{
public void paint(Graphics g)
{
g.drawLine(100,100,250, 150);
g.drawLine(120,150,150,100);
g.setColor(Color.blue);
g.drawOval(200,225,150,160);
g.setColor(Color.red);
g.drawRect(300,250,200,250);
}
}