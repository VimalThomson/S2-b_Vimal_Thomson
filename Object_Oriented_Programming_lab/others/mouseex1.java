import java.awt.*;
import java.awt.event.*;
public class mouseex1 extends Frame implements MouseListener
{
mouseex1()
{
addMouseListener(this);

setSize(400,400);
setLayout(null);
setVisible(true);
}
public void mouseClicked(MouseEvent e)
{
Graphics g=getGraphics();
g.setColor(Color.BLUE);
g.fillOval(e.getX(),e.getY(),30,30);
}
public void mouseEntered(MouseEvent e)
{}
public void mouseExited(MouseEvent e)
{}
public void mousePressed(MouseEvent e)
{}
public void mouseReleased(MouseEvent e)
{}
public static void main(String args[])
{
new mouseex1();
}
}