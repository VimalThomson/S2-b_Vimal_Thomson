import java.awt.*;
import java.awt.event.*;
public class mouseex extends Frame implements MouseListener
{
Label l1;
mouseex()
{
addMouseListener(this);
l=new Label();
l.setBounds(20,50,100,20);
add(l);
setSize(400,400);
setLayot(null);
setVisible();
}
public void mouseClicked(MouseEvent e)
{
l.setText("Mouse clicked");
}
public void mouseEntered(mouseEvent e)
{
l.setText("Mouse Entered");
}
public void mouseExited(mouseEvent e)
{
l.setText("Mouse Exited");
}
public void mousePressed(mouseEvent e)
{
l.setText("Mouse Pressed");
}
public void mouseReleased(mouseEvent e)
{
l.setText("Mouse Released");
}
public static void main(String args[])
{
new mouseex();
}
}