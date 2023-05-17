package es.studium.Domino;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class MenuPrincipal extends Frame
{
	private static final long serialVersionUID = 1L;
	
	Image fondo, nuevaPartida, ayuda, ranking;
	Toolkit herramienta;
	
	public MenuPrincipal()
	{
		setTitle("Domin�");
		setSize(1000, 600);
		// Activamos la herramienta
		herramienta = getToolkit();
		fondo = herramienta.getImage("Inicio.jpg");
		nuevaPartida = herramienta.getImage("");
		ranking = herramienta.getImage("");
		ayuda = herramienta.getImage("");
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		// Dibujar el fondo
		g.drawImage(fondo, 0, 0, 1000, 600, this);
		// Dibujar botones
		Color color = new Color(181, 230, 29);
		g.setColor(color);
		g.drawRect(400, 150, 225, 65);
		g.drawRect(400, 270, 225, 65);
		g.drawRect(400, 390, 225, 65);
	}
}
