import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class PieChart extends Applet implements MouseListener, Runnable {
	private Color pieColor = Color.WHITE;
	
	public void paint(Graphics g) {
		
		int Sci, Soc, Hum, Total;
		
		float PercSci, PercSoc, PercHum;
		
		int x = 50, y = 50, w = 100, h = 100;
		
		int startAngle = 0, degrees;
		
		Sci = 5;
		Soc = 6;
		Hum = 7;
		
		Total = Sci + Soc + Hum;
		
		PercSci = Sci * 100.0f / Total;
		PercSoc = Soc * 100.0f / Total;
		PercHum = Hum * 100.0f / Total;
	
		System.out.println("Total = " + Total);
		System.out.println("%Sci = " + PercSci);
		System.out.println("%Soc = " + PercSoc);
		System.out.println("%Hum = " + PercHum);
		
		degrees = (int) (PercSci*360/100);
		g.setColor(pieColor);
		g.fillArc(x, y, w, h, startAngle, degrees);

		startAngle = degrees;
		degrees = (int) (PercSoc*360/100);
		g.setColor(Color.yellow);
		g.fillArc(x, y, w, h, startAngle, degrees);
		

		startAngle = startAngle + degrees;
		degrees = (int) (PercHum*360/100);
		g.setColor(Color.green);
		g.fillArc(x, y, w, h, startAngle, degrees);
		
	}
		public void init() {
		this.setSize(200, 200);
		addMouseListener(this);
	}

	public void run() {
		while (true) {
			repaint();
			try {
				Thread.sleep(17);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void mouseClicked(MouseEvent e) {
		int x = e.getX(), y = e.getY();
		if (x >= 200 && x <= 250 && y >= 200 && y <= 350)
			pieColor = Color.RED;
		else
			pieColor = Color.BLUE;
		repaint();
		System.out.println("Mouse Position : X=" + x + " Y=" + y + "");

	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

}