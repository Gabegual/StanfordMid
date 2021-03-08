package meritMidterm;

import javax.swing.*;
import acm.graphics.*;
import acm.program.*;

public class Frogger extends JFrame {

	public Frogger() {
		Icon imgIcon = new ImageIcon(this.getClass().getResource("frogger.gif"));
		JLabel label = new JLabel(imgIcon);
		label.setSize(100, 100);
		this.getContentPane().add(label);
		setSize(150, 150);
		setVisible(true);
	}

	public static void main(String[] args){
			
			Frogger f1 = new Frogger();
			GCanvas back = new GCanvas();
			
			double X = back.getWidth();
			double Y = back.getHeight();
			
			setBounds(f1);
			f1.add(back);
			
	}

	public static void setBounds(Frogger f1) {
		f1.getWidth();
		f1.getHeight();
	}
}
