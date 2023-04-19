package es.studium.domino;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class MenuPrincipal extends Frame
{
	private static final long seriaVersionUTD = 1L;
	
	Image nuevaPartida, ayuda, ranking;
	Toolkit herramienta;
	
	public MenuPrincipal()
	{
		setTitle("Dominó");
		setSize(1100, 700);
		// Activamos la herramienta
		herramienta = getToolkit();
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		
	}
}
