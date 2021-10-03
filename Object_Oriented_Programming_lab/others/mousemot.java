import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
public class mousemot extends Frame implements MouseMotionListener
{
Label l;
Color c=Color.BLUE;
mousemot()
{
l=new Label();
l.setBounds(24,40,100,20);
add(l);
addMouseMotionListener(this);
setSize(400,400);
setLayout(null);
setVisible(true);
}
public void mouseDragged(MouseEvent e)
{
l.setText("X="+e.getX()+",Y= "+e.getY());
Graphics g=getGraphics();
g.setColor(Color.RED);
g.fillOval(e.getX(),e.getY(),20,20);
}
public void mouseMoved(MouseEvent e)
{
l.setText("X="+e.getX()+",Y= "+e.getY());
}
public static void main(String args[])
{
new mousemot();
}
}