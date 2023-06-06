package es.studium.Domino;

import java.awt.Color;
import java.awt.Font;
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
		tablero = herramienta.getImage("./imagesMenus/Tablero.jpg");
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);
	}
	
	public void paint(Graphics g)
	{
		// Dibujamos el tablero
		g.drawImage(tablero, 125, 107, 750, 400, this);
		// Dibujamos el n�mero de turnos
		Font font = new Font("Arial", Font.BOLD, 25);
        g.setFont(font);
		g.drawString("Turno: ", 25, 70);
	}
}
