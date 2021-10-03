import java.io.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


class frame1 extends Frame
{
	frame1(String title)
	{
		super(title);
		MyWindowAdapter ad=new MyWindowAdapter(this);
		addWindowListener(ad);
	}
	public void paint(Graphics g)
	{
		g.drawString("This is a frame Window",10,40);
	}
}

class MyWindowAdapter extends WindowAdapter
{
	frame1 f1;
	public MyWindowAdapter(frame1 f1)
	{
		this.f1=f1;
	}
	public void windowClosing(WindowEvent we)
	{
		f1.setVisible(false);
	}

}


public class bank extends Applet implements 
ActionListener,ItemListener
{

	Label customer,deposit,accno,widthdraw;
	TextField cust,dept,number,draw;
	TextArea t;
	Choice type;
	Checkbox yes,nu;
	CheckboxGroup te;
    private java.awt.Image image1;

	Frame f;

	Button b;

	public void init()
	{
        image1=getImage(getDocumentBase(),"bank.jpg");
		//setBackground(Color.yellow);
		//setForeground(Color.red);
        //setLayout(new FlowLayout());


		customer=new Label("CUSTOMER");
		deposit=new Label("DEPOSIT");
		accno=new Label("ACCOUNT NUMBER");
		widthdraw=new Label("WIDTHDRAW");

		cust=new TextField(20);
		dept=new TextField(20);
		number=new TextField(20);
		draw=new TextField(20);

		type=new Choice();
		type.add("FIXED");
		type.add("RD");
//		type.add("SECOND CLASS");

		te =new CheckboxGroup();
		yes=new Checkbox("Yes",te,false);
       		nu=new Checkbox("NO",te,false);


		t=new TextArea(40,45);

		b=new Button("submit");

		add(customer);
		add(cust);

		add(accno);
		add(number);

		add(deposit);
		add(dept);

		add(widthdraw);
		add(draw);

		add(type);
		add(b);

		add(yes);
		add(nu);

		add(t);

		b.addActionListener(this);
		type.addItemListener(this);
	}
    public void paint(Graphics g){
        g.drawImage(image1,0,0,this);
      }

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().equals("submit"))
		{
			t.setText("NAME: "+cust.getText()+"\nACCOUNT NUMBER : "+number.getText()+"\nDEPOSIT AMOUNT:"+dept.getText()+"\nTYPE OF ACCOUNT : "+type.getSelectedItem());
		}
	}

	public void itemStateChanged(ItemEvent ie)
        {

        }
}