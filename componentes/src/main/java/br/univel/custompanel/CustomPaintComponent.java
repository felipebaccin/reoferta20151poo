package br.univel.custompanel;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class CustomPaintComponent {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {

			public void run() {

				JFrame janela = new JFrame();

				janela.setSize(640, 480);
				janela.setLocationRelativeTo(null);
				janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
				janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				janela.setContentPane(new Fundo());
				
				janela.setVisible(true);
			}
		});
	}
}
