package br.univel.custompanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Fundo extends JPanel {

	private static Color corCasa = Color.BLACK;
	
	public Fundo() {
		setBackground(Color.WHITE);
				
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		int largura = getWidth()/8;
		int autura = getHeight()/8;
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				g2.setColor(corCasa);
			//	g2.fillRect(i*50,j *50,larguraQuad,auturaQuad);
			}
		}
		
//		g2.setColor(Color.BLACK);
//		g2.fillRect(0, 0, getWidth()-1, 30);
//		g2.setColor(Color.YELLOW);
//		g2.fillRect(60, 60,60, getHeight()-1 );
	}

}
