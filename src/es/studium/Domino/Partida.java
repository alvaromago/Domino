package es.studium.Domino;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Partida extends Frame
{
	private static final long serialVersionUID = 1L;
	
	String jugador1, jugador2, jugador3, jugador4;
	Image tablero;
	Toolkit herramienta;
	
	Partida()
	{
		setTitle("Jugando...");
		setSize(1000, 600);
		setBackground(new Color(171, 139, 98));
		herramienta = getToolkit();
		tablero = herramienta.getImage("Tablero.jpg");
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);
	}
	
	public void paint(Graphics g)
	{
		g.drawImage(tablero, 125, 107, 750, 400, this);
	}
}
