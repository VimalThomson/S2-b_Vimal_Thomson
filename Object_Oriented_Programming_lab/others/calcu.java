import java.awt.*;
import java.awt.event.*;

class calc implement ActionListener
{
Frame f=new Frame();
Label l1= new Label("Enter Number");
Label l2= new Label("Enter Number");
Label l3= new Label("Result");
TextField t1=new TextField();
TextField t2=new TextField();
TextField t3=new TextField();
Button b1=new button("ADD");
Button b2=new button("SUB");
Button b3=new button("MUX");
Button b4=new button("DIV");

calc()
{
l1.setBounds(50,100,100,20);
l2.setBounds(50,150,100,20);
l3.setBounds(50,200,100,20);
t1.setBounds(200,100,100,20);
t2.setBounds(200,150,100,20);
t3.setBounds(200,200,100,20);
b1.setBounds(50,250,50,20);
b2.setBounds(110,250,50,20);
b3.setBounds(170,250,50,20);
b4.setBounds(250,250,50,20);
f.add(l1);
f.add(l2);
f.add(l3);
f.add(t1);
f.add(t2);
f.add(t3);
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
b1.addActionlistener(this);
b2.addActionlistener(this);
b3.addActionlistener(this);
b4.addActionlistener(this);
f.setLayout(null);
f.setVisible(true);
f.setSize(500,500);
}
public void actionPerformed(ActionEvent e)
{
int i=Integer.parseInt(t1.getText());
int j=Integer.parseInt(t2.getText());
if(e.getSource()==b1)
{
t3.setText(String.valueOf(i+j));
}
if(e.getSource()==b2)
{
t3.setText(String.valueOf(i-j));
}
if(e.getSource()==b3)
{
t3.setText(String.valueOf(i*j));
}
if(e.getSource()==b4)
{
t3.setText(String.valueOf(i/j));
}
}
public static void main(String args[])
{
new calc();
}
}