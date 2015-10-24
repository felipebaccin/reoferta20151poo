package br.univel.custompanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Fundo extends JPanel {

	public Fundo() {
		setBackground(Color.WHITE);
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLACK);
		g2.fillRect(0, 0, getWidth()-1, 30);
		g2.setColor(Color.YELLOW);
		g2.fillRect(60, 60,60, getHeight()-1 );
	}

}
