import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class salaryofthree extends Applet implements ActionListener 
{
public int per =0;
Label l1 = new Label("enter monthly salary of employee : ");
 Label l2 = new Label("yearly salary of employee: ");
 
 TextField t1 = new TextField(10);
 TextField t2 = new TextField(10);

 Button b1 = new Button("CALCULATE SALARY");
 
 public salaryofthree()
 {
 l1.setBounds(50, 100, 280, 20);
 l2.setBounds(50, 150, 280, 20);

 t1.setBounds(200, 100, 300, 20);
 t2.setBounds(200, 150, 300, 20);
 
 b1.setBounds(200,400, 200, 20);
 GridLayout g1 = new GridLayout(20, 2, 5, 5);
 setLayout(g1);
 add(l1);
 add(t1);
 add(l2);
 add(t2);

 add(b1); 
 b1.addActionListener(this);
 }
@Override
public void actionPerformed(ActionEvent e) {

int m1 = Integer.parseInt(t1.getText());

 
 if(e.getSource()==b1)
 {
 int add=m1;
 per=add*12;
 t2.setText(String.valueOf(per)+" ");
 
 repaint();
 }
 
}
public void paint(Graphics g)
 {
if(per>=500000)
{
g.setColor(Color.yellow);
g.drawOval(100, 700, 150, 150);
g.fillOval(100, 700, 150, 150);
g.setColor(Color.BLACK);
g.fillOval(120, 740, 15, 15);
g.fillOval(170, 740, 15, 15);
g.drawArc(130, 800, 50, 20, 180, 180);
}
else if(per>0 && per<500000)
{
g.setColor(Color.yellow);
g.drawOval(100, 700, 150, 150);
g.fillOval(100, 700, 150, 150);
 g.setColor(Color.BLACK);
 g.fillOval(120, 740, 15, 15);
 g.fillOval(170, 740, 15, 15);
g.drawArc(130,820,50,20,0,180);
}
 }
public static void main(String args[]) {
 new salaryofthree();
 }
 
}